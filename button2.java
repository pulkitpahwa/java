//This program has 2 buttons. Clicking one will disable one and enbable second . Clicking second will disable econd and enable first


import java.awt.*;
import java.awt.event.*;
import java.applet.*;

public class  button2 extends Applet implements ActionListener
{
	public void init()
	{
		b1 = new Button("Click to enable second");
		add(b1);
		b1.setLabel("OK");
		b1.addActionListener(this);
		b2 = new Button("Cancel to enable first");
		add(b2);
		b2.setlabel("Click");
		b2.addActionListener(this);
	}
	public void actionPerformer(ActionEvent ae)
	{
		msg = "You enabled first";
		repaint();
	}
	public Boolean setAction()
	{

		if (this.getLabel == "OK")
		{
			b2.setEnable(false);
		}
		else if(this.getLabel()=="cancel")
		{
			b1.setEnable(true);
		}
	}

	public void paint(Graphics g)
	{
		g.drawString(msg,50,200);
	}
}


