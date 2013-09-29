//This program demonstrates the us of constructor Inheritance

class A
{
	A()
	{
		System.out.println("From A");
	}
}
class B extends A
{
	B()
	{
		System.out.println("From B");
	}
}

class ConstructorInheritance
{
	public static void main(String args[])
	{
		new B();
	}
}

