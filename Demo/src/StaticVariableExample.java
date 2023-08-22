class Student{
	int rollno;
	String name;
	static String collage="ITS";
	Student(int r, String n){
		rollno=r;
		name=n;		
	}
	/* void insertStudent(int r, String n){
		rollno=r;
		name=n;		
	} */
	void dispalyStudentRecord(){
		System.out.println(rollno+ " " +name+" "+collage);
		}
}
class StaticVariableExample{
	public static void main(String args[]){
		Student s1=new Student(111, "Arhan");
		Student s2=new Student(222, "Irfan");
		/* Student s1=new Student();
		Student s2=new Student();
		s1.insertStudent(111 , "Arhan");
		s2.insertStudent(111 , "Irfan"); */
		s1.dispalyStudentRecord();
		s2.dispalyStudentRecord();		
	}
}