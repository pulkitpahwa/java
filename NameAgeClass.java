//This program creates a class name and takes 2 inputs string name and int age as data members. It has a method that takes these inputs and another one display the name
//

import java.util.*;
class Name
{
	int age;
	String name;
	void input()
	{
		Scanner sc =  new Scanner(System.in);
		System.out.print("Enter your name : ");
		name = sc.next();
		System.out.print("Enter your age : ");
		age = sc.nextInt();
	}

	void display()
	{
		System.out.println("your name : "+name);
		System.out.println("your age  : "+age);
	}
}

class NameClass
{
	public static void main(String args[])
	{
		Name n = new Name();
		n.input();
		n.display();
	}
}


