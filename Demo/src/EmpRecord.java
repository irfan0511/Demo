class Emp{
	int id;
	String name;
	float salary;
	void insertRecord(int i, String n, float s){
		id =i;
		name= n;
		salary= s;
	}
	void displayInformation(){
		System.out.println(id+" "+name+" "+salary);
	}
}
public class EmpRecord{
		public static void main(String args[]){
			Emp e1= new Emp();
			Emp e2= new Emp();
			Emp e3= new Emp();
			e1.insertRecord(111 , "Karan", 25000);
			e2.insertRecord(222 , "Aryan", 26000);
			e3.insertRecord(222 , "Rehan", 27000);
			e1.displayInformation();
			e2.displayInformation();
			e3.displayInformation();
		}
		
	}