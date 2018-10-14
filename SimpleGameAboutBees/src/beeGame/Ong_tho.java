package beeGame;

import java.util.Random;

public class Ong_tho extends Ong {
	final int dieAt=70;
	protected Ong_tho(int i) 	{
		super();
		super.setId(i);
//		super.setDieAt(70);
		super.setKind("Worker Bee");
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
