// this program demos dynamic dispatch in java
//

class A
{
	void show()
	{
		System.out.println("Show of A");
	}
}
class B extends A
{
	void show()
	{
		System.out.println("Show of B");
	}
}

class DynamicDispatch
{
	public static void main(String args[])
	{
		A ref = new A();
		ref.show();
		ref = new B();
		ref.show();
	}
}
