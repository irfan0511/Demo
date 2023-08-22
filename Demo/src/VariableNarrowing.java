class VariableNarrowing{     
	public static void main(String args[]){
		
		float f = 10.5f;
		//int a = f;  // it will throught error(incompatible types: possible lossy conversion from float to int)
		int a =(int)f; // narrowing or typecasting
		System.out.println(f);
		System.out.println(a);
		
	}
}