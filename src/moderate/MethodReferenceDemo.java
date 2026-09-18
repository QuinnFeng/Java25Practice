package moderate;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Function;

public class MethodReferenceDemo {

    static class Student {

        private String name;
        private int age;

        public Student(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public String getName() {
            return name;
        }

        public int getAge() {
            return age;
        }

        @Override
        public String toString() {
            return name + " - Age: " + age;
        }
    }

    public static void main(String[] args) {

        List<Student> students = new ArrayList<>();

        students.add(new Student("Ken", 29));
        students.add(new Student("Alice", 22));
        students.add(new Student("John", 25));

        // Lambda
        students.sort(
            Comparator.comparingInt(student -> student.getAge())
        );

        System.out.println("Age ascending:");
        System.out.println(students);

        // Method reference
        students.sort(
            Comparator.comparingInt(Student::getAge)
        );

        System.out.println("Age ascending:");
        System.out.println(students);

        // Method reference + reversed
        students.sort(
            Comparator.comparingInt(Student::getAge).reversed()
        );

        System.out.println("Age descending:");
        System.out.println(students);

        // Another method reference example
        Function<String, Integer> getLength =
                String::length;

        System.out.println("Length: " + getLength.apply("Hello"));
    }
}