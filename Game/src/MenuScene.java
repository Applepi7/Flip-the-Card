import javax.swing.*;

public class MenuScene {

	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame frame = new JFrame("카드게임 아하핳ㅎ하ㅏ핳");
		JPanel panel = new JPanel();
		
		ImageIcon background = new ImageIcon("Resource/mainBackground.png");
		JButton start = new JButton("Start");
		
		panel.setSize(475, 490);
		
		frame.add(panel);
		panel.add(start);
		
		frame.setSize(475, 490);
		frame.setVisible(true);
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
