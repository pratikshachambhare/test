class Maxarray{
	void max()
	{
		int arr[]={1,5,3,20};
		int ans=0;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]>ans)
			{
				ans=arr[i];
				
			}
		}
			
			System.out.println("Max="+ans);
		
	}
}

class Search{
	void search()
	{//linear search
		int arr[]={1,5,3,5};
		int x=5;
		int ans=-1;
		
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]==x){
				ans=i;
				break;
			}
		}
			if(ans==-1)
			{
				System.out.println("Not found");
				
			}
			else{
				System.out.println("Found "+x+" at index "+ans);
			}
		
		
	}
}

public class ArrayQue {

	public static void main(String[] args) {
		Maxarray mx=new Maxarray();
		Search s=new Search();
		mx.max();
		s.search();
		int arr[]={1,5,3};
		int sum=0;
		for(int i=0;i<arr.length;i++)
		{
			sum=sum+arr[i];
		}
		System.out.println("sum:"+sum);

	}
	
	


}
