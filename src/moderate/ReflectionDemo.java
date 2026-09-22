package moderate;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class ReflectionDemo {

    static class Student {

        private String name;
        private int age;

        public Student() {
            this.name = "Unknown";
            this.age = 0;
        }

        public Student(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public void introduce() {
            System.out.println(
                    "My name is " + name + ", age " + age
            );
        }

        public String getName() {
            return name;
        }

        private void secretMethod() {
            System.out.println("This is a private method.");
        }
    }

    public static void main(String[] args) {

        Student student = new Student("Ken", 29);

        // --------------------------------------------------
        // 1. Get the Class object
        // --------------------------------------------------

        Class<?> clazz = student.getClass();

        System.out.println("Class name:");
        System.out.println(clazz.getName());

        System.out.println("\nSimple class name:");
        System.out.println(clazz.getSimpleName());


        // --------------------------------------------------
        // 2. Inspect fields
        // --------------------------------------------------

        System.out.println("\nDeclared fields:");

        Field[] fields = clazz.getDeclaredFields();

        for (Field field : fields) {
            System.out.println(
                    field.getName()
                    + " : "
                    + field.getType().getSimpleName()
            );
        }


        // --------------------------------------------------
        // 3. Inspect methods
        // --------------------------------------------------

        System.out.println("\nDeclared methods:");

        Method[] methods = clazz.getDeclaredMethods();

        for (Method method : methods) {
            System.out.println(
                    method.getName()
                    + " : returns "
                    + method.getReturnType().getSimpleName()
            );
        }


        // --------------------------------------------------
        // 4. Inspect constructors
        // --------------------------------------------------

        System.out.println("\nDeclared constructors:");

        Constructor<?>[] constructors =
                clazz.getDeclaredConstructors();

        for (Constructor<?> constructor : constructors) {
            System.out.println(constructor);
        }


        // --------------------------------------------------
        // 5. Invoke a public method
        // --------------------------------------------------

        try {
            Method introduceMethod =
                    clazz.getMethod("introduce");

            introduceMethod.invoke(student);

        } catch (Exception e) {
            e.printStackTrace();
        }


        // --------------------------------------------------
        // 6. Access a private field
        // --------------------------------------------------

        try {
            Field nameField =
                    clazz.getDeclaredField("name");

            nameField.setAccessible(true);

            System.out.println("\nPrivate field value:");
            System.out.println(nameField.get(student));

            nameField.set(student, "Alex");

            System.out.println("After changing field:");
            System.out.println(nameField.get(student));

        } catch (Exception e) {
            e.printStackTrace();
        }


        // --------------------------------------------------
        // 7. Invoke a private method
        // --------------------------------------------------

        try {
            Method secretMethod =
                    clazz.getDeclaredMethod("secretMethod");

            secretMethod.setAccessible(true);

            System.out.println("\nInvoking private method:");
            secretMethod.invoke(student);

        } catch (Exception e) {
            e.printStackTrace();
        }


        // --------------------------------------------------
        // 8. Create an object using reflection
        // --------------------------------------------------

        try {
            Constructor<Student> constructor =
                    Student.class.getConstructor(
                            String.class,
                            int.class
                    );

            Student newStudent =
                    constructor.newInstance("Alice", 25);

            System.out.println("\nObject created using reflection:");
            newStudent.introduce();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}