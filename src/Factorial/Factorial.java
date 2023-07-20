package Factorial;

import java.util.Scanner;

public class Factorial {
	
	public static int fact (int number)
	{
		if(number == 1)
		{
			return 1;
		}
		return fact(number-1) * number;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int number = scan.nextInt();
		System.out.println(fact(number));

	}

}
