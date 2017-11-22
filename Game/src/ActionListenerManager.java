import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;

public class ActionListenerManager implements ActionListener
{
	private int num = 0;
	
	public void actionPerformed(ActionEvent e) 
	{
		JButton b = (JButton) e.getSource();
		if(num == 0)
		{
			b.setIcon(new ImageIcon("Resource/Eng/1_1.png"));
		}
	}
}
