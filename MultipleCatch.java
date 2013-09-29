// This program has multiple catch block for a single try block

class MultipleCatch
{
	public static void main(String args[])
	{
		try
		{
			int a = args.length;
			System.out.println("a = "+a);
			int b = 42/a;
			int c[] = {1};
			c[42]=99;
		}
		catch(ArithmeticException e)
		{
			System.out.println(e);
		}
		catch (ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Array index out of bound: "+e);
		}
		System.out.println("Out of try-catch");
	}
}
