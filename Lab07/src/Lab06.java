
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
@SuppressWarnings("serial")
public class Lab06 extends JPanel{
	
	public void paintComponant(Graphics g){
		super.paintComponents(g);
		this.setBackground(Color.MAGENTA);
		g.setColor(Color.BLACK);
		g.fillRect(10, 20, 50, 25);
		g.setColor(new Color(120,51,78));
		g.fillRect(10,25,50,25);
		g.setColor(Color.BLUE);
		g.drawString("Some text is there", 20,30);
	}

	

}
