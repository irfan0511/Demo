package com.demo.oops;

class MyClass{
	int i;
	int j;

	public MyClass(int i, int j){
		this.i = i;
		this.j = j;
	}
	public MyClass() {
		// TODO Auto-generated constructor stub
	}

	public void call(){
		System.out.print("One");
	}
}

public class Test{
	public static void main(String args[]){
		MyClass m = new MyClass(); //line 1
		m.call(); //line 2
	}
}