package javadsa;
class methov
{
	public int add(int n1,int n2,int n3)
	{
		return (n1+n2+n3);
	}
	
	public int add(int n1, int n2)
	{
		return (n1+n2);
	}
	
	public double add(double n1,double n2)
	{
		return (n1+n2);
	}
}

public class MethodOverloadingCTP 
{
	public static void main(String[] args) 
	{
		methov myobj=new methov();
		
		int result1=myobj.add(15,6,9);
		int result2=myobj.add(15,5);
		double result3=myobj.add(15.5, 5.5);
		
		System.out.println(result1+" "+result2+" "+result3);
		
	}

}
