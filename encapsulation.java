package javadsa;

class human
{
	private int age;
	private String name;
	
	public int getage()             //getter
	{
		return age;
	}
	
	public int setage(int age)      //setter
	{
		this.age=age;
		return age;
	}
	
	public String getname()           //getter
	{
		return name;
	}
	
	public String  setname(String name)     //setter
	{
		this.name=name;
		return name;
	}
}

public class encapsulation 
{
	public static void main(String[] args) 
	{
		human myobj=new human();
		
		myobj.setage(22);
		myobj.setname("Sanath");
		
		System.out.println(myobj.getage()+" "+myobj.getname());
		
		
		
	}

}
