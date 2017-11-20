package creeps;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

public class Creeps {
	public double x,y;
	public int hp;
	public int radius = 10;
	public int speed = 4;
//	public boolean isDestroyed = false;
//	public String[] directions =  
	public Creeps(int x,int y) {
		this.x = x;
		this.y = y;
	}
	
	public void move() {
		x += speed;
	}
//	public boolean isDestroyed() {
//		return isDestroyed;
//	}
	public void draw(GraphicsContext gc) {
		System.out.println("Draw leaw ");
		gc.setFill(Color.BLUE);
		gc.fillRect(x, y, 10, 10);
	}

}
