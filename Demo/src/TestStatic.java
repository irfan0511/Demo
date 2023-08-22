class TestStatic{
	static int a= m1();
	static int m1(){
		return 1+1;
	}
	static{
		System.out.println("Inside static block");		
	}
	public static void main(String args[]){
		System.out.println("In main");	
	}
}
/* output
Inside static block
In main

 */