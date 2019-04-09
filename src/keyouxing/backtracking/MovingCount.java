package keyouxing.backtracking;

public class MovingCount {
	public int movingCount(int threshold, int rows, int cols ) {
		
		boolean[] visited = new boolean[rows*cols];
		
		return movingCountCore(threshold, rows, cols, 0, 0, visited);
		
	}

	private int movingCountCore(int threshold, int rows, int cols, int row, int col, boolean[] visited) {
		
		if(row<0||col<0||row>=rows||col>=cols) {
			return 0;
		}
		int i = rows * row +col;
		if(visited[i] == true || checkSum(threshold, row, col)) {
			return 0;
		}
		visited[i] = true;
		return 1+movingCountCore(threshold, rows, cols, row+1, col, visited)
				+movingCountCore(threshold, rows, cols, row-1, col, visited)
				+movingCountCore(threshold, rows, cols, row, col+1, visited)
				+movingCountCore(threshold, rows, cols, row, col-1, visited);
		
	}

	private boolean checkSum(int threshold, int row, int col) {
		int rowSum = 0, colSum = 0;
		while(row!=0) {
			rowSum = rowSum+row%10;
			row = row/10;
		}
		
		while(col!=0) {
			colSum = colSum+col%10;
			col = col/10;
		}
		return colSum+rowSum > threshold ;
		
	}
	
}
