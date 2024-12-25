package array;

import java.util.Scanner;

//Find maximum and mimimum number in an array  
public class Question2 {
	
	

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Array: ");
		int size=sc.nextInt();
		int num[]=new int[size];
		
		//input
		for(int i=0;i<size;i++){
			num[i]=sc.nextInt();
		}
		
		int max=Integer.MIN_VALUE;
		int min=Integer.MAX_VALUE;
		
		for(int i=0;i<num.length;i++){
			if(num[i]<min){
				min=num[i];
			}
			if(num[i]>max){
				max=num[i];
			}
		}
		System.out.println("Maximum: "+max);
		System.out.println("Minimum: "+min);
	}

	}
