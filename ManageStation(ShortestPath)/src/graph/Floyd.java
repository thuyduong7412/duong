package graph;

import java.util.Scanner;

public class Floyd {		
	public enum LstPoint{
		KIM_MA,
		PHO_CO,
		LE_DUAN,
		LANG;
	}
	
	//dương vô cùng
	final static int inf = 1000;
	// số đỉnh của đồ thị
	final static int N=4;
	//ma trận kề
	final static int W[][] =  {
			{0,5,1,2},
			{5,0,0,0},
			{1,0,0,4},
			{2,0,4,0}
	};
	//ma trận độ dài đường đi ngắn nhất
	static int[][] cost = new int[N][N];
	//ma trận truy vết đường đi
	static int[][] path = new int[N][N];

	public static void floyd(int[][] W) {
		// set giá trị ban đầu
		cost = W;
		for (int u=0; u < N; u++) 
			for (int v=0; v<N; v++) {
				if(W[u][v] == 0) {
					if(u != v) 	
						cost[u][v] = inf;
					path[u][v] = inf;
				} else {
					path[u][v] = v;
				}
			}
		//tối ưu hóa ma trận độ dài đường đi ngắn nhất
		for(int k=0; k<N; k++)
			for (int u=0; u < N; u++) 
				for (int v=0; v<N; v++)
					if(cost[u][v] > cost[u][k] + cost[k][v]) { // nếu đường đi qua k tốt hơn
						cost[u][v] = cost[u][k] + cost[k][v];  // gán lại đường đi mới
						path[u][v] = path[u][k];	  // truy vết đường đi là qua đỉnh k
					}
		
	}
	
	public static LstPoint change(int i) {
		LstPoint u = null;
		switch(i) {
		case 0:
			u = LstPoint.KIM_MA;
			break;
		case 1:
			u = LstPoint.PHO_CO;
			break;
		case 2:
			u = LstPoint.LE_DUAN;
			break;
		case 3:
			u = LstPoint.LANG;
			break;
		}
		return u;
	}
	 
	//INPUT
	public static int inputS() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Nhập nhà ga bắt đầu(0=KIM MÃ, 1=PHỐ CỔ, 2=LÊ DUẪN, 3=LÁNG): ");
		int s = Integer.parseInt(scan.nextLine());
		while (s<0 || s >= 4) {
			System.out.println("Nhập lại nhà ga bắt đầu: ");
			s = scan.nextInt();
		}
		return s;
	}
	public static int inputF() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Nhập nhà ga kết thúc(0=KIM MÃ, 1=PHỐ CỔ, 2=LÊ DUẪN, 3=LÁNG): ");
		int f = Integer.parseInt(scan.nextLine());
		while (f<0 || f >= 4) {
			System.out.println("Nhập lại nhà ga kết thúc: ");
			f = scan.nextInt();
		}
		scan.close();
		return f;
	}
	
	
	
	public static void main(String[] args) {
		LstPoint u = null ,v = null;
		Scanner scan = new Scanner(System.in);
		int s = inputS();
		u= change(s);
		
		int f = inputF();
		v= change(f);
		
		floyd(W);
		
		if(cost[s][f] != inf ) {
		System.out.println("Độ dài đường đi ngắn nhất từ " + u +" đến " + v + " là: " + cost[s][f]);
		System.out.print("Đường đi ngắn nhất từ " + u +" đến " + v + " là: ");
		
		while(s != f) {
			System.out.print(change(s) + " => ");
			s = path[s][f];
		}
		
		System.out.println(v);
		} else {
			System.out.println("Không tìm được đường đi từ " + u +" đến " + v );
		}
		scan.close();
	}
	
}
