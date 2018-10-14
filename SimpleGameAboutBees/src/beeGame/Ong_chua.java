package beeGame;

import java.util.Random;

public class Ong_chua extends Ong {
	final int dieAt=20;
	protected Ong_chua(int i) 	{
		super();
		super.setId(i);
//		super.setDieAt(20);
		super.setKind("Queen Bee");
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

