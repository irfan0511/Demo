package com.demo.wrapper;

class TestJavatpoint{
	private int i;
	TestJavatpoint(){}
	TestJavatpoint(int i){
		this.i=i;
	}
	public int getValue() {
		return i;
	}
	public void setValue(int i) {
		this.i = i;
	}
	@Override
	public String toString() {
		return Integer.toString(i);
	}
	
	
}

public class Javatpoint {

	public static void main(String[] args) {
		TestJavatpoint javatpoint=new TestJavatpoint(10);
		System.out.println(javatpoint);
		

	}

}
