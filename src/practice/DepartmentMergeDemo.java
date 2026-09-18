package practice;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class DepartmentMergeDemo {

    static class Employee {

        private String department;
        private String name;
        private Integer id;

        public Employee(String department, String name, Integer id) {
            this.department = department;
            this.name = name;
            this.id = id;
        }

        public String getDepartment() {
            return department;
        }

        public String getName() {
            return name;
        }

        public Integer getId() {
            return id;
        }

        public void setName(String name) {
            this.name = name;
        }

        public void setId(Integer id) {
            this.id = id;
        }

        @Override
        public String toString() {
            return "{ department: " + department
                    + ", name: " + name
                    + ", id: " + id + " }";
        }
    }

    public static void main(String[] args) {

        List<Employee> company = new ArrayList<>();

        company.add(new Employee("IT", "Pravin", null));
        company.add(new Employee("IT", null, 101));
        company.add(new Employee("Operation", "Ram", null));
        company.add(new Employee("Operation", null, 102));

        // Sort by department
        company.sort(
            Comparator.comparing(Employee::getDepartment)
        );

        List<Employee> newCompany = new ArrayList<>();

        int i = 1;
        Employee left = company.get(0);

        while (i < company.size()) {

            Employee right = company.get(i);

            while (i < company.size()
                    && left.getDepartment().equals(right.getDepartment())) {

                // Merge missing information
                if (right.getName() != null) {
                    left.setName(right.getName());
                }

                if (right.getId() != null) {
                    left.setId(right.getId());
                }

                i++;

                if (i < company.size()) {
                    right = company.get(i);
                }
            }

            newCompany.add(left);

            left = right;
            i++;
        }

        for (Employee employee : newCompany) {
            System.out.println(employee);
        }
    }
}