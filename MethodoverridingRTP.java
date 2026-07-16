package javadsa;
class calcc
{
	public int add(int n1,int n2)
	{
		return (n1+n2);
	}
}
class advvcalc extends calcc
{
	@Override
	public int add(int n1,int n2)
	{
		return (n1+n2+1);
	}
}

public class MethodoverridingRTP 
{
	public static void main(String[] args) {
		
	
	advvcalc myobj=new advvcalc();
	
	System.out.println(myobj.add(15,5));
	
	}
	

}
