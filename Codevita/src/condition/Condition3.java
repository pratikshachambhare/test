package condition;

import java.util.Scanner;

public class Condition3 {

	public static void main(String[] args) {
		//a=b
		//a>b		
        //a<b
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		
		if(a==b){
			System.out.println("Equal");
		        }
		else if(a>b)
			{
				System.out.println("a is greater");
			}
			else{
				System.out.println("lesser");
			
		        }
		
	}

}
