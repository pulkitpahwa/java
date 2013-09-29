// This program showcases the use of super keyword
//

class SuperClass
{
	public void printMethod()
	{
		System.out.println("printed in superclass");
	}

}
public class superKeyword extends SuperClass
{
	public void printMethod()
	{
		super.printMethod();
		System.out.println("Printed in subclass");
	}
	public static void main(String args[])
	{
		superKeyword s = new superKeyword();
		s.printMethod();
	}
}
