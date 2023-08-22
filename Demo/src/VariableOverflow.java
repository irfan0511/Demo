class VariableOverflow{
public static void main(String args[]){
	int a= 130;
	//byte b= a; // it will throught error(incompatible types: possible lossy conversion from float to int)
	byte b= (byte)a;   // Overflow 
	
	
	System.out.println(a);
	System.out.println(b);
	
}
}