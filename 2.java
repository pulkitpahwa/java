// This program takes 2 input from the user and prints their sum
//

import java.util.*;
import java.io.*;

class Sum2Number
{
	public static void main(String args[])
	{
		int a,b,sum = 0 ;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the first number :");
		a = sc.nextInt();
		System.out.print("Enter the second number :");
		b = sc.nextInt();
		sum = a + b ;
		System.out.println("The sum of a = "+a+" b = "+b+" is : "+sum);
	}
}
