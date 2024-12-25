package condition;

import java.util.Scanner;

public class Month {
	
	void month(){
		Scanner sc=new Scanner(System.in);
		
		
		System.out.println("1.January");
		System.out.println("2.February");
		System.out.println("3.March");
		System.out.println("4.april");
		System.out.println("5.may");
		System.out.println("6.June");
		System.out.println("7.Jully");
		System.out.println("8.Auguast");
		System.out.println("9.September");
		System.out.println("10.Octomber");
		System.out.println("11.November");
		System.out.println("12.December");
		
		System.out.print("Enter Number for Your Month: ");
		int n=sc.nextInt();
		
		switch(n){
		case 1:
			System.out.println("January");
			break;
		case 2:
			System.out.println("Feb");
			break;
		case 3:
			System.out.println("march");
			break;
		case 4:
			System.out.println("April");
			break;
		case 5:
			System.out.println("may");
			break;
		case 6:
			System.out.println("june");
			break;
		case 7:
			System.out.println("jully");
			break;
		case 8:
			System.out.println("aug");
			break;
		case 9:
			System.out.println("sept");
			break;
		case 10:
			System.out.println("oct");
			break;
		case 11:
			System.out.println("Nov");
			break;
		case 12:
			System.out.println("Dec");
			break;
		default:System.out.println("Enter Valid Option!");
			
		}
	}

	public static void main(String[] args) {
		Month mn=new Month();
		mn.month();

	}

}
