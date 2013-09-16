// This program takes 3 integers from the user and returns the maximum of the three integers input
//


import java.util.*;
import java.io.*;
class Max
{
	int a,b,c,max;
	void input(int a1,int b1, int c1)
	{
		a = a1;
		b = b1;
		c = c1;
	}
	int max2(int x, int y)
	{
		if(x>y){
			return x;
		}
		else 
			return y;
	}
}
class Max3
{
	public static void main(String args[])
	{
		int maximum;
		Max m1 = new Max();
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number 1: ");
		m1.a = sc.nextInt();
		System.out.print("Enter number 2: ");
		m1.b = sc.nextInt();
		System.out.print("Enter Number 3: ");
		m1.c = sc.nextInt();
		maximum = m1.max2(m1.a, m1.max2(m1.b, m1.c));
		System.out.println("Maximum is :"+maximum);
	}
}


