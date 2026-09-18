package moderate;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StreamDemo {

    static class Student {

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

        // Filter students older than 22
        List<Student> olderStudents =
                students.stream()
                        .filter(student -> student.getAge() > 22)
                        .collect(Collectors.toList());

        System.out.println("Older students:");
        System.out.println(olderStudents);

        // Get only student names
        List<String> names =
                students.stream()
                        .map(Student::getName)
                        .collect(Collectors.toList());

        System.out.println("Names:");
        System.out.println(names);

        // Sort by GPA
        List<Student> sortedStudents =
                students.stream()
                        .sorted(Comparator.comparingDouble(Student::getGpa))
                        .collect(Collectors.toList());

        System.out.println("Students sorted by GPA:");
        System.out.println(sortedStudents);

        // Count students with GPA >= 3.5
        long count =
                students.stream()
                        .filter(student -> student.getGpa() >= 3.5)
                        .count();

        System.out.println("GPA >= 3.5: " + count);
    }
}