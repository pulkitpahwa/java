// This program demonstrates the use of passing and returning objects in java


class Demo
{
	int x;
	Demo(){
	System.out.println("Welcome");
	}
	Demo(int a)
	{
		x = a;
	}
	void copy(Demo d)     // passing object
	{
		d.x = 20;
	}
	Demo twice()			// returning objcet
	{
		Demo t =  new Demo();
		t.x = 40;
		return t;
	}
	void show()
	{
		System.out.println("x = "+x);
	}
}


class ObjectPassingReturning
{
	public static void main(String args[])
	{
		Demo d1 = new Demo(10);
		Demo d2 = new Demo();
		d1.copy(d2);	// passing object as argument
		d1.show();
		d2.show();
		Demo d3 = d1.twice(); //object returned
		d3.show();
	}
}

