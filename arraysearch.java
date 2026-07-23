package javadsa;

public class arraysearch 
{
	public static void main(String[] args) 
	{
		int[] arr= {1,2,3,4,5,6};
		
		//System.out.println(arr.length);
		
		int target=4;
		
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]==target)
			{
				System.out.println("Index number=");
				System.out.println(i);
			}
		}
		
	}

}
