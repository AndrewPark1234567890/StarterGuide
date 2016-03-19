import java.awt.Graphics;
import java.awt.Image;

public class GameObject{
	int x;
	int y;
	int height;
	int width;
	public GameObject(int x, int y, int width, int height){
		
	}
	GameObject gb = new GameObject(x, y, width, height);

	public void draw(Graphics g) {
		g.fillRect(x, y, width, height);

	}

	public void update() {

	}
}
