package array;

import java.util.Scanner;

//Take a matrix as input from user.search for a given number x and print indices at which it occurs.
public class Question4 {

	public static void main(String[] args) {
		
    Scanner sc=new Scanner(System.in);
    int row=sc.nextInt();
    int col=sc.nextInt();
    
    int arr[][]=new int [row][col];
    //input
    for(int i=0;i<row;i++){
    	for(int j=0;j<col;j++){
    		arr[i][j]=sc.nextInt();
    	}
    }
    
    int x=sc.nextInt();
    System.out.println("x:"+x);
    
    for(int i=0;i<row;i++){
    	for(int j=0;j<col;j++){
    		if(arr[i][j]==x){
    			System.out.println("Found X at index "+i+","+j);
    		}
    	}
    }
	}

}
