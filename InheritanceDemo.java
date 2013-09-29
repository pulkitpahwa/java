// This program gives a demo of Inheritance

class A
{
	void show()
	{
		System.out.println("Hello from A");
	}
}
class B extends A
{
}

class InheritanceDemo extends A
{
	public static void main(String args[])
	{
		B obj  = new B();
		obj.show();
	}
}

