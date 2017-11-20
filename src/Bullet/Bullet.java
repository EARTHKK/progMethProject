package Bullet;

import creeps.Creeps;

public class Bullet {
	public int x,y;
	public Creeps target;
	public int speed;
	public boolean isDestroyed;
	public Bullet(int x, int y, Creeps target) {
		this.x = x;
		this.y = y;
		this.target = target;
	}
	
	public void moveToTarget() {
		
	}
	
}
