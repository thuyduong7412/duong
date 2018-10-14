package beeGame;

import java.util.Random;

public class Ong {
	 private int id;
	 private int health;
	 private Boolean die;
	 private String kind;
	 
	public String getKind() {
		return kind;
	}
	public void setKind(String kind) {
		this.kind = kind;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getHealth() {
		return health;
	}
	public void setHealth(int health) {
		this.health = health;
	}
	public Boolean getDie() {
		return die;
	}
	public void setDie(Boolean die) {
		this.die = die;
	}	
// METHOD CONSTRUCTOR K CO ID
	protected Ong(int i) {
		setId(i);
		setHealth(100);
		setDie(false);
	}
// METHOD CONSTRUCTOR CO ID
	protected Ong() {
		setHealth(100);
		setDie(false);
	}
// DAMAGE A BEE
	protected void damage() {
		int n= new Random().nextInt(101);
		if (getDie()==false) {
			this.setHealth(this.getHealth()-n);
		}
	}
//DISPLAY A BEE
	public void display() {
		System.out.printf("%-6d",getId());
		System.out.printf("%-20s",getKind());
		System.out.printf("%-12d", getHealth());
		if (getDie()==false) {
			System.out.printf("%-12s%n","Alive");
		} else {
			System.out.printf("%-12s%n","Dead");
		}
	}
}
