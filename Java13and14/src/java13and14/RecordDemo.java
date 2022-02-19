package java13and14;

public class RecordDemo {
	record Employee(String name, int sal) {}

	public static void main(String[] args) {
		Employee employee = new Employee("Doge", 123);
		System.out.println(employee);
		System.out.println(employee.name());
		System.out.println(employee.sal());
		System.out.println(employee.hashCode());
		
		Employee e2 = new Employee("Doge", 123);
		System.out.println(e2.hashCode());
		
		Employee e3 = new Employee("Cate", 456);
		System.out.println(e3.hashCode());
	}
}
