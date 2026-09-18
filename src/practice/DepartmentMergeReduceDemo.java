package practice;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.function.BinaryOperator;
import java.util.stream.Collectors;

public class DepartmentMergeReduceDemo {

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
			return "{ department: " + department + ", name: " + name + ", id: " + id + " }";
		}
	}

	public static void main(String[] args) {

		List<Employee> company = new ArrayList<>();

		company.add(new Employee("IT", "Pravin", null));
		company.add(new Employee("IT", null, 101));
		company.add(new Employee("Operation", "Ram", null));
		company.add(new Employee("Operation", null, 102));

		company.sort(Comparator.comparing(Employee::getDepartment));

		List<Employee> newCompany = company.stream().reduce(new ArrayList<>(),

				(result, employee) -> {

					if (!result.isEmpty()
							&& result.get(result.size() - 1).getDepartment().equals(employee.getDepartment())) {

						Employee existing = result.get(result.size() - 1);

						if (employee.getName() != null) {
							existing.setName(employee.getName());
						}

						if (employee.getId() != null) {
							existing.setId(employee.getId());
						}

					} else {
						result.add(employee);
					}

					return result;
				},

				(result1, result2) -> {
					result1.addAll(result2);
					return result1;
				});

		for (Employee employee : newCompany) {
			System.out.println(employee);
		}
		
//		  BinaryOperator<Employee> merge = (first, second) -> {
//
//	            if (second.getName() != null) {
//	                first.setName(second.getName());
//	            }
//
//	            if (second.getId() != null) {
//	                first.setId(second.getId());
//	            }
//
//	            return first;
//	        };
//
//	        Map<String, Employee> merged = company.stream()
//	                .collect(Collectors.toMap(
//	                        Employee::getDepartment,
//	                        employee -> employee,
//	                        merge
//	                ));
//
//	        List<Employee> nCompany =
//	                new ArrayList<>(merged.values());
//
//	        nCompany.forEach(System.out::println);
	        
	        Map<String, List<Employee>> grouped =
	                company.stream()
	                        .collect(Collectors.groupingBy(
	                                Employee::getDepartment
	                        ));

	        List<Employee> kCompany = grouped.values()
	                .stream()
	                .map(employees -> {

	                    Employee merged = new Employee(
	                            employees.get(0).getDepartment(),
	                            null,
	                            null
	                    );

	                    for (Employee employee : employees) {

	                        if (employee.getName() != null) {
	                            merged.setName(employee.getName());
	                        }

	                        if (employee.getId() != null) {
	                            merged.setId(employee.getId());
	                        }
	                    }

	                    return merged;
	                })
	                .collect(Collectors.toList());
	        kCompany.forEach(System.out::println);
	    
	}
}