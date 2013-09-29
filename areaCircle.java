//This program calculates the area of the circle whose radius is provided

import java.util.*;
import java.io.*;
class Area
{
	float radius;
	double pi = 3.14125;
	double area;
	Area()
	{
		Scanner sc  = new Scanner(System.in);
		System.out.print("Enter radius of circle : ");
		radius = sc.nextFloat();
	}
	public void calc()
	{
		area = pi * radius * radius ;
		System.out.println("Area of circle is :"+area);
	}
}

class AreaCircle
{
	public static void main(String args[])
	{
		Area a = new Area();
		a.calc();
	}
}


