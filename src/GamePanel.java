import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;

import javax.imageio.ImageIO;
import javax.swing.JPanel;
import javax.swing.Timer;

public class GamePanel extends JPanel implements ActionListener {
	int x = 9;
	int y = 100;
	int xspeed = 20;
	int yspeed = 5;

	public GamePanel() {
		BufferedImage image = null;
		try
		{
		image = ImageIO.read(this.getClass().getResourceAsStream(“bgrnd.jpg”);
		}
		catch(Exception e)
		{
			System.err.println(“There was an error loading your image.”);
		}        
                                               
		ImageObject myImageObject = new ImageObject(10, 10, 100, 100, image);

		Timer gameTimer = new Timer(10, this);
		gameTimer.start();
		// TODO Auto-generated constructor stub
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		repaint();
	}

	public void paintComponent(Graphics g) {
		g.fillRect(x, y, 20, 10);
		g.fillRect(x + 15, y + 20, 10, 10);
		g.fillRect(x + 30, y, 20, 10);
		g.fillRect(x, y + 35, 50, 10);
		// g.fillRect(x += xspeed, y + yspeed, 200, 200);
		// if (x >= 500) {
		// g.fillRect(x += xspeed, y += yspeed, 200, 200);
		// xspeed = -20;
		// yspeed = -20;
		// }else if(x<=0){
		// g.fillRect(x += xspeed, y += yspeed, 200, 200);
		// xspeed = +20;
		// yspeed= +20;
		// }
		//
	}
}
