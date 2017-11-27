package Game;
import java.net.MalformedURLException;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class Scene 
{
	final static int SIZE = 20; // 카드 개수
	final static int cardWidth = 80; // 카드 너비
	final static int cardHeight = 100; // 카드 높이
	static int cardNum = 20;
	public static ArrayList<Card> clickCardList = new ArrayList<Card>();	// 선택된 카드를 저장하는 arrayList
	public static Card[] cardArr = new Card[SIZE];
	
	public static JFrame frame;
	public static String[] args;
	
	public static boolean check_card = false;
	
	// 카드의 타입을 비교하는 함수
	public static void CompareCard(Card c) throws InterruptedException 
	{
	      clickCardList.add(c);
	   
	      if(clickCardList.size() >= 2) 
	      {
	         if((clickCardList.get(0).type == clickCardList.get(1).type) && (clickCardList.get(0).num != clickCardList.get(1).num))
	         {
	        	 // 타입이 같을 때
	        	 clickCardList.get(0).card.setEnabled(false);
	        	 clickCardList.get(1).card.setEnabled(false);
	        	 cardNum -= 2;
	        	 if(cardNum == 0)
	        	 {
	        		 JOptionPane.showMessageDialog(null, "축하합니다!(확인을 누르시면 메인메뉴로)");
	        		 frame.dispose();
	                 try {
						new MenuScene().main(args);
					} catch (MalformedURLException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					};
					cardNum = 20;
	        	 }
	        	 
	        	 clickCardList.clear();
	         }
	         else	
	         { 	        	
	        	 // 타입이 다를 때
	        	 check_card = true;
	         }
	      }
	}
	
	// 맵을 그려주는 함수
	public static void Draw()
	{
		frame = new JFrame("자강불식");
		JPanel panel = new JPanel();
		
		int cardNum[] = new int[SIZE];	// 카드 번호를 저장하는 배열
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
		
		for(int i = 0; i < cardArr.length; i++)
		{			
			cardArr[i] = new Card();
			cardArr[i].num = cardNum[i];
			cardArr[i].card.setBounds(posX , posY, cardWidth, cardHeight);
			cardArr[i].card.addActionListener(new ActionListenerManager(cardArr[i]));
			
			posX += 90;
			if((i + 1) % 5 == 0) 
			{
				posX = 10;
				posY += 110;
			}
		
			panel.add(cardArr[i].card);	// 패널에 버튼 추가
		}
		
		frame.add(panel);	// 프레임에 패널 추가

		frame.setSize(475, 490);
		frame.setVisible(true);
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
}
