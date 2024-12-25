package array;

import java.util.Scanner;

public class Array2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		//type[][]arry_name=new type[rows][col];
		int row=sc.nextInt();
		int col=sc.nextInt();
		
		int arr[][]=new int[row][col];
		//input
		for(int i=0;i<row;i++){
			for(int j=0;j<col;j++){
				arr[i][j]=sc.nextInt();
			}
		}
		//output
      for(int i=0;i<row;i++){
    	  for(int j=0;j<col;j++){
    	  System.out.print(arr[i][j]+" ");
      }
    	  System.out.println();}
	}

}
