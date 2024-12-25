package array;

import java.util.Scanner;

//Take an array as input from the user.Search for a given number x and print the index at which it occurs.
//linear search
public class Question1 {

	public static void main(String[] args) {
		
     Scanner sc=new Scanner(System.in);
     System.out.print("Size of an Array: ");
     int size=sc.nextInt();
     int number[]=new int[size];
     
     for(int i=0;i<size;i++){
    	 number[i]=sc.nextInt();//taking as an input array
     }
     System.out.print("X:");
     int x=sc.nextInt();
     for(int i=0;i<number.length;i++){
    	 if(number[i] == x){
    		 System.out.println("X found at index: "+i);
    	 }
    	 else{
    		 System.out.println("Not found");
    	 }
     }
     
	}

}
