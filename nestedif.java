package javadsa;

public class nestedif 
{
	public static void main(String[] args) 
	{
		int marks=85;
		
		if(marks>=35)
		{
			System.out.println("Passed");
			
			if(marks>=85)
			{
				System.out.println("Distinction");
			}
		}
		
		
	}

}
