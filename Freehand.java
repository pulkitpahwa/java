// This program is the demo of the free hand polygoin drawing in java
// b.html is conatining the applet code of this program
import java.awt.*;
import java.awt.event.*;
import java.applet.*;
public class Freehand extends Applet
{
	public void paint(Graphics g)
	{
		int xpoint[] = {100,200,70};
		int ypoint[] = {50, 90, 100};
		Polygon p = new Polygon(xpoint, ypoint,3);
		g.drawPolygon(p);
		g.fillPolygon(p);
	}
}
