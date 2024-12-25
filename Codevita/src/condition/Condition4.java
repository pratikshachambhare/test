package condition;

import java.util.Scanner;

public class Condition4 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int butt=sc.nextInt();
		
//		if(butt==1){
//			System.out.println("Hello");
//		}
//		else if(butt==2)
//		{
//			System.out.println("Namaste");
//		}
//		else if(butt==3)
//		{
//			System.out.println("Bonjur");
//		}
//		else{
//			System.out.println("Invalid Button");
//		}
		
		switch(butt){
		case 1:
			System.out.println("Hello");
			break;
		case 2:
			System.out.println("Namste");
			break;
		case 3:
			System.out.println("Bonjur");
			break;
			default:System.out.println("Invalid Button");
		}

	}

}
