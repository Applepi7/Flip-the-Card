package Game;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.net.MalformedURLException;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class MenuScene {

   static ImageIcon icon;
   
   public static void main(String[] args) throws MalformedURLException {
      // TODO Auto-generated method stub
      File file = new File("Resource/mainBackground.png");
      File file2 = new File("Resource/English.png");
      File file3 = new File("Resource/Japanese.png");
      File file4 = new File("Resource/Math.png");
      icon = new ImageIcon(file.toString());
      
      JFrame frame = new JFrame("�ڰ��ҽ�");
      JPanel panel = new JPanel() {
         public void paintComponent(Graphics g) {
            g.drawImage(icon.getImage(), 0, 0, null);
            setOpaque(false);
            super.paintComponent(g);
         }
      };
      
      ImageIcon background = new ImageIcon("Resource/mainBackground.png");
      
      JButton start1 = new JButton();
      start1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                
                
                frame.dispose();
                new EnglishScene().main(args);
            }
        });
      start1.setIcon(new ImageIcon(file2.toString()));
      start1.setBorderPainted(false);
      start1.setContentAreaFilled(false);
      
      JButton start2 = new JButton();
      start2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                
                
                frame.dispose();
                new JapaneseScene().main(args);
            }
        });
      start2.setIcon(new ImageIcon(file3.toString()));
      start2.setBorderPainted(false);
      start2.setContentAreaFilled(false);
      
      JButton start3 = new JButton();
      start3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                
                
                frame.dispose();
                new MathScene().main(args);
            }
        });
      start3.setIcon(new ImageIcon(file4.toString()));
      start3.setBorderPainted(false);
      start3.setContentAreaFilled(false);
      

      panel.setSize(475, 490);
      frame.add(panel);
      panel.add(start1);
      panel.add(start2);
      panel.add(start3);
      
      frame.setSize(475, 490);
      frame.setVisible(true);
      
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
   }
}