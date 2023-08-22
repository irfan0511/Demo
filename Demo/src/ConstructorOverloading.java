class ConstructorOverloading{
	int id;
	String name;
	int age;
	ConstructorOverloading(int i, String n){
		id= i;
		name= n;
	}
	ConstructorOverloading(int i, String n, int a){
		id= i;
		name= n;
		age= a;	
	}
	void display(){
		System.out.println(id+ " " +name+ " " + age);
	}
	void display1(){
		System.out.println(id+ " " +name);
	}
	void display2(){
		System.out.println(id+ " " +name+ " " + age);
	}
	
	
	public static void main(String args[]){
		ConstructorOverloading co1=new ConstructorOverloading(123, "Irfan");
		ConstructorOverloading co2=new ConstructorOverloading(123, "Irfan", 30);
		co1.display();
		co2.display();
		System.out.println("=======================");
		co1.display1();
		co2.display2();
		System.out.println("=======================");
	
	}
}