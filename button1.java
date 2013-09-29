import java.awt.*;
import java.awt.event.*;

class MyFrame extends Frame
{
	MyFrame(String s)
	{
		Super(s);
		addWindowListener new Winadp(this);
	}
}
class Winadp extends WindowAdapter
{
	MyFrame mf;
	Winadp(MyFrame f)
	{
		mf = f;
	}
	public void WindowClosing(WindowEvent we)
	{
		mf.setVisible(false);
		System.exit(0);
	}
}

class main{
	public static void main(String args[])
	{
		MyFrame m = new MyFrame("Frame With exit");
		m.setSize(200,200);
		m.setVisible(true);
	}
}
	
