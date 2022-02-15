package NonStatic;

public class NonStaticMembersDemo {
	int num;
	
	NonStaticMembersDemo() {
		System.out.println("Inside the constructor");
	}
	
	{
		System.out.println("Inside the non static block");
	}
	
	static {
		System.out.println("Inside static block");
	}
	
	public static void main(String[] args) {
		System.out.println("Inside the main method");
		new NonStaticMembersDemo();
		new NonStaticMembersDemo();
		new NonStaticMembersDemo();
	}
}	
