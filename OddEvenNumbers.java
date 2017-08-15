package session_4_assignments_1;

import java.util.Scanner;

public class OddEvenNumbers {
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
		if(second_number < first_number)
		{
			System.out.println("Wrong Range");
			return;
		}
		else
		{
			for(int i =first_number; i<second_number;i++)
			{
				if(i%2 == 0)
				{
					System.out.println("Even Number "+i);
				}
				else
				{
					System.out.println("Odd Number "+i);
				}
			}
		}
	}

}
