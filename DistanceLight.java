// This program calculates the distance travelled by light 


import java.util.*;
import java.io.*;

class Distance
{
	long distance;
	long seconds;
	int days,hours,minutes,sec;
	Distance()
	{
		Scanner sc = new Scanner (System.in);
		System.out.print("Enter days : ");
		days = sc.nextInt();
		System.out.print("\nEnter hours : ");
		hours = sc.nextInt();
		System.out.print("\nEnter minutes : ");
		minutes = sc.nextInt();
		System.out.print("\nEnter seconds : ");
		sec = sc.nextInt();
		seconds = 24*days*3600 + hours * 3600 + minutes * 60 +sec;
	}
	public void calculate()
	{
		distance = 300000*seconds;
		System.out.println("Distance travelled by light is : "+ distance + "\n");
	}
}

class DistanceLight
{
	public static void main(String args[])
	{
		Distance d = new Distance();
		d.calculate();
	}
}



