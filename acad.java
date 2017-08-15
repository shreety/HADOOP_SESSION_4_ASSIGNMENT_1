package session_4_assignments_1;
import java.util.*;
public class acad {
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
		sum=first_number + second_number;
		
		System.out.print("Sum of" +first_number+" and " +second_number+" is "+sum);
	}

}
