package session_4_assignments_1;

import java.util.Scanner;

public class Multiples {
	public static void main(String [] args) throws Exception
	{
		int first_number;
		System.out.println("Input");
		Scanner reader =new Scanner(System.in);
		first_number = reader.nextInt();
		for(int i=1;i<11;i++)
		{
			System.out.println(first_number+" x "+ i+"="+first_number*i);
		}
	}

}
