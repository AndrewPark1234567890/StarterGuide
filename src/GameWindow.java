import java.awt.Graphics;

import javax.swing.JFrame;

public class GameWindow{
	public static final int WIDTH = 1000;
	public static final int HEIGHT = 1000;
int x;
int y;
JFrame window;
	GamePanel myPanel;

public static void main(String[] arg){
		new GameWindow();
	}

	GameWindow(){
		window = new JFrame();
		window.setVisible(true);
		window.setSize(WIDTH, HEIGHT);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		myPanel = new GamePanel();
		
		window.add(myPanel);
	}

}