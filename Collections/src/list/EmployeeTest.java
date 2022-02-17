package list;

import java.util.Set;
import java.util.TreeSet;

public class EmployeeTest {
	public static void main(String[] args) {
//		Set<Employee> set = new TreeSet<Employee>();
		Set<Employee> set = new TreeSet<Employee>(new EmployeeNameComparator());
		set.add(new Employee(200, "doge"));
		set.add(new Employee(290, "cate"));
		set.add(new Employee(301, "fishe"));
		set.add(new Employee(100, "monke"));
		
		for (Employee employee : set) {
			System.out.println(employee.id + employee.name);
		}
	}
}
