package session_4_assignments_1;

import java.util.Scanner;

public class SortArray {
	public static void main(String [] args) throws Exception
	{
		int length,number;
		System.out.println("Enter length of array");
		Scanner reader =new Scanner(System.in);
		length = reader.nextInt();
		int arr[]=new int[100];
		for(int i=0;i<length;i++)
		{
			System.out.println("Enter Elements");
			reader =new Scanner(System.in);
			arr[i]= reader.nextInt();
		}
		for(int i=0;i<length;i++)
		{
			for(int j=i;j<length;j++)
			{
				if(arr[i] < arr[j])
				{
					number=arr[i];
					arr[i]=arr[j];
					arr[j]=number;
				}
			}
		}
		System.out.println("Sorted Array in Descending Order");
		for(int i=0;i<length;i++)
		{
			System.out.print(arr[i]+ " ");
		}
		
		
	}

}
