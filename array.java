package javadsa;
import java.util.*;

public class array 
{
	public static void main(String[] args) 
	{
		System.out.println("enter arrays size");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		
		int[] arr=new int[n];
		
		System.out.println("enter array elements");
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		
		System.out.println("the array elements");
		for(int i=0;i<n;i++)
		{
			System.out.println(arr[i]);
		}
		
		
		
	}

}
