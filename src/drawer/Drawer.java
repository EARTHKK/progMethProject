package drawer;

import creeps.Creeps;
import holder.Holder;
import javafx.application.Platform;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;
import tst.ONE;
public class Drawer extends Canvas implements Runnable{
	public Thread thread = new Thread(this);
	public Drawer(double width ,double height) {
		super(width,height);
		getGraphicsContext2D().setFill(Color.PINK);
		getGraphicsContext2D().fillRect(0, 0, ONE.SIZE, ONE.SIZE);
		
		this.setVisible(true);
		Creeps aCreep = new Creeps(300, 300);
		Holder.creepHolder.add(aCreep);
		System.out.println("ADD CREEP LA");
		System.out.println("thrad start la na");
		thread.start();
		
		// WARNING TO EARTH
		// I DELETE THREAD MAI PEN ,  MUST BE DELETED BY YOURSELF NA JA
		// JAVA(TM) PLATFORM SE BINARY
		// TASK MANAGER   END IT
		System.out.println("therd stared");

	}
	
	public void paint() {
		GraphicsContext gc = this.getGraphicsContext2D();
		gc.setFill(Color.BLACK);
		System.out.println("Painting");
		for (Creeps creep : Holder.creepHolder) {
			System.out.println("paint a creep!!");
			creep.draw(gc);
//			if (entity.isVisible() && !entity.isDestroyed()) {
//				entity.draw(gc);
//			}
		}
	}

	@Override
	public void run() {
		paint();
		while(true) {
			if ( Holder.creepHolder.size() == 0) {
				thread.stop();
			}
			getGraphicsContext2D()
			try {
				thread.sleep(10);
//1				Holder.update();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
