package holder;

import java.util.ArrayList;
import java.util.List;

import creeps.Creeps;
import tst.ONE;

public class Holder {
	private static final Holder instance = new Holder();
	
	public static List<Creeps> creepHolder;
	public Holder() {
		creepHolder = new ArrayList<>();
	}
	
	public static void update() {
		for (int i = creepHolder.size() - 1; i >= 0; i--) {
			if ( creepHolder.get(i).x >= ONE.SIZE || creepHolder.get(i).y >= ONE.SIZE) {
				creepHolder.remove(i);
			}
			if (creepHolder.size() == 0) {
				break;
			}
			creepHolder.get(i).move();
		}
	}
}
