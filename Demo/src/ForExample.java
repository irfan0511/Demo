public class ForExample{
	public static void main(String args[]){
		
		System.out.println("Below are even numbers:");
		for (int i=0; i<=10; i++)
		{
			if((i % 2==0) && i>0)
			{
			  System.out.println(i);
			}	
		}
		System.out.println("Below are odd numbers:");
		for (int i=0; i<=10; i++)
		{
			if((i % 2!=0) && i>0)
			{
				System.out.println(i);	
			}
		}
		
	}

}