class A{
	A(){
		this(5);
		System.out.println("Default Constaructor called");
	}
	A(int x){
		System.out.println(x);
	}
}
class CallingParameterizedConstructorFromDefaultConstructor{
	public static void main(String args[]){
		A a =new A();
	}
}