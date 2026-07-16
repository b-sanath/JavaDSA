package javadsa;
class calc
{
	int n1;
	int n2;
	
	public int add()
	{
		return (n1+n2);
	}
	
	public int sub()
	{
		return (n1-n2);
	}
}

class advcalc extends calc
{
	public int mult()
	{
		return (n1*n2);
	}
	public float div()
	{
		return(n1/n2);
	}
}

class veryadvcalc extends advcalc                 //Multilevel inheritance
{
	public double pow()
	{
		return Math.pow(n1, n2);
	}
	
}
public class inheritance 
{
	public static void main(String[] args) 
	{
		veryadvcalc myobj=new veryadvcalc();
		
		myobj.n1=15;
		myobj.n2=5;
		
		System.out.println(myobj.add()+" "+myobj.sub()+" "+myobj.mult()+" "+myobj.div()+" "+myobj.pow());
		
	}

}
