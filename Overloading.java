package session_4_assignments_1;

import java.util.Scanner;

public class Overloading {
	public void sum(int first,int second)
	{
		System.out.println("In first Method");
		System.out.println("Sum is "+(first+second));
		
	}
	public void sum(int first,double second)
	{
		System.out.println("In Second Method");
		System.out.println("Sum is "+(first+second));
	}
	public static void main(String [] args) throws Exception
	{
		int first_number,second_number;
		double number;
		System.out.println("Enter First Number");
		Scanner reader =new Scanner(System.in);
		first_number = reader.nextInt();
		System.out.println("Enter Second Number");
		reader =new Scanner(System.in);
		second_number = reader.nextInt();
		System.out.println("Enter Second Number in decimal");
		reader =new Scanner(System.in);
		number = reader.nextDouble();
		Overloading obj =new Overloading();
		obj.sum(first_number,second_number);
		obj.sum(first_number,number);
		
		
	}

}
