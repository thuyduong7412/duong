package beeGame;

import java.util.Random;

public class Ong_duc extends Ong {
	final int dieAt=50;
	protected Ong_duc(int i) {
		super(i);
//		super.setDieAt(50);
		super.setKind("Drone Bee");		
	}
	protected void damage() {
		int n= new Random().nextInt(101);
		if (getDie()==false) {
			this.setHealth((this.getHealth()-n)<0?0:this.getHealth()-n);
			if (this.getHealth()<dieAt) {
				this.setDie(true);
			}
		}
	}
}
