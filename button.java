// This program displays a button and lets you click it and on clicking it, it will print hello

import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class button extends Applet implements ActionListener
{
	Button b1;
	String msg;
	public void init()
	{
		b1 = new Button("Click here");
		add(b1);
		b1.addActionListener(this);
	}
	public void actionPerformed(ActionEvent ae)
	{
		msg = "Hello";
		repaint();
	}
	public void paint(Graphics g)
	{
		 g.drawString(msg,50,200);
    }
}

