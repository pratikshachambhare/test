import java.util.Scanner;

public class Array_2 {
	
	  static void printarray(int[]arr)
	{
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]+ " ");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter size of an array:");
		int n=sc.nextInt();
		
		int arr[]=new int[n];
		System.out.print("Enter "+n+" elements:");
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		for(int i=0;i<n;i++)
		{
			System.out.print(arr[i]+ " ");
		}
		
		

	}

}
