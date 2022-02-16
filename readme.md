# Core Java Made Easy

[Core Java Made Easy](https://www.udemy.com/course/corejavamadeeasy/)

- [Core Java Made Easy](#core-java-made-easy)
  - [Introduction to Java](#introduction-to-java)
      - [Object Oriented Programming](#object-oriented-programming)
      - [Static and Non Static Context](#static-and-non-static-context)
  - [Data Types](#data-types)
  - [Wrapper Classes](#wrapper-classes)
  - [Operators](#operators)
  - [Access Modifiers](#access-modifiers)
  - [Inheritance](#inheritance)
      - [Constructor chaining](#constructor-chaining)
  - [Abstraction](#abstraction)
      - [Abstract Class](#abstract-class)
      - [Interface](#interface)
      - [Final](#final)
  - [Polymorphism](#polymorphism)
      - [Object Casting](#object-casting)
  - [Encapsulation](#encapsulation)
  - [Exceptions](#exceptions)
  - [Multithreading](#multithreading)
      - [Synchronization](#synchronization)
      - [InterThread Communication](#interthread-communication)
  - [Executor Framework](#executor-framework)
      - [Callable](#callable)
  - [Garbage Collection](#garbage-collection)

## Introduction to Java

The JDK comes with the Java compiler and the JRE. The Java compiler converts source code into byte code which is then run by the JVM. This gives Java platform independency. The JRE in turn has JVM which converts byte code into machine code .It also comes with a set of predefined APIs and libraries. JRE provides the environment for a Java compiled byte code to run. JVM uses JIT compiler to perform work efficiently.

#### Object Oriented Programming

Java With OOP, it is easy to map real world problems to software solutions. OOP has 4 principles: Encapsulation, Inheritance, Abstraction, and Polymorphism. We implement these principles through classes and objects.

**Encapsulation** is about protecting the properties and functionalities of an object from other objects. It also allows us to write both data and functionality through a _class_.

**Inheritance** is the process of defining a new object with the help of an existing object. We use _extends_ in Java to inherit. The two important things in inheritance are _accessing existing objects functionality_ and _updating existing objects functionality_. We also use the term _IS A_ to refer to inheritance.

**Abstraction** is the principle of hiding the unnecessary details of an object, and only showing the necessary details that are needed by other objects to communicate with that object. In Java we issue abstractions through an _interface_.

An object has the qualities of **Polymorphism** if it can behave in different ways. In Java, we achieve polymorphism through _overloading and overriding_.

#### Static and Non Static Context

Static are also known as class-level context while Non Static are object-level. Code inside a static block will be executed once by the JVM when the class is loaded even before the main method is called. To access static members, we need to use the class name. Memory is allocated and variables are initialized during class loading.

```java
public class StaticMethodsDemo {
	public static void main(String[] args) {
		System.out.println("inside main");
		StaticMethodsDemo.method1();
	}

	static void method1() {
		System.out.println("Inside static method");
	}

	static {
		System.out.println("Inside static block");
		StaticMethodsDemo.method1();
	}
}
```

```
Inside static block
Inside static method
inside main
Inside static method
```

Any functionality that is specific to a particular object of a class should be defined as Non-Static members. This means that values will be specific to a particular object of a class. A non-static block is executed by the JVM everytime we create an object before the constructor is invoked. Memory is allocated and variables are initialized on object creation.

```java
public class NonStaticMembersDemo {
	int num;

	NonStaticMembersDemo() {
		System.out.println("Inside the constructor");
	}

	{
		System.out.println("Inside the non static block");
	}

	public static void main(String[] args) {
		System.out.println("Inside the main method");
		new NonStaticMembersDemo();
    new NonStaticMembersDemo();
	}


}
```

```
Inside static block
Inside the main method
Inside the non static block
Inside the constructor
Inside the non static block
Inside the constructor
Inside the non static block
Inside the constructor
```

## Data Types

Data types tell what kind of data a value can carry. Under primitive types we have byte, short, int, long, char, float, double, boolean. For reference types, we have class, arrays, strings etc. We can convert one type to another type with Type Casting. Implicit type casting happens automatically, while for Explicit type casting we need to specify manually.

Primitive implicit type casting happens when converting from a lower data type to a higher one, for example, byte->int. Primitive explicit type casting happens the other way around such as byte->int.

Reference implicit type casting happens when a child class object is assigned to a parent class object while explicit is the other way around.

## Wrapper Classes

Wrapper classes help us primitive types to object types which is called boxing. We can also do the reverse which is called unboxing. We mainly use Wrapper CLasses with Collections API since collection classes only work with object types. Each primitive type has a corresponding class (int->Integer). We can also convert from primitive to spring and vice versa.

```java
public class PrimitiveAndObject {
  public static void main(String[] args) {
    int x = 100;
    Integer y = Integer.valueOf(x);
    int z = y.intValue();
  }
}

public class PrimitiveAndString {
  public static void main(String[] args) {
    byte x = 100;
    String s = Byte.toString(x);
    byte y = Byte.parseByte(s);
  }
}
```

## Operators

The ++ and -- operators represent increment and decrement. There are two types: Pre increment and Post increment.

```java
public class UnaryOperators {

	public static void main(String[] args) {
		int x = 10;
		int y = ++x;

		int a = 10;
		int b = a++;

		System.out.println(x);
		System.out.println(y);
		System.out.println("----");
		System.out.println(a);
		System.out.println(b);
	}
}
```

```
11
11
----
11
10
```

The equality operators == != can be used with primitives and objects as well. In the case of object, it will check if two objects point to the same reference in memory. Bitwise operators & | ^ can be applied to boolean and integer types. The bitwise unary complement ~ will flip all the bits of a binary representation of an integer.

Short circuit operators represented by && || can only be applied to boolean arguments. This operator checks only the first boolean value, if it is false for &&, it will return false immediately and won't check for the value of the second boolean. The same happens for ||, if the first value is true then it will immediately return true. This results in improved performance.

The = assignment operator will assign the value on the right hand to the variable on the left hand side. If it is an object, the memory location of the object will be assigned to the reference variable.

## Access Modifiers

Java supports access permissions at different levels such as class, variables, methods, constructor. The levels of access are private, package, protected and public. **Package** access level is used when no keywords are used and is accessible by any class within the same package. **Private** can only be accessed from within the class. **Protected** can be accessed by any class from within the same package, and also from other packages that extends the class. **Public** can be accessed anywhere.

## Inheritance

Every class implicity extends the superclass **java.lang.Object**, which is a type of Single Inheritance. Inheritance allows child objects to access parent methods. In this case, the Parent implicitly extends Object, and the Child extends Parent. The Child class has access to Parent methods and Object methods as well. When the Child object is instantiated, the JVM automatically instantiates its Parent class first before the Child class. In this case, since no constructor was defined, the JVM uses the default constructor.

```java
public class Parent {
	void f1() {
		System.out.println("Inside parent f1");
	}
}

public class Child extends Parent {
	void f2() {
		System.out.println("inside Child f2");
	}
}

public class MultilevelTest {
	public static void main(String[] args) {
		Child c = new Child();
		c.f1();
		c.f2();
		c.hashCode();
	}
}
```

We can override a parent class methods by having a child with the same method name. We can access the parent's method of the same name using the **super** keyword. The **super()** method is used in the constructor to invoke the parent's constructor.

```java
public class Parent {
	int a, b;

	Parent(int a, int b) {
		this.a = a;
		this.b = b;
	}

	void f1() {
		System.out.println("Inside parent f1");
	}
}

public class Child extends Parent {
	int c,d;

	Child(int a, int b, int c, int d) {
		super(a,b);
		this.c = c;
		this.d = d;
	}

	void f1() {
		super.f1();
		System.out.println("Inside child f1");
	}
}

public class Test {
	public static void main(String[] args) {
		Child c = new Child(10,20,30,40);
		c.f1();
	}
}
```

#### Constructor chaining

Constructor chaining is the concept where using the super method and this method we can access more than 1 constructor of the child and the parent in a single object creation. In this case, the main method will first call the ChildClass default constructor method which will in turn invoke the constructor of the ChildClass with argument x=10, which in turn will invoke the SuperClass constructor, which will invoke its own constructor with an argument, which will then finally invoke the constructor without an argument.

```java
public class SuperClass {
	int x;
	public SuperClass() {
		System.out.println("NO ARG SUPERCLASS CONSTRUCTOR");
	}
	public SuperClass(int x) {
		this();
		this.x = x;
		System.out.println("1 ARG SUPERCLASS CONSTRUCTOR");
	}
}

public class ChildClass extends SuperClass{
	public ChildClass() {
		this(10);
		System.out.println("NO ARG CHILDCLASS CONSTRUCTOR");
	}

	public ChildClass(int x) {
		super(x);
		System.out.println("1 ARG CHILDCLASS CONSTRUCTOR");
	}

	public static void main(String[] args) {
		ChildClass c = new ChildClass();
	}
}
```

```
NO ARG SUPERCLASS CONSTRUCTOR
1 ARG SUPERCLASS CONSTRUCTOR
1 ARG CHILDCLASS CONSTRUCTOR
NO ARG CHILDCLASS CONSTRUCTOR
```

When we use the final keyword on a method, the child classes can only inherit and not override that method.

```java
	protected final void work() {
		System.out.println("COMMON WORK FOR EVERYONE");
	}
```

## Abstraction

Abstraction hides the details of the underlying object being used from the object using it. We can implement partial abstraction through abstract classes and complete abstraction through interfaces. We use the keyword **abstract** to mark a class or method as abstract, and once we mark a class as abstract, we cannot create instances of it.

#### Abstract Class

In this sample, we create the abstract class BMW. The abstract method accelerate will be up to do subclass' implementation.

```java
public abstract class BMW {
	void commonFunc() {
		System.out.println("Inside commonFunc method");
	}

	abstract void accelerate();
}
```

The subclass should implement all the abstract methods in the abstract class. If we don't provide an implementation, we should mark the class as abstract also. We cannot mark an abstract class as final, since we cannot inherit from a final class. Abstract methods cannot be marked as static because we need to define their implementations in other methods.

```java
public class ThreeSeries extends BMW {
	@Override
	void accelerate() {
		System.out.println("Inside 3 Series accelerate");
	}
}

public class FiveSeries extends BMW {
	@Override
	void accelerate() {
		System.out.println("Inside 5 series accelerate");
	}
}

public class Test {
	public static void main(String[] args) {
		ThreeSeries three = new ThreeSeries();
		FiveSeries five = new FiveSeries();
		three.accelerate();
		three.commonFunc();
		five.accelerate();
		five.commonFunc();
	}
}
```

```
Inside 3 Series accelerate
Inside commonFunc method
Inside 5 series accelerate
Inside commonFunc method
```

#### Interface

The compiler automatically marks all methods in an interface as public and abstract.

```java
public interface Car {
	void go();
	void stop();
}

public class Honda implements Car{
	@Override
	public void go() {
		System.out.println("Inside Honda GO");
	}

	@Override
	public void stop() {
		System.out.println("Inside Honda stop");
	}
}
```

A Marker Interface is an interface without any methods. Examples of Marker Interface are Serializable, Cloneablew, RandomAccess.

The key difference between an interface and abstract class is that in interfaces, all methods are abstract whereas in abstract class is a partial implementation and can have at least 1 abstract method. In an interface, variables are public static and final, and variables should be initialized when they are defined. Abstract classes can define blocks and also can have constructors.

Aside from complete abstraction, interfaces also provides the advantage of multiple inheritance in that a class can implement multiple interfaces.

#### Final

When we mark a class as final, it cannot be extended or inherited. A final object or variable's reference and value cannot be changed. The only where we can assign the value of a final variable is at the constructor method or at object creation. A final method cannot be overriden in a child class.

## Polymorphism

Polymorphism means that an object can behave differently when communicating between different objects. The two types of polymorphism in Java are **Compile Time** or Static Binding and **Runtime** or Dynamic Binding. We achieve Compile Time polymorphism through _method overloading_. The compiler selects which specific method should be executed by the JVM depending on the parameters passed.

```java
public class CompileTimeBinding {
	void add(int a, int b) {
		int result = a + b;
		System.out.println(result);
	}

	void add(int a, int b, int c) {
		int result = a + b + c;
		System.out.println(result);
	}

	void add(float a, float b) {
		float result = a + b;
		System.out.println(result);
	}

	public static void main(String[] args) {
		CompileTimeBinding obj = new CompileTimeBinding();
		obj.add(5.2f, 1.2f);
		obj.add(1, 2, 3);
		obj.add(0, 1);
	}
}
```

```
6.3999996
6
1
```

Runtime polymorphism on the other hand is achieved through _method overriding_. It is also the process of holding the child class reference using the parent class variable and accessing child functionalities using the parent class reference.

```java
public class Macbook {
	void start() {
		System.out.println("Inside Macbook Start");
	}

	void shutdown() {
		System.out.println("Inside Macbook shutdown");
	}
}

public class MacbookPro extends Macbook{
	@Override
	void start() {
		System.out.println("MacbookPro start");
	}

	@Override
	void shutdown() {
		System.out.println("MacbookPro shutdown");
	}

  public void proMethod() {
		System.out.println("Macbook Pro advanced feature");
	}
}

public class MacbookAir extends Macbook{
	@Override
	void start() {
		System.out.println("MacbookAir start");
	}

	@Override
	void shutdown() {
		System.out.println("MacbookAir shutdown");
	}
}

public class Test {
	public static void main(String[] args) {
		Macbook m1 = new MacbookPro();
		Macbook m2 = new MacbookAir();

		m1.start();
		m2.start();
		m1.shutdown();
		m2.shutdown();
	}
}
```

```
MacbookPro start
MacbookAir start
MacbookPro shutdown
MacbookAir shutdown
```

#### Object Casting

Upcasting happens when a child object is casted into a parent class. This is done automatically by the JVM. Downcasting on the other hand has to be done explicitly. In this case, we convert m1 AppleLaptop interface into a MacbookPro. The main advantage of downcasting is that it allows us to invoke behaviors that are specific to the child class, in this case proMethod().

```java
public class Test {
	public static void main(String[] args) {
    // upcasting
		AppleLaptop m1 = new MacbookPro();
		AppleLaptop m2 = new MacbookAir();

    // downcasting
		MacbookPro m3 = (MacbookPro) m1;
		m3.proMethod();

}

```

## Encapsulation

Encapsulation is the process of binding the methods and properties together so that only those methods can access those properties. We define accessor methods using getters and setters. This brings security and maintainability for our code.

```java
public class Customer {
	private String firstName;
	private String lastName;
	private String creditCard;

	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getCreditCard() {
		return creditCard;
	}
	public void setCreditCard(String creditCard) {
		this.creditCard = creditCard;
	}
}
```

## Exceptions

There are three types of error: Compile Time Errors, Logical Errors, and Runtime Errors. **Compile Time Errors** happen when there are symbols that could not be found, incompatible types, invalid declarations and using _this_ inside a static context. **Logical Errors** happens when the code outputs unexpected results. **Runtime Errors** or exceptions will cause our program to terminate abruptly. This is often accompanied by error messages.

In Java, an **Exception** is a class which the JVM creates and throws. All Exceptions and Error inherit from a parent class **Throwable** from java.lang. All exceptions that inherit from RuntimeException are called _unchecked exceptions_. To handle Exceptions, we can use try catch throw finally throws.

We can handle multiple exceptions using multiple catch blocks. Aside from this, we can also use the parent **RuntimeException** to handle all children exceptions.

```java
public class MultiCatch {
	public static void main(String[] args) {
		try {
			String input = args[0];
			System.out.println("Input is " + input);
			int output = Integer.parseInt(input);
			System.out.println("Output is" + output);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println(e);
		} catch (NumberFormatException e) {
			System.out.println(e);
		}
	}
}
```

The finally block can be used at the end of the try catch. The code in the finally block will be executed always regardless if there is an error or none. This will be a good place for writing JDBC connections.

```java
public class Division {
	public static void main(String[] args) {
		int a, b, c;

		try {
			System.out.println("Enter two integers");
			Scanner obj = new Scanner(System.in);
			a = obj.nextInt();
			b = obj.nextInt();
			c = a / b;
			System.out.println(c);
		} finally {
			System.out.println("Inside Finally");
		}
		System.out.println("More code here");
	}
}
```

```
Enter two integers
5
0
java.lang.ArithmeticException: / by zero
Inside Finally
More code here
```

When we use the **throws** keyword, it means that the object calling the method will be the one responsinble for handling exceptions. In this case, the main method will be the one to handle the exception

```java
public class CheckedException {
	void readFile() throws FileNotFoundException {
		FileInputStream fis = new FileInputStream("");
	}

	public static void main(String[] args) {
		CheckedException ce = new CheckedException();
		try {
			ce.readFile();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
}
```

We can create and throw our own custom exceptions, both checked and unchecked. We can write our constructors with it too.

```java
public class UncheckedCustomException extends RuntimeException {
	UncheckedCustomException(String message) {
		super(message);
	}
}

public class CheckedCustomException extends Exception{
	CheckedCustomException(String message) {
		super(message);
	}
}

public class Test {
	public static void main(String[] args) throws CheckedCustomException {
//		throw new UncheckedCustomException("CUSTOM ERROR MESSAGE HERE");
		throw new CheckedCustomException("CUSTOM EXCEPTION THAT NEEDS TO BE HANDLED");
	}
}
```

Assertions are introduced in Java 1.4. An AssertionError from java.lang.Error will be thrown if an assert expression results to false. Assertions are disabled by default at runtime, and to enable, we need the `java -ea MyClass` flag to enable assertions. Assertions are typically used for testing.

```java
public class AssertionsDemo {
	public static void main(String[] args) {
		int withdraw = 100;
		int balance = 50;

		assert (withdraw <= balance) : "amount to be withdrawed is more than the balance";
	}
}
```

## Multithreading

The main method is the first thread that the JVM creates. For the single threaded example below, the numbers 1-200 will be printed for i first, and then for j.

```java
public class SingleThreaded {
	public static void main(String[] args) {

		SingleThreaded st = new SingleThreaded();
		st.printNumbers();

		for (int j = 1; j <= 200; j++) {
			System.out.print("j: " + j + "\t");
		}
	}

	void printNumbers() {
		for (int i = 1; i <= 200; i++) {
			System.out.print("i: " + i + "\t");
		}
	}
}
```

To implement multithreading, we can either implement the Runnable interface or extend the Thread class. The starting point for the executing for a thread is the run() method. The start() method is used to create a thread space and will invoke the run method internally. Using Thread.sleep(), the thread will be in sleep mode for the duration. There will be a 1 second gap between each print.

```java
public class Multithreaded extends Thread {
	public static void main(String[] args) throws InterruptedException {
		Multithreaded mt = new Multithreaded();
		mt.start();

		for (int j = 1; j <= 200; j++) {
			System.out.print("j: " + j + "\t");
			Thread.sleep(1000);
		}
	}

	public void run() {
		for (int i = 1; i <= 200; i++) {
			System.out.print("i: " + i + "\t");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
```

```
j: 1	i: 1	j: 2	i: 2	j: 3	i: 3	j: 4	i: 4	i: 5	j: 5	i: 6	j: 6
```

We can invoke Thread.currentThread() to get the current active thread. We can also set priorities of threads using Thread.setPriority() with values 1 to 10.

```java
public class Multithreaded extends Thread {
	public static void main(String[] args) throws InterruptedException {
		Multithreaded mt = new Multithreaded();
		mt.setPriority(MAX_PRIORITY);
		mt.setName("mt");
		mt.start();

		Multithreaded mt1 = new Multithreaded();
		mt1.setPriority(MIN_PRIORITY);
		mt1.setName("mt1");
		mt1.start();

  }

	public void run() {
		System.out.println("thread name: " + Thread.currentThread().getName());
  }
}
```

The join method of the Thread class makes sure that the thread has completed before executing other threads. In this case, the current thread in main will pause until jd completes. Using

```java
public class JoinDemo extends Thread {
	static int n, sum;

	public static void main(String[] args) {

		long startTime = System.currentTimeMillis();
		System.out.println("Sum of first N numbers");
		System.out.println("Enter a number");
		Scanner scanner = new Scanner(System.in);
		JoinDemo.n = scanner.nextInt();

		JoinDemo jd = new JoinDemo();
		jd.start();
		try {
			jd.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		System.out.println("sum of first " + JoinDemo.n + " numbers is " + JoinDemo.sum);
		long endTime = System.currentTimeMillis();

		System.out.println("Total time taken " + (endTime - startTime) / 1000);
	}

	public void run() {
		for (int i = 1; i <= JoinDemo.n; i++) {
			JoinDemo.sum += i;
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
```

We can also use multithreading with the runnable interface. This will allow us to extend other classes.

```java
public class CheckProcessor implements Runnable {

	@Override
	public void run() {
		System.out.println("Processed check");
	}

	public static void main(String[] args) {
		CheckProcessor cp = new CheckProcessor();
		Thread t = new Thread(cp);
		t.start();
	}
}
```

#### Synchronization

When multiple threads are accessing the same object simultaneously, data between must be synchronized in order to prevent corruption. We mark by using the keyword **synchronized**, and the first thread that will access will get a lock on the object. Once the thread finishes method execution, it will release the lock. This is taken care of by the JVM.

```java
public class DisplayMessage {
	public synchronized void sayHello(String name) {
		for (int i=1; i<=5; i++) {
			System.out.println("Hello " +  name);
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}

public class MyThread extends Thread{
	DisplayMessage dm;
	String name;

	MyThread(DisplayMessage dm, String name) {
		this.dm = dm;
		this.name = name;
	}

	public void run() {
		dm.sayHello(name);
	}
}

public class SynchronizationDemo {
	public static void main(String[] args) {
		DisplayMessage dm = new DisplayMessage();
		MyThread t1 = new MyThread(dm, "doge");
		MyThread t2 = new MyThread(dm, "cate");

		t1.start();
		t2.start();
	}
}
```

The output will be:

```
Hello doge
Hello doge
Hello doge
Hello doge
Hello doge
Hello cate
Hello cate
Hello cate
Hello cate
Hello cate
```

Every class in Java has a unique lock. If a thread wants to execute a static synchronized method, it will first get the class level lock. The other threads will have to wait for their turn to execute a static synchronized method. Other threads will still have access to static method and instance methods. Instead of marking the entire method with synchronized, we can also use synchronized blocks. Other threads can enter the method and execute the code before the synchronized block, but will have to wait until the thread finishes the synchronized block.

```java
public class DisplayMessage {
	public void sayHello(String name) {
		// Any code can go here

		synchronized (this) {
			for (int i=1; i<=5; i++) {
				System.out.println("Hello " +  name);
				try {
					Thread.sleep(2000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}
}
```

#### InterThread Communication

We can use the wait() method to temporarily release a thread's lock on an object and allow another thread to access that object wherein it will invoke the notify() method to release the lock and notify the first thread that it can start running again.

In the sample application, the thread class will calculate the sum of numbers from 1-100, but the results should be displayed by the main thread.

```java
public class MainThread {
	public static void main(String[] args) throws InterruptedException {
		MyThread t = new MyThread();
		t.start();

		synchronized(t) {
			System.out.println("Main Thread is going to wait");
			t.wait();
			System.out.println("Main Thread notified");
			System.out.println(t.total);
		}
	}
}

public class MyThread extends Thread {
	int total;

	@Override
	public void run() {
		System.out.println("Child Thread is calculating the sum");
		synchronized (this) {
			for (int i = 1; i <= 100; i++) {
				total += i;
			}
			this.notify();
		}
	}
}
```

```
Main Thread is going to wait
Child Thread is calculating the sum
Main Thread notified
5050
```

## Executor Framework

The Executor Framework introduced in Java 1.5 overcomes limitations of traditional approach of using threads such as time consuming, poor resource management, robustness by giving us a thread pool. It allows us to create a pool of threads which can be assigned to a particular task as assigned, and once finished with a task, the thread returns to the pool. The Executor framework manages the lifecycle of the thread.

We start with creating the thread class CheckProcessorTask which should implement **Runnable**

```java
public class CheckProcessorTask implements Runnable {
	String name;

	public CheckProcessorTask(String name) {
		this.name = name;
	}

	@Override
	public void run() {
		System.out.println(name + " Check Processor has began processing the check " + Thread.currentThread().getName());
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		System.out.println(name + " CheckProcessor has completed" + Thread.currentThread().getName());
	}
}
```

We then write out the thread pool using Executor. In this case, we only allot two threads for the pool.

```java
public class ExecutorDemo {
	public static void main(String[] args) {
		CheckProcessorTask[] cps = { new CheckProcessorTask("ATM"), new CheckProcessorTask("Bank"),
				new CheckProcessorTask("Mobile"), new CheckProcessorTask("Web") };
		ExecutorService service = Executors.newFixedThreadPool(2);

		for (CheckProcessorTask checkProcessorTask : cps) {
			service.submit(checkProcessorTask);
		}

		service.shutdown();
	}
}
```

The output is as follows:

```
ATM Check Processor has began processing the check pool-1-thread-1
Bank Check Processor has began processing the check pool-1-thread-2
ATM CheckProcessor has completedpool-1-thread-1
Mobile Check Processor has began processing the check pool-1-thread-1
Bank CheckProcessor has completedpool-1-thread-2
Web Check Processor has began processing the check pool-1-thread-2
Mobile CheckProcessor has completedpool-1-thread-1
Web CheckProcessor has completedpool-1-thread-2
```

#### Callable

When we use the Runnable interface, the run() method cannot return any value. We can use Callable<V> V call() instead to return a value. We pass a callable instance to the executor framework which will return a Future object. We start with creating our thread class that implemens the Callable interface.

```java
public class MyCallable implements Callable<Integer> {
	int num;

	MyCallable(int num) {
		this.num = num;
	}

	@Override
	public Integer call() throws Exception {
		System.out.println(Thread.currentThread().getName() + " is calculating summation of numbers up to " + num);
		int sum = 0;
		for (int i = 1; i <= num; i++) {
			sum += i;
		}
		return sum;
	}
}
```

And then we write out our main method:

```java
public class CallableFutureDemo {
	public static void main(String[] args) {
		MyCallable[] callables = { new MyCallable(10), new MyCallable(20), new MyCallable(30), new MyCallable(40),
				new MyCallable(50), new MyCallable(60) };

		ExecutorService service = Executors.newFixedThreadPool(3);

		for (MyCallable myCallable : callables) {
			Future<Integer> future = service.submit(myCallable);
			try {
				System.out.println(future.get());
			} catch (InterruptedException | ExecutionException e) {
				e.printStackTrace();
			}
		}
		service.shutdown();
	}
}
```

The output will be

```
pool-1-thread-1 is calculating summation of numbers up to 10
55
pool-1-thread-2 is calculating summation of numbers up to 20
210
pool-1-thread-3 is calculating summation of numbers up to 30
465
pool-1-thread-1 is calculating summation of numbers up to 40
820
pool-1-thread-2 is calculating summation of numbers up to 50
1275
pool-1-thread-3 is calculating summation of numbers up to 60
1830
```

## Garbage Collection

In java, each thread has stack space where all the local primitives are stored and the heap space where objects are allocated into memory. All the references will point to these memory locations in heap. JVM automatically clears memory allocated to an object via garbage collection. It is a daemon thread that runs within the JVM and garbage collects objects once they are unreachable.

We create a test class which overwrites the finalize() method of java Object. This method gets called when the memory is released just before the JVM's garbage collector thread removes the objects. We create two instances of the class and we don't assign to memory so that the garbage collector will purge these. It is important to note that the Garbage Collector thread only runs when low on memory. We can also request garbage collection manually using **System.gc()**. In this case, the unreferences GCDemo objects will be requested to be collected.

```java
public class GCDemo {
	int objId;

	GCDemo(int objId) {
		this.objId = objId;
		System.out.println("created " + this.objId);
	}

	public static void main(String[] args) {
		new GCDemo(1);
		new GCDemo(2);
		for (int i = 1; i <= 100; i++) {
			System.gc();
		}
	}

	@Override
	protected void finalize() {
		System.out.println("finalized " + objId);
	}
}
```
