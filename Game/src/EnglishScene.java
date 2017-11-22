import javax.swing.*;
import java.awt.*;


public class EnglishScene {

	final static int SIZE = 20; // 카드 개수
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame frame = new JFrame("카드게임 아하핳ㅎ하ㅏ핳");
		JPanel panel = new JPanel();
		JButton[] cardArr = new JButton[SIZE];
		
		int cardNum[] = new int[SIZE];	// 카드 번호를 저장하는 배열
		boolean bCheckExistOfNum[] = new boolean[SIZE]; // 중복 체크를 하는 배열
		int posX = 10;
		int posY = 10;
		
		final int cardWidth = 80;
		final int cardHeight = 100;
		
		frame.setLayout(null);
		
		for(int i = 0; i<cardArr.length; i++)
		{
			cardNum[i] = i + 1;
			
			cardArr[i] = new JButton(new ImageIcon("Resource/backImage.png"));
			cardArr[i].setBounds(posX , posY, cardWidth, cardHeight);
			cardArr[i].addActionListener(new ActionListenerManager());
			
			posX += 90;
			if((i + 1) % 5 == 0) 
			{
				posX = 10;
				posY += 110;
			}
		
			frame.add(cardArr[i]);
		}

		
		frame.add(panel);

		frame.setSize(475, 490);
		frame.setVisible(true);
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
