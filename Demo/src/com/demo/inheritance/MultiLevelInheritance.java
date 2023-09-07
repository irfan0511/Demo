package com.demo.inheritance;

public class MultiLevelInheritance extends ChildClass {
	static {System.out.println("This is MultiLevelInheritance Static block");}
	{System.out.println("This is MultiLevelInheritance IIB block");}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MultiLevelInheritance mli= new MultiLevelInheritance();
		mli.childMethod();
		mli.parentmethod();
		mli.multiLevelInheritance();

	}
	void multiLevelInheritance() {
		System.out.println("This is Current Class method");
	}

}
