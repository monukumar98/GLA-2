package GLA_G1_8_10;

public class Queen {
	public static void main(String[] args) {
//		Queen_comb(0, 0, 4, 2, "");
//		Queen_comb_2D(0, 0, 0, 3, 3, 2, "");
//		Queen_comb_2D_kill(0, 0, 0, 3, 3, 2, "", new boolean[3][3]);
		box_perm(0, 2, "", new boolean[4]);
	}

	public static void Queen_comb(int curr_Q, int col, int col_t, int tot_Q, String ans) {
		if (curr_Q == tot_Q) {
			System.out.println(ans);
			return;
		}
		// -ve BC
		if (col == col_t) {
			return;
		}
		// Select
		Queen_comb(curr_Q + 1, col + 1, col_t, tot_Q, ans + "q" + col + " ,");
//		Not Selected
		Queen_comb(curr_Q, col + 1, col_t, tot_Q, ans);
	}

	public static void Queen_comb_2D(int curr_Q, int row, int col, int row_t, int col_t, int tot_Q, String ans) {
		if (curr_Q == tot_Q) {
			System.out.println(ans);
			return;
		}
		// -Move in next row?!
		if (col == col_t) {
			col = 0;
			row++;
		}
		if (row == row_t) {
			return;
		}
		// Select
		Queen_comb_2D(curr_Q + 1, row, col + 1, row_t, col_t, tot_Q, ans + "q{" + row + "," + col + "} ,");
//		Not Selected
		Queen_comb_2D(curr_Q, row, col + 1, row_t, col_t, tot_Q, ans);
	}

	public static void Queen_comb_2D_kill(int curr_Q, int row, int col, int row_t, int col_t, int tot_Q, String ans,
			boolean[][] board) {
		if (curr_Q == tot_Q) {
			System.out.println(ans);
			return;
		}
		// -Move in next row?!
		if (col == col_t) {
			col = 0;
			row++;
		}
		if (row == row_t) {
			return;
		}
		if (safe(board, row, col)) {
// 		Select
			board[row][col] = true;
			Queen_comb_2D_kill(curr_Q + 1, row, col + 1, row_t, col_t, tot_Q, ans + "q{" + row + "," + col + "} ,",
					board);
			board[row][col] = false;
		}
//		Not Selected
		Queen_comb_2D_kill(curr_Q, row, col + 1, row_t, col_t, tot_Q, ans, board);
	}

	private static boolean safe(boolean[][] board, int row, int col) {
		// TODO Auto-generated method stub
//		Upar
		for (int r = 0; r < row; r++) {
			if (board[r][col]) {
				return false;
			}
		}
//		Left
		for (int c = 0; c < col; c++) {
			if (board[row][c]) {
				return false;
			}
		}
//		D1
		int r1 = row;
		int c1 = col;
		while (c1 >= 0 && r1 >= 0) {
			if (board[r1][c1]) {
				return false;
			}
			r1--;
			c1--;
		}
//		D1
		int r2 = row;
		int c2 = col;
		while (c2 < board[0].length && r2 >= 0) {
			if (board[r2][c2]) {
				return false;
			}
			r2--;
			c2++;
		}
		return true;
	}

	public static void box_perm(int curr_B, int tot_B, String ans, boolean[] boxes) {
		if(curr_B==tot_B) {
			System.out.println(ans);
			return;
		}
		for (int i = 0; i < boxes.length; i++) {
			if (!boxes[i]) {
				boxes[i] = true;
				box_perm(curr_B + 1, tot_B, ans + i, boxes);
				boxes[i] = false;
			}
		}

	}
}
