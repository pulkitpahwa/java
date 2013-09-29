// This program demonstrates the use of classes in java

import java.util.*;
import java.io.*;

class Person
{
	String name;
	int age;
	void input(String s, int a)
	{
		name = s;
		age = a;
	}
	void show()
	{
		System.out.println("Name = "+ name);
		System.out.println("Age = "+age);
	}
}

class ClassDemo
{
	public static void main(String args[])
	{
		Person p = new Person();
		p.input("Pulkit",20);
		p.show();
	}
}
