package loop;

import java.util.Scanner;

public class Loop1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
//		n=n+1=>n++
//		for(int n=0;n<11;n++){
//			System.out.print(n+" ");
		
//		int i=0;
//		while(i<11){
//			System.out.println(i);
//			i++;
//		}
//		
		
//		int i=0;
//		do{
//			System.out.println(i);
//			i=i+1;
//		}while(i<11);
		
		//Print sum of first n natural numbers
//			int n=sc.nextInt();
//			int sum=0;
//		    for(int i=1;i<=n;i++){
//			sum=sum+1;
//			System.out.println(sum);
//		}
		
		//print table of a number input by user
		
//		int n=sc.nextInt();
//		for(int i=1;i<11;i++){
//			System.out.println(n*i);
//		}
//			
////		print all even numbers till n.
//		int n=sc.nextInt();
//		for(int i=0;i%n==0;i++){
//			
//			System.out.println(n);
//		}
		
//		for(; ;){
//			System.out.println("A");
//		}
		
		int n=sc.nextInt();
		int i=0;
		while(i<=n){
			if(i%2==0)
			{
				System.out.println(i);
			}
			i++;
		}
	}
	}


