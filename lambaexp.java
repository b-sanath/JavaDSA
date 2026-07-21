package javadsa;

@FunctionalInterface
interface Add
{
	int calc(int a,int b);
}

public class lambaexp 
{
	
	public static void main(String[] args) 
	{
		
		Add add= (int a, int b) ->  a+b;
		
		System.out.println(add.calc(1, 2));
		
		
		
	}

}
