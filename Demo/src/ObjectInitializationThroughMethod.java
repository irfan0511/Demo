class Student{
	int rollno;
	String name;
	void insertRecord(int r, String n){
		rollno=r;
		name=n;
	}
	void displayInformation(){
		System.out.println(rollno+" "+name);
	}
}
public class ObjectInitializationThroughMethod{
		public static void main(String args[]){
			Student ob1= new Student();
			Student ob2= new Student();
			ob1.insertRecord(111 , "Karan");
			ob2.insertRecord(222 , "Aryan");
			ob1.displayInformation();
			ob2.displayInformation();
		}
		
	}