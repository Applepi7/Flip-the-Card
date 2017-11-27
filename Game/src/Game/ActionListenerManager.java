package Game;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;

import javax.swing.ImageIcon;
import javax.swing.JButton;

public class ActionListenerManager implements ActionListener
{
	private Card c;
	public static boolean canClick = true;
	
	public ActionListenerManager(Card card)
	{
		c = card;
	}
	
	public void actionPerformed(ActionEvent e) 
	{
		c.card = (JButton) e.getSource();
		
		if(!c.isFlip)
		{
			c.card.setIcon(new ImageIcon(c.path));
			c.isFlip = true;
		}
		
		try {
			if(c.isFlip)
				EnglishScene.CompareCard(c);
	      } catch (InterruptedException e1) {
	         // TODO Auto-generated catch block
	         e1.printStackTrace();
	      }
		
	}
}
