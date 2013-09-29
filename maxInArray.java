// This program takes an array input and returns the greatest of 10 integers
//

import java.io.*;
import java.util.*;

class GreatestInArray
{
	public static void main(String args[])
	{
		int check,max=0;
		Scanner sc = new Scanner(System.in);
		int arr[] = new int[10];
		for(int i=0;i<arr.length;i++)
		{
		 	System.out.print("Enter the "+ i + "th number :");
			arr[i] = sc.nextInt();
		}
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]>=max)
			{
				max = arr[i];
			}
		}
		System.out.println("The maximum number in the array of the numbers that you entered is : "+max);


	
	}
}	
