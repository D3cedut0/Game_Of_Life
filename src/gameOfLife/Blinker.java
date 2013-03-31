package gameOfLife;


public class Blinker {
	
	 /**
	 *The Blinker pattern
	 * 
	 * @param int Click Row 
	 * @param int Click Column.
	 */
	public Blinker(int y, int x){ 
		if(Grid.colonne-x>=3){
	Grid.Flag[y][x]=true;
	Grid.Flag[y][x+1]=true;
	Grid.Flag[y][x+2]=true;
		}
		else
			Status.status(3);
	}
}
