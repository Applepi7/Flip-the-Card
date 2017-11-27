package Game;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

import javax.swing.ImageIcon;

public class MathScene extends Scene{

	public static void main(String[] args){    
		Runnable runnable = new Runnable() {
			
			public void run() {
			
					if(check_card){
					
				        try {
							Thread.sleep(500);
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
				        clickCardList.get(0).card.setIcon(new ImageIcon("Resource/backImage.png"));
				        clickCardList.get(0).isFlip = false;
				        clickCardList.get(1).card.setIcon(new ImageIcon("Resource/backImage.png"));
				        clickCardList.get(1).isFlip = false;
				        check_card = false;
				        clickCardList.clear();
					}
				
			}
			
		};
			
			ScheduledExecutorService service = Executors.newSingleThreadScheduledExecutor();
			


		Draw();
		service.scheduleAtFixedRate(runnable, 0, 1, TimeUnit.MILLISECONDS);
	      
		for(int i = 0; i<cardArr.length; i++)
		{
			
			switch(cardArr[i].num)
			{
			case 1:
				cardArr[i].path = "Resource/Math/1_1.png";
				cardArr[i].type = 1;
				break;
			case 2:
				cardArr[i].path = "Resource/Math/1_2.png";
				cardArr[i].type = 1;
				break;
			case 3:
				cardArr[i].path = "Resource/Math/2_1.png";
				cardArr[i].type = 2;
				break;
			case 4:
				cardArr[i].path = "Resource/Math/2_2.png";
				cardArr[i].type = 2;
				break;
			case 5:
				cardArr[i].path = "Resource/Math/3_1.png";
				cardArr[i].type = 3;
				break;
			case 6:
				cardArr[i].path = "Resource/Math/3_2.png";
				cardArr[i].type = 3;
				break;
			case 7:
				cardArr[i].path = "Resource/Math/4_1.png";
				cardArr[i].type = 4;
				break;
			case 8:
				cardArr[i].path = "Resource/Math/4_2.png";
				cardArr[i].type = 4;
				break;
			case 9:
				cardArr[i].path = "Resource/Math/5_1.png";
				cardArr[i].type = 5;
				break;
			case 10:
				cardArr[i].path = "Resource/Math/5_2.png";
				cardArr[i].type = 5;
				break;
			case 11:
				cardArr[i].path = "Resource/Math/6_1.png";
				cardArr[i].type = 6;
				break;
			case 12:
				cardArr[i].path = "Resource/Math/6_2.png";
				cardArr[i].type = 6;
				break;
			case 13:
				cardArr[i].type = 7;
				cardArr[i].path = "Resource/Math/7_1.png";
				break;
			case 14:
				cardArr[i].path = "Resource/Math/7_2.png";
				cardArr[i].type = 7;
				break;
			case 15:
				cardArr[i].path = "Resource/Math/8_1.png";
				cardArr[i].type = 8;
				break;
			case 16:
				cardArr[i].path = "Resource/Math/8_2.png";
				cardArr[i].type = 8;
				break;
			case 17:
				cardArr[i].path = "Resource/Math/9_1.png";
				cardArr[i].type = 9;
				break;
			case 18:
				cardArr[i].path = "Resource/Math/9_2.png";
				cardArr[i].type = 9;
				break;
			case 19:
				cardArr[i].path = "Resource/Math/10_1.png";
				cardArr[i].type = 10;
				break;
			case 20:
				cardArr[i].path = "Resource/Math/10_2.png";
				cardArr[i].type = 10;
				break;
			}
		
		}
	}

}
