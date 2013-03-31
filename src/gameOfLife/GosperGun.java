package gameOfLife;

public class GosperGun {
	
	 /**
	 *The GosperGun pattern
	 * 
	 * @param int Click Row
	 * @param int Click Column.
	 */
	public GosperGun(int y, int x) { 
		if ((Grid.colonne - x >= 36) && (Grid.righe - y >= 4) && y>=4) {
			Grid.Flag[y][x] = true;
			Grid.Flag[y + 1][x] = true;
			Grid.Flag[y + 1][x + 1] = true;
			Grid.Flag[y][x+1] = true;
			
			Grid.Flag[y][x + 10] = true;
			Grid.Flag[y + 1][x + 10] = true;
			Grid.Flag[y + 2][x + 10] = true;
			
			Grid.Flag[y -1][x + 11] = true;
			Grid.Flag[y + 3][x + 11] = true;

			Grid.Flag[y -2][x + 12] = true;
			Grid.Flag[y - 2][x + 13] = true;
			
			Grid.Flag[y + 4][x + 12] = true;
			Grid.Flag[y + 4][x + 13] = true;
			
			Grid.Flag[y + 1][x + 14] = true;
			
			Grid.Flag[y - 1][x + 15] = true;
			Grid.Flag[y + 3][x+ 15] = true;
			
			Grid.Flag[y][x + 16] = true;
			Grid.Flag[y + 1][x + 16] = true;
			Grid.Flag[y + 2][x + 16] = true;
			
			Grid.Flag[y + 1][x + 17] = true;
			
			Grid.Flag[y][x + 20] = true;
			Grid.Flag[y - 1][x + 20] = true;
			Grid.Flag[y - 2][x + 20] = true;

			Grid.Flag[y][x + 21] = true;
			Grid.Flag[y - 1][x + 21] = true;
			Grid.Flag[y - 2][x + 21] = true;
			
			Grid.Flag[y - 3][x + 22] = true;
			Grid.Flag[y + 1][x + 22] = true;

			Grid.Flag[y - 4][x + 24] = true;
			Grid.Flag[y - 3][x + 24] = true;

			Grid.Flag[y + 1][x + 24] = true;
			Grid.Flag[y + 2][x + 24] = true;

			Grid.Flag[y - 1][x + 34] = true;
			Grid.Flag[y -1][x + 35] = true;

			Grid.Flag[y -2][x + 34] = true;
			Grid.Flag[y -2][x + 35] = true;
		} else
			Status.status(3);
	}
}
