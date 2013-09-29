// This program demonstrates the keyboard listener


import java.awt.*;
import java.applet.*;
import java.awt.event.*;
class KeyDemo extends Applet implements KeyListener
{
	String msg = " " ;
	public void init()
	{
		addKeyListener(this);
	}
	public void keyPressed(KeyEvent ke)
	{
		msg = "Key is down";
		repaint();
	}
	public void keyReleased(KeyEvent ke)
	{
		msg = "key is released";
		repaint();
	}
	public void keyTyped(KeyEvent ke)	
	{
		msg = "key is typed";
		repaint();
	}
	public void paint(Graphics g)
	{
		g.drawString(msg,40,40);
	}
}
