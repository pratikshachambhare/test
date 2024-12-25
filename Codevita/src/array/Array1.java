package array;

import java.util.Scanner;

public class Array1 {

	public static void main(String[] args) {
		//type[]array_name=new type[size];
		//int []marks=new int[3];
		//int[]marks={10,20,30};
//		int marks[]=new int[3];
//		marks[0]=10;
//		marks[1]=20;
//		marks[2]=30;
//		System.out.println(marks[0]);
//		System.out.println(marks[1]);
//		System.out.println(marks[2]);
		
		//input from user
		
		Scanner sc=new Scanner(System.in);
		int size=sc.nextInt();
		int marks[]=new int[size];
		
		//input
		for(int i=0;i<size;i++){
			marks[i]=sc.nextInt();
		}
		//output
		
		for(int i=0;i<size;i++){
			System.out.println(marks[i]);
		}

	}

}
