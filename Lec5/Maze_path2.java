package Lec5;

public class Maze_path2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean[][] maze = new boolean[3][3];
		mazepath(0, 0, maze);

	}

	public static void mazepath(int cc, int cr, boolean[][] maze) {
         if(cc==maze[0].length-1 && cr==maze.length-1 ) {
        	 maze[cr][cc]=true;
        	 Display(maze);
        	 maze[cr][cc]=false;
        	 return;
         }
		
		
		if (cc < 0 || cc >= maze[0].length || cr < 0 || cr >= maze.length || maze[cr][cc]==true) {
			return;
		}
		int[] r = { 0, 1, 0, -1 };
		int[] c = { 1, 0, -1, 0 };
		maze[cr][cc] = true;
		for (int i = 0; i < c.length; i++) {
			mazepath(cc + c[i], cr + r[i], maze);

		}
		maze[cr][cc] = false;

	}

	public static void Display(boolean[][] maze) {
		// TODO Auto-generated method stub
		for (int i = 0; i < maze.length; i++) {
			for (int j = 0; j < maze[0].length; j++) {
				System.out.print(maze[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println();
	}

}
