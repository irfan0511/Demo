//There is no copy constructor in Java. However, we can copy the values from one object to another like copy constructor in C++.
class CopyConstructorNA{
	int id;
	String name;	
	CopyConstructorNA(int i, String n){
		id =i;
		name=n;		
	}
	CopyConstructorNA(CopyConstructorNA s){  
    id = s.id;  
    name =s.name;  
    }
	void display(){
		System.out.println(id+ " " +name);
	}
	public static void main(String args[]){
		CopyConstructorNA cs1= new CopyConstructorNA(111, "Test");
		CopyConstructorNA cs2= new CopyConstructorNA(cs1);
		cs1.display();
		cs2.display();	
		System.out.println(cs1.hashCode());	
		System.out.println(cs2.hashCode());	
		//cs2.hashCode();	
	}
}
