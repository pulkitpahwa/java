// program to pass and access paramaeters in applet and running it using Java enabled web browser-->

import java.awt.*;
import java.applet.*;
public class ParamDemo extends Applet
{
String m;
public void init()
{
	m = getParameter("nm");
	if(m == null)
	m = "Error reading parameter";
}
public void paint(Graphics g)
{
	g.drawString(m,10,20);
}
}

