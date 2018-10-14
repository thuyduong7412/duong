package beeGame;
import java.util.Random;
import java.util.Scanner;
import java.util.ArrayList;
public class MyMain {
	final static int N=10;
	static ArrayList<Ong> ten_bees = new ArrayList<Ong>(N);
// CREAT 10 BEES
	protected static void creat_bees() {
		ten_bees = new ArrayList<Ong>(N);
		Ong bee;
		int count_1=0;
		int count_2=0;
		int count_3=0;
		do {
		for (int i=0;i<N;i++) {
			int x = new Random().nextInt(3);
			switch(x) {
			case 0:
				bee= new Ong_chua(i+1);
				count_1++;
				break;
			case 1:
				bee= new Ong_duc(i+1);
				count_2++;
				break;
			default: 
				bee = new Ong_tho(i+1);
				count_3++;
				break;
			}
			ten_bees.add(bee);
		}
		} while((count_1==0) ||(count_2==0)||(count_3==0));
	}
// DISPLAY 10 BEES
	protected static void display_bees() {
		System.out.printf("%-6s%-20s%-12s%-12s\n","ID","KIND","HEALTH","STATUS");
		for (Ong bee: ten_bees) {
			bee.display();
		}
		System.out.println("-------------------------------------");
	}
// DAMAGE 10 BEES
	protected static void damage_bees() { 
	        for(Ong bee : ten_bees) {
	        	bee.damage();
	        }
	}
// MENU
	protected static void menu() {
		int count;
		int x;
		Scanner scan=new Scanner(System.in);
		do {
			
    		System.out.println("You have 3 options:");
    		System.out.println("1-Create bee list.");
    		System.out.println("2-Attack Bees.");
    		System.out.println("3-Exit");
    		System.out.print("Enter your option:");
    		x = scan.nextInt();
	    	switch (x) {
	    		case 1:
	    		//	ten_bees = new ArrayList<Ong>(N);
	    			creat_bees();
	    			display_bees();
	    			break;
	    		case 2:
	    			damage_bees();
	    			display_bees();
	    			break;
	    		case 3:
	    			break;
	    		default:
	    			System.out.println("This number is invalid. Please re-enter!");
	    			System.out.println();
	    			break;
			}
	    	count=0;
			for (Ong bee: ten_bees) {
				if (bee.getDie()==true) {
					count++;
				}
			}
	    	System.out.println();
    	} while ((x != 3)&&(count!=10));
		scan.close();
		System.out.println("               ****GAME OVER****                 ");
		System.out.println("-------------------------------------------------");
	}
// MAIN	
	public static void main(String[] args) {
		System.out.println("-------------------------------------------------");
		System.out.println("                ****GAME START****               ");
		menu();
	  }
    
 }
	
