import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;


public class EnglishScene {

	final static int SIZE = 20; // 카드 개수
	final static int cardWidth = 80; // 카드 너비
	final static int cardHeight = 100; // 카드 높이
	static int index = 0;
	
	public enum Type	// 문제 번호
	{
		FIRST,
		SECOND,
		THIRD,
		FOURTH,
		FIFTH,
		SIXTH,
		SEVENTH,
		EIGHTH,
		NINTH,
		TENTH
	};
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame frame = new JFrame("카드게임 아하핳ㅎ하ㅏ핳");
		JPanel panel = new JPanel();
		Card[] cardArr = new Card[SIZE];
		ArrayList<Card> clickCardList = new ArrayList<Card>();
		
		int cardNum[] = new int[SIZE];	// 카드 번호를 저장하는 배열
		//boolean bCheckExistOfNum[] = new boolean[SIZE]; // 중복 체크를 하는 배열
		int posX = 10;
		int posY = 10;
		
		frame.setLayout(null);
		panel.setLayout(null);
		
		panel.setSize(475, 490);
		
		
	
		for(int i = 0; i<cardNum.length; i++)	// 중복되지않는 랜덤값 부여
		{
			cardNum[i] = (int)(Math.random() * 20) + 1;
			
			for(int j=0; j<i; j++)
			{
				if(cardNum[i] == cardNum[j])
				{
					i--;
					break;
				}
			}
		}
		
		for(int i = 0; i<cardArr.length; i++)
		{
						
			cardArr[i] = new Card();
			cardArr[i].num = cardNum[i];
			cardArr[i].card.setBounds(posX , posY, cardWidth, cardHeight);
			cardArr[i].card.addActionListener(new ActionListenerManager(cardArr[i]));
			
			switch(cardArr[i].num)
			{
			case 1:
				cardArr[i].path = "Resource/Eng/1_1.png";
				cardArr[i].type = 1;
				break;
			case 2:
				cardArr[i].path = "Resource/Eng/1_2.png";
				cardArr[i].type = 1;
				break;
			case 3:
				cardArr[i].path = "Resource/Eng/2_1.png";
				cardArr[i].type = 2;
				break;
			case 4:
				cardArr[i].path = "Resource/Eng/2_2.png";
				cardArr[i].type = 2;
				break;
			case 5:
				cardArr[i].path = "Resource/Eng/3_1.png";
				cardArr[i].type = 3;
				break;
			case 6:
				cardArr[i].path = "Resource/Eng/3_2.png";
				cardArr[i].type = 3;
				break;
			case 7:
				cardArr[i].path = "Resource/Eng/4_1.png";
				cardArr[i].type = 4;
				break;
			case 8:
				cardArr[i].path = "Resource/Eng/4_2.png";
				cardArr[i].type = 4;
				break;
			case 9:
				cardArr[i].path = "Resource/Eng/5_1.png";
				cardArr[i].type = 5;
				break;
			case 10:
				cardArr[i].path = "Resource/Eng/5_2.png";
				cardArr[i].type = 5;
				break;
			case 11:
				cardArr[i].path = "Resource/Eng/6_1.png";
				cardArr[i].type = 6;
				break;
			case 12:
				cardArr[i].path = "Resource/Eng/6_2.png";
				cardArr[i].type = 6;
				break;
			case 13:
				cardArr[i].type = 7;
				cardArr[i].path = "Resource/Eng/7_1.png";
				break;
			case 14:
				cardArr[i].path = "Resource/Eng/7_2.png";
				cardArr[i].type = 7;
				break;
			case 15:
				cardArr[i].path = "Resource/Eng/8_1.png";
				cardArr[i].type = 8;
				break;
			case 16:
				cardArr[i].path = "Resource/Eng/8_2.png";
				cardArr[i].type = 8;
				break;
			case 17:
				cardArr[i].path = "Resource/Eng/9_1.png";
				cardArr[i].type = 9;
				break;
			case 18:
				cardArr[i].path = "Resource/Eng/9_2.png";
				cardArr[i].type = 9;
				break;
			case 19:
				cardArr[i].path = "Resource/Eng/10_1.png";
				cardArr[i].type = 10;
				break;
			case 20:
				cardArr[i].path = "Resource/Eng/10_2.png";
				cardArr[i].type = 10;
				break;
			}
			
			posX += 90;
			if((i + 1) % 5 == 0) 
			{
				posX = 10;
				posY += 110;
			}
		
			panel.add(cardArr[i].card);
		}
		
		frame.add(panel);

		frame.setSize(475, 490);
		frame.setVisible(true);
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		while(true)
		{			
			for(int i = 0; i < cardArr.length; i++)
			{
				if(cardArr[i].isFlip == true)
				{
					clickCardList.add(cardArr[i]);
					System.out.println(clickCardList.get(0).type);
				}
			}
			
			if(clickCardList.get(0) != null)
			{
				if(clickCardList.get(0).type == clickCardList.get(1).type)
				{
					clickCardList.get(0).card.setEnabled(false);
					clickCardList.get(1).card.setEnabled(false);
				}
				else
				{
					clickCardList.get(0).card.setIcon(new ImageIcon("Resource/backImage.png"));
					clickCardList.get(1).card.setIcon(new ImageIcon("Resource/backImage.png"));
				}
				clickCardList.remove(0);
				clickCardList.remove(1);
			}
			/*
			 */
		}
		
	}

}
