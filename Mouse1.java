//This program is an example of mouse listener events
// a.html is the file that contains the applet code of the file
import java.applet.*;
import java.awt.event.*;
import java.awt.*;
public class Mouse1 extends Applet implements MouseListener
{
	public void init()
	{
		addMouseListener(this);
	}
	public void mouseClicked(MouseEvent me)
	{
		Graphics g = getGraphics();
		g.drawString("hello",me.getX(),me.getY());
	}
	public void mouseReleased(MouseEvent me){}
	public void mousePressed(MouseEvent me){}
	public void mouseEntered(MouseEvent me){}
	public void mouseExited(MouseEvent me){}
}

	


