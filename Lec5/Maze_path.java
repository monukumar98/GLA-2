package Lec5;

public class Maze_path {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int row = 3;
		int col = 3;
		mazepath(0, 0, row, col, "");

	}

	public static void mazepath(int cc, int cr, int er, int ec, String ans) {
		// TODO Auto-generated method stub
		
		if(cc==ec-1 && cr==er-1) {
			
			System.out.println(ans);
			return ;
		}
		if(cc>=ec || cr>=er) {
			return;
		}
		
		mazepath(cc+1, cr, er, ec, ans+"H");
		mazepath(cc, cr+1, er, ec, ans+"V");

	}

}
