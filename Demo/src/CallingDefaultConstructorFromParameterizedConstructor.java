class A{
	A(){
		System.out.println("Default Constructor");
	}
	A(int x){
		this();// calling default constructor A()
		System.out.println(x);
	}
}

class CallingDefaultConstructorFromParameterizedConstructor{
	public static void main(String args[]){
		A a=new A(10);
	}
}