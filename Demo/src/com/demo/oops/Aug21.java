package com.demo.oops;

public class Aug21 {

	public static void main(String[] args) {
		pattern1();
		pattern2();
		pattern3();
		pattern4();
		pattern5();
		pattern6();
		pattern7();
		pattern8();

	}
	public static void pattern1(){
		System.out.println("////////////////////////");
		for (int i=1; i<=6 ; i++){
			for (int j=1; j<=6 ; j++){
				System.out.print("*");
			}
			System.out.println("");
			
		}
	
	}
	/* Output: 
	******
	******
	******
	******
	******
	******
	*/
	public static void pattern2(){
			//System.out.println("Hi");
		System.out.println("////////////////////////");
			for (int i=6; i>=1 ; i--){
				for (int j=1; j<=i ; j++){
					System.out.print("*");
				}
				System.out.println("");
				
			}
			for (int i=1; i<=6 ; i++){
				for (int j=1; j<=i ; j++){
					System.out.print("*");
				}
				System.out.println("");
				
			}
		
		}

	/* Output:
	******
	*****
	****
	***
	**
	*
	*
	**
	***
	****
	*****
	****** */


	public static void pattern3(){
		System.out.println("////////////////////////");
			for (int i=1; i<=5 ; i++){
				for (int j=1; j<=5 ; j++){
					System.out.print(i);
				}
				System.out.println("");
				
			}
		
		}

	/* Output:
	11111
	22222
	33333
	44444
	55555 */

	public static void pattern4(){
		System.out.println("////////////////////////");
			for (int i=1; i<=5 ; i++){
				for (int j=1; j<=5 ; j++){
					System.out.print(j);
				}
				System.out.println("");
				
			}
		
		}

	/* Output:
	12345
	12345
	12345
	12345
	12345 */

	public static void pattern5(){
		System.out.println("////////////////////////");
			for (int i=5; i>=1 ; i--){
				for (int j=1; j<=5 ; j++){
					System.out.print(i);
				}
				System.out.println("");
				
			}
		
		}

	/* Output:
	55555
	44444
	33333
	22222
	11111 */

	public static void pattern6(){
		System.out.println("////////////////////////");
			for (int i=5; i>=1 ; i--){
				for (int j=5; j>=1 ; j--){
					System.out.print(j);
				}
				System.out.println("");
				
			}
		
		}

	/* Output:
	54321
	54321
	54321
	54321
	54321 */

	public static void pattern7(){
		System.out.println("////////////////////////");
			int k=1;
			for (int i=5; i>=1 ; i--){
				for (int j=5; j>=1 ; j--){
					System.out.print("\t"+k);
					k++;
				}
				System.out.println("");
				
			}
		
		}

	/* Output:
			1       2       3       4       5
	        6       7       8       9       10
	        11      12      13      14      15
	        16      17      18      19      20
	        21      22      23      24      25 
	*/

	public static void pattern8(){
		System.out.println("////////////////////////");
			int k=1;
			for (int i=5; i>=1 ; i--){
				for (int j=10; j>=1 ; j--){
					if(k%2!=0){
						System.out.print("\t"+k);
					}
					k++;
				}
				System.out.println("");
				
			}
		
		}

	/* Output:
			1       3       5       7       9
	        11      13      15      17      19
	        21      23      25      27      29
	        31      33      35      37      39
	        41      43      45      47      49 
	*/
}

	








