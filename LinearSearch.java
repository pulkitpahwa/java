// This program takes an array input and then searches whether the given element is present in the array
import java.io.*;
import java.util.*;
import java.lang.*;

class LinearSearch
{
	public static void main(String args[])
	{
		int a[];
		int size,i,search;
		boolean bool = false;
		Scanner sc = new Scanner(System.in);
		System.out.print("How many number do u want to enter: ");
		size = sc.nextInt();
		a = new int[size];
		for(i=0;i<a.length;i++)
		{
			System.out.print("Enter the element number "+(i+1)+ ": ");
			a[i] = sc.nextInt();
			System.out.println("");
		}

		System.out.print("Enter the number to be searched in the array : ");
		search = sc.nextInt();
		for (i = 0;i<a.length;i++)
		{
			if(a[i]==search)
			{
				bool = true;
				break;
			}
			else 
				bool = false;
		}

		if(bool == true)
		{
			System.out.println(search+" is in the array");
		}
		else 
		{
			System.out.println(search+" is not in the array");
		}
	}

}
