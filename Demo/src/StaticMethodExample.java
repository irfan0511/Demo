/* class Student{
	static int rollno;
	static String name;
	static String collage;
	static void change(){
		rollno=111;
		name="Karan";
		collage="BBD";
	}
	public static void display(){
		System.out.println(rollno+ " " + name + " " + collage);
	}
}
class StaticMethodExample{ 
	public static void main (String args[]){
		Student.change();
		Student.display();
		
}
} */


class Student{
	static int rollno=changeRollNo();
	static String name;
	static String collage;
	static {
		System.out.println("I am Static Block 1 and value of rollno is : " + Student.rollno);
	}
	static int changeRollNo(){rollno=1111; return rollno;}
	static void change(){
		//rollno=111;
		name="Karan";
		collage="BBD";
	}
	static void insertRecord(int r, String n, String c){  
	  rollno=r;  
	  name=n;
	  collage=c;
	}  
	public static void display(){
		System.out.println(rollno+ " " + name + " " + collage);
	}
	
}

class StaticMethodExample{ 
	public static void main (String args[]){
		System.out.println("===============================");
		Student.change();
		Student.display();
		System.out.println("===============================");
		Student.insertRecord(5555 , "Test1", "ABC");
		Student.display();
		Student.insertRecord(6666 , "Test2", "XYZ");
		Student.display();
		Student.insertRecord(7777 , "Test3", "abc");
		Student.display();
		
}
static {
		System.out.println("I am Static Block 2 and value of rollno is : " + Student.rollno);
	}
}