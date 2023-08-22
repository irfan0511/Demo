class Calculation{
	static int cube(int x){
		return x*x*x;
	}
	static int area(int x, int y){
		return x*y;
	}
}
class StaticForCalculation{
	public static void main(String args[]){
		System.out.println("Below is the cube result");
		//System.out.println(Calculation.cube(5));
		//int result=Calculation.cube(5);
		int result=Calculation.cube(5), result1=Calculation.area(5,5);
		System.out.println(result);
		
		System.out.println("\nBelow is the Area result");
		//result=Calculation.area(5,5);
		System.out.println(result1);
	}
}