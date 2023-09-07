package com.demo.inheritance;

public class ChildClass extends ParentClass {
	static {System.out.println("This is ChildClass Static block");}
	{System.out.println("This is ChildClass IIB block");}
	void childMethod() {
		System.out.println("This is Child class method");
	}
	

}
