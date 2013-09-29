// this program finds out the factorial of a number using class and object.
//

import java.io.*;
import java.util.*;

class Fact
{
	int num;
	int fact;
	Fact()
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number : ");
		num = sc.nextInt();
	}

	public void calculate()
	{
		int i;
		fact = 1;
		for(i=1;i<= num;i++)
		{
			fact = fact*i;
		}
	}
	public void print()
	{
		System.out.println("Factorial is "+fact);
	}
}

class FactNum
{
	public static void main(String args[])
	{
		Fact f = new Fact();
		f.calculate();
		f.print();
	}
}

