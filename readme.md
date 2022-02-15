# Core Java Made Easy

[Core Java Made Easy](https://www.udemy.com/course/corejavamadeeasy/)

- [Core Java Made Easy](#core-java-made-easy)
  - [Introduction to Java](#introduction-to-java)
      - [Object Oriented Programming](#object-oriented-programming)
      - [Static and Non Static Context](#static-and-non-static-context)
  - [Data Types](#data-types)
  - [Wrapper Classes](#wrapper-classes)

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
