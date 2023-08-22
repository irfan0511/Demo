class A {
	void m(){
		System.out.println("Hello m");
	}
	void n(){
		System.out.println("Hello n");
		this.m();
	}

}
class ThisInvokeCurrentClassMethodExample{
	public static void main(String args[]){
		A a= new A();
		a.n();
	}
	
}



/* class A {
	void m(){
		System.out.println("Hello m");
	}
	void n(){
		System.out.println("Hello n");
		this.m();
	}

} */
/* class ThisInvokeCurrentClassMethodExample{
	public static void main(String args[]){
		A a= new A();
		a.n();
	}
	void m(){
		System.out.println("Hello m");
	}
	void n(){
		System.out.println("Hello n");
		m();
	}
	
} */