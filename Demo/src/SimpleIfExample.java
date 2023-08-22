class SimpleIfExample
{
	public static void main(String args[])
	{
		int a=90; // local 
		if(a > 100)
		{
			System.out.println("A");
		}
		else if(a==70)
		{
		  System.out.println("B");
		}
		else if(a<=70)
		{
		  System.out.println("C");
		}
		else if(a==90)
		{
		  System.out.println("D");
		}
		else if(a!=90)
		{
		  System.out.println("E");
		}
	}
}