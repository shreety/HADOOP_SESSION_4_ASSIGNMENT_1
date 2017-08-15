package session_4_assignments_1;

import java.util.Scanner;

public class SumOfInterger {
	public void SumOfNumber(int first_number,int second_number)
	{
		System.out.println("First Number is "+first_number);
		System.out.println("Second Number is "+second_number);
		int sum=first_number + second_number;
		
		System.out.print("Sum is "+sum);
	}
	public static void main(String [] args) throws Exception
	{
		int first_number;
		int second_number;
		int sum;
		System.out.println("Enter first Number");
		Scanner reader =new Scanner(System.in);
		first_number = reader.nextInt();
		System.out.println("Enter second Number");
		reader =new Scanner(System.in);
		second_number = reader.nextInt();
		SumOfInterger obj = new SumOfInterger();
		obj.SumOfNumber(first_number,second_number);
	}

}
