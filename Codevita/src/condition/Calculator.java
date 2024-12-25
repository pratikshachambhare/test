package condition;

import java.util.Scanner;

public class Calculator {
	
	void cal(){
		Scanner sc=new Scanner(System.in);
		System.out.print("a: ");
		int a=sc.nextInt();
		System.out.print("b: ");
		int b=sc.nextInt();
		
		System.out.println("Please choose Operation: ");
		int n=sc.nextInt();
		
		
		switch(n){
		case 1:
			System.out.println("Addition: "+a+b);
			break;
		case 2:
			System.out.println("Subtraction: "+(a-b));
			break;
		case 3:
			System.out.println("Multiplication: "+a*b);
			break;
		case 4:
			System.out.println("Division: "+a/b);
			break;
		case 5:
			System.out.println("Modulo: "+a%b);
			break;
			default:
				System.out.println("Invalid option:");
		
		}
		
	}

	public static void main(String[] args) {
		
      Calculator cl=new Calculator();
      cl.cal();
	}

}
