package gameOfLife;

public class Block {
	
	 /**
	 *The Block pattern
	 * 
	 * @param int Click Row
	 * @param int Click Column.
	 */
	public Block(int y, int x) { // y = riga,, x = colonna mi raccomando seba!!
		if (Grid.colonne - x >= 2 && Grid.righe -y >=2) {
			Grid.Flag[y][x] = true;
			Grid.Flag[y][x + 1] = true;
			Grid.Flag[y + 1][x] = true;
			Grid.Flag[y + 1][x + 1] = true;
		} else
			Status.status(3);
	}
}
