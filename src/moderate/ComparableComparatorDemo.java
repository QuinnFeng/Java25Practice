package moderate;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparableComparatorDemo {

    // ========================================
    // Student class
    // ========================================

    static class Student implements Comparable<Student> {

        private String name;
        private int age;
        private double gpa;

        public Student(String name, int age, double gpa) {
            this.name = name;
            this.age = age;
            this.gpa = gpa;
        }

        public String getName() {
            return name;
        }

        public int getAge() {
            return age;
        }

        public double getGpa() {
            return gpa;
        }

        // ========================================
        // Comparable
        // ========================================
        // Natural ordering: sort by age in ascending order

        @Override
        public int compareTo(Student other) {
            return Integer.compare(this.age, other.age);
        }

        @Override
        public String toString() {
            return name + " - Age: " + age + ", GPA: " + gpa;
        }
    }


    public static void main(String[] args) {

        List<Student> students = new ArrayList<>();

        students.add(new Student("Ken", 29, 3.5));
        students.add(new Student("Alice", 22, 3.9));
        students.add(new Student("John", 25, 3.2));
        students.add(new Student("Bob", 21, 3.7));


        // ========================================
        // 1. Comparable
        // ========================================
        // Uses Student's compareTo() method.
        // Natural ordering = age

        Collections.sort(students);

        System.out.println("Sorted by age:");

        for (Student student : students) {
            System.out.println(student);
        }


        // ========================================
        // 2. Comparator
        // ========================================
        // Sort by name instead

        Comparator<Student> byName =
                (student1, student2) ->
                    student1.getName().compareTo(student2.getName());

        students.sort(byName);

        System.out.println("\nSorted by name:");

        for (Student student : students) {
            System.out.println(student);
        }


        // ========================================
        // 3. Comparator
        // ========================================
        // Sort by GPA

        Comparator<Student> byGpa =
                (student1, student2) ->
                    Double.compare(student1.getGpa(), student2.getGpa());

        students.sort(byGpa);

        System.out.println("\nSorted by GPA:");

        for (Student student : students) {
            System.out.println(student);
        }


        // ========================================
        // 4. Comparator with reversed()
        // ========================================

        students.sort(byGpa.reversed());

        System.out.println("\nSorted by GPA descending:");

        for (Student student : students) {
            System.out.println(student);
        }
    }
}