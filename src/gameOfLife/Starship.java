package gameOfLife;

public class Starship {
	
	 /**
	 *The Starship pattern
	 * 
	 * @param int Click Row; 
	 * @param int Click Column.
	 */
	public Starship(int y, int x) {
		if (Grid.colonne - x >= 5 && Grid.righe -y >=4) {
			Grid.Flag[y][x] = true;

			Grid.Flag[y][x + 3] = true;

			Grid.Flag[y + 1][x + 4] = true;
			Grid.Flag[y + 2][x + 4] = true;
			Grid.Flag[y + 3][x + 4] = true;

			Grid.Flag[y + 3][x + 1] = true;
			Grid.Flag[y + 3][x + 2] = true;
			Grid.Flag[y + 3][x + 3] = true;

			Grid.Flag[y + 2][x] = true;
		} else
			Status.status(3);
	}
}
