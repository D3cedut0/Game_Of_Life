package gameOfLife;


/*
 * The class of algorithm
 */
public class NextGeneration {
	
	
	/**
	 * The algorithm sets cells to live or death.
	 * 
	 * @param rowsMin
	 * @param rowsMax
	 * @param columnsMin 
	 * @param columnsMax
	 */
	public static void nextGeneration(int rowsMin, int rowsMax, int columnsMin,int columnsMax) {
		int nearAlive;
		
		
		for (int i = rowsMin; i < rowsMax; i++) {
			for (int n = columnsMin; n < columnsMax; n++) {
				nearAlive = 0;
				
				// Top
				if (i - 1 >= 0 && n - 1 >= 0) {
					if(ThreadInterface.killFlag[i][n] == false){
						if (ThreadInterface.tempCells[i - 1][n - 1]) nearAlive += 1;
					}
				}
				if (i - 1 >= 0) {
					if(ThreadInterface.killFlag[i][n] == false){
						if (ThreadInterface.tempCells[i - 1][n]) nearAlive += 1;
					}
				}
				if (n + 1 < ThreadInterface.columns && i - 1 >= 0) {
					if(ThreadInterface.killFlag[i][n] == false){
						if (ThreadInterface.tempCells[i - 1][n + 1]) nearAlive += 1;
					}
				}
			
				// Mid
				if (n - 1 >= 0) {
					if(ThreadInterface.killFlag[i][n] == false){
						if (ThreadInterface.tempCells[i][n - 1]) nearAlive += 1;
					}
				}
				if (n + 1 < ThreadInterface.columns) {
					if(ThreadInterface.killFlag[i][n] == false){
					if (ThreadInterface.tempCells[i][n + 1]) nearAlive += 1;
					}
				}
				
				// Bottom
				if (n - 1 >= 0 && i + 1 < ThreadInterface.rows) {
					if(ThreadInterface.killFlag[i][n] == false){
					if (ThreadInterface.tempCells[i + 1][n - 1]) nearAlive += 1;
					}
				}
				if (i + 1 < ThreadInterface.rows) {
					if(ThreadInterface.killFlag[i][n] == false){
					if (ThreadInterface.tempCells[i + 1][n]) nearAlive += 1;
					}
				}
				if (n + 1 < columnsMax && i + 1 < ThreadInterface.rows) {
					if(ThreadInterface.killFlag[i][n] == false){
					if (ThreadInterface.tempCells[i + 1][n + 1]) nearAlive += 1;
					}
				}
				
				// Rules
				if (nearAlive < 2 || nearAlive > 3) {
					ThreadInterface.newFlags[i][n] = false;
				}
				if (nearAlive == 2 || nearAlive > 3) {
				}
				if (nearAlive == 3) {
					ThreadInterface.newFlags[i][n] = true;
				}
			}
		}
	}
}