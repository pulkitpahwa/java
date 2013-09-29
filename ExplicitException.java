// In This program we throw an exception explicitly


class MyException extends Exception
{
	private int detail;
	MyException(int a)
	{
		detail = a;
	}
	public String toString()
	{
		return "MyException ["+detail+"]";
	}
}
class ExplicitException
{
	static void compute(int a) throws MyException
	{
		System.out.println("CAlled compute ("+ a +")");
		if(a>10)
		{
			throw new MyException(a);
		}
		System.out.println("Normal Exit");
	}
	public static void main(String args[])
	{
		try
		{
			compute(1);
			compute(20);
		}
		catch(MyException e)
		{
			System.out.println("caught "+ e);
		}
	}
}
