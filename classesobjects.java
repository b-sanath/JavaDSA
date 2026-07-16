package javadsa;

class car
{
	String color;
	int price;
	
	void drive()
	{
		System.out.println("Driving the car");
	}
	
	void stop()
	{
		System.out.println("stopped the car");
	}
}

public class classesobjects 
{
	
	public static void main(String[] args) 
	{
		car myobj=new car();
		
		myobj.color="red";
		myobj.price=5000;
		
		System.out.println(myobj.color);
		System.out.println(myobj.price);
		
		myobj.drive();
		myobj.stop();
		
		
	}

}
