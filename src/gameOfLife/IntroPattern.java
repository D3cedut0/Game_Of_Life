package gameOfLife;

public class IntroPattern {
	
	 /**
	 *The intro special pattern
	 * 
	 * @param int Click Row
	 * @param int Click Column.
	 */
	public IntroPattern(int y, int x) {

		Grid.Flag[y + 2][x] = true;
		Grid.Flag[y + 3][x] = true;
		Grid.Flag[y + 4][x] = true;
		Grid.Flag[y + 5][x] = true;

		Grid.Flag[y + 1][x + 1] = true;
		Grid.Flag[y + 6][x + 1] = true;

		Grid.Flag[y][x + 2] = true;
		Grid.Flag[y + 7][x + 2] = true;

		Grid.Flag[y][x + 3] = true;
		Grid.Flag[y + 4][x + 3] = true;
		Grid.Flag[y + 7][x + 3] = true;

		Grid.Flag[y][x + 4] = true;
		Grid.Flag[y + 4][x + 4] = true;
		Grid.Flag[y + 7][x + 4] = true;

		Grid.Flag[y + 1][x + 5] = true;
		Grid.Flag[y + 4][x + 5] = true;
		Grid.Flag[y + 5][x + 5] = true;
		Grid.Flag[y + 6][x + 5] = true;
		Grid.Flag[y + 7][x + 5] = true;
		Grid.Flag[y + 10][x + 5] = true;
		Grid.Flag[y + 11][x + 5] = true;
		Grid.Flag[y + 12][x + 5] = true;

		Grid.Flag[y + 13][x + 6] = true;
		// colonna 8
		Grid.Flag[y + 1][x + 7] = true;
		Grid.Flag[y + 2][x + 7] = true;
		Grid.Flag[y + 3][x + 7] = true;
		Grid.Flag[y + 4][x + 7] = true;
		Grid.Flag[y + 5][x + 7] = true;
		Grid.Flag[y + 6][x + 7] = true;
		Grid.Flag[y + 7][x + 7] = true;
		Grid.Flag[y + 13][x + 7] = true;
		// colonna 9
		Grid.Flag[y][x + 8] = true;
		Grid.Flag[y + 4][x + 8] = true;
		Grid.Flag[y + 10][x + 8] = true;
		Grid.Flag[y + 11][x + 8] = true;
		Grid.Flag[y + 12][x + 8] = true;
		// colonna 10
		Grid.Flag[y][x + 9] = true;
		Grid.Flag[y + 4][x + 9] = true;
		// colonna 11
		Grid.Flag[y][x + 10] = true;
		Grid.Flag[y + 4][x + 10] = true;
		Grid.Flag[y + 10][x + 10] = true;
		Grid.Flag[y + 11][x + 10] = true;
		Grid.Flag[y + 12][x + 10] = true;
		Grid.Flag[y + 13][x + 10] = true;
		// colonna 12
		Grid.Flag[y + 1][x + 11] = true;
		Grid.Flag[y + 2][x + 11] = true;
		Grid.Flag[y + 3][x + 11] = true;
		Grid.Flag[y + 4][x + 11] = true;
		Grid.Flag[y + 5][x + 11] = true;
		Grid.Flag[y + 6][x + 11] = true;
		Grid.Flag[y + 7][x + 11] = true;
		Grid.Flag[y + 11][x + 11] = true;
		// colonna13
		Grid.Flag[y + 12][x + 12] = true;
		// colonna14
		Grid.Flag[y][x + 13] = true;
		Grid.Flag[y + 1][x + 13] = true;
		Grid.Flag[y + 2][x + 13] = true;
		Grid.Flag[y + 3][x + 13] = true;
		Grid.Flag[y + 4][x + 13] = true;
		Grid.Flag[y + 5][x + 13] = true;
		Grid.Flag[y + 6][x + 13] = true;
		Grid.Flag[y + 7][x + 13] = true;
		Grid.Flag[y + 10][x + 13] = true;
		Grid.Flag[y + 11][x + 13] = true;
		Grid.Flag[y + 12][x + 13] = true;
		Grid.Flag[y + 13][x + 13] = true;
		// colonna15
		Grid.Flag[y + 1][x + 14] = true;
		// colonna16
		Grid.Flag[y + 2][x + 15] = true;
		Grid.Flag[y + 3][x + 15] = true;
		Grid.Flag[y + 4][x + 15] = true;
		Grid.Flag[y + 10][x + 15] = true;
		Grid.Flag[y + 11][x + 15] = true;
		Grid.Flag[y + 12][x + 15] = true;
		Grid.Flag[y + 13][x + 15] = true;
		// colonna17
		Grid.Flag[y + 1][x + 16] = true;
		// colonna18
		Grid.Flag[y][x + 17] = true;
		Grid.Flag[y + 1][x + 17] = true;
		Grid.Flag[y + 2][x + 17] = true;
		Grid.Flag[y + 3][x + 17] = true;
		Grid.Flag[y + 4][x + 17] = true;
		Grid.Flag[y + 5][x + 17] = true;
		Grid.Flag[y + 6][x + 17] = true;
		Grid.Flag[y + 7][x + 17] = true;
		Grid.Flag[y + 10][x + 17] = true;
		Grid.Flag[y + 11][x + 17] = true;
		Grid.Flag[y + 12][x + 17] = true;
		// colonna19
		Grid.Flag[y + 13][x + 18] = true;
		// colonna20
		Grid.Flag[y][x + 19] = true;
		Grid.Flag[y + 1][x + 19] = true;
		Grid.Flag[y + 2][x + 19] = true;
		Grid.Flag[y + 3][x + 19] = true;
		Grid.Flag[y + 4][x + 19] = true;
		Grid.Flag[y + 5][x + 19] = true;
		Grid.Flag[y + 6][x + 19] = true;
		Grid.Flag[y + 7][x + 19] = true;
		Grid.Flag[y + 10][x + 19] = true;
		Grid.Flag[y + 11][x + 19] = true;
		Grid.Flag[y + 12][x + 19] = true;
		// colonna21

		Grid.Flag[y][x + 20] = true;
		Grid.Flag[y + 3][x + 20] = true;
		Grid.Flag[y + 4][x + 20] = true;
		Grid.Flag[y + 7][x + 20] = true;
		// colonna22
		Grid.Flag[y][x + 21] = true;
		Grid.Flag[y + 3][x + 21] = true;
		Grid.Flag[y + 4][x + 21] = true;
		Grid.Flag[y + 7][x + 21] = true;
		Grid.Flag[y + 10][x + 21] = true;
		Grid.Flag[y + 11][x + 21] = true;
		Grid.Flag[y + 12][x + 21] = true;
		Grid.Flag[y + 13][x + 21] = true;
		// colonna23
		Grid.Flag[y][x + 22] = true;
		Grid.Flag[y + 7][x + 22] = true;
		Grid.Flag[y + 10][x + 22] = true;
		Grid.Flag[y + 12][x + 22] = true;
		// colonna24
		Grid.Flag[y][x + 23] = true;
		Grid.Flag[y + 7][x + 23] = true;
		Grid.Flag[y + 11][x + 23] = true;
		Grid.Flag[y + 13][x + 23] = true;
		// colonna29
		Grid.Flag[y + 5][x + 28] = true;
		Grid.Flag[y + 6][x + 28] = true;
		// colonna30
		Grid.Flag[y + 4][x + 29] = true;
		Grid.Flag[y + 7][x + 29] = true;
		// colonna31
		Grid.Flag[y + 4][x + 30] = true;
		Grid.Flag[y + 7][x + 30] = true;
		// colonna32
		Grid.Flag[y + 5][x + 31] = true;
		Grid.Flag[y + 6][x + 31] = true;
		// colonna34
		Grid.Flag[y + 2][x + 33] = true;
		Grid.Flag[y + 3][x + 33] = true;
		Grid.Flag[y + 4][x + 33] = true;
		Grid.Flag[y + 5][x + 33] = true;
		Grid.Flag[y + 6][x + 33] = true;
		Grid.Flag[y + 7][x + 33] = true;
		// colonna35
		Grid.Flag[y + 1][x + 34] = true;
		Grid.Flag[y + 4][x + 34] = true;
		// colonna36
		Grid.Flag[y + 1][x + 35] = true;
		Grid.Flag[y + 4][x + 35] = true;
		// colonna42
		Grid.Flag[y][x + 41] = true;
		Grid.Flag[y + 1][x + 41] = true;
		Grid.Flag[y + 2][x + 41] = true;
		Grid.Flag[y + 3][x + 41] = true;
		Grid.Flag[y + 4][x + 41] = true;
		Grid.Flag[y + 5][x + 41] = true;
		Grid.Flag[y + 6][x + 41] = true;
		Grid.Flag[y + 7][x + 41] = true;
		Grid.Flag[y + 10][x + 41] = true;
		Grid.Flag[y + 13][x + 41] = true;
		// colonna43
		Grid.Flag[y + 7][x + 42] = true;
		Grid.Flag[y + 10][x + 42] = true;
		Grid.Flag[y + 12][x + 42] = true;
		Grid.Flag[y + 13][x + 42] = true;
		// colonna44
		Grid.Flag[y + 7][x + 43] = true;
		Grid.Flag[y + 11][x + 43] = true;
		Grid.Flag[y + 13][x + 43] = true;
		// colonna45
		Grid.Flag[y + 7][x + 44] = true;
		// colonna46
		Grid.Flag[y + 7][x + 45] = true;
		Grid.Flag[y + 11][x + 45] = true;
		Grid.Flag[y + 12][x + 45] = true;
		// colonna47
		Grid.Flag[y + 10][x + 46] = true;
		Grid.Flag[y + 13][x + 46] = true;
		// colonna48
		Grid.Flag[y][x + 47] = true;
		Grid.Flag[y + 2][x + 47] = true;
		Grid.Flag[y + 3][x + 47] = true;
		Grid.Flag[y + 4][x + 47] = true;
		Grid.Flag[y + 5][x + 47] = true;
		Grid.Flag[y + 6][x + 47] = true;
		Grid.Flag[y + 7][x + 47] = true;
		Grid.Flag[y + 11][x + 47] = true;
		Grid.Flag[y + 12][x + 47] = true;
		// colonna50
		Grid.Flag[y][x + 49] = true;
		Grid.Flag[y + 1][x + 49] = true;
		Grid.Flag[y + 2][x + 49] = true;
		Grid.Flag[y + 3][x + 49] = true;
		Grid.Flag[y + 4][x + 49] = true;
		Grid.Flag[y + 5][x + 49] = true;
		Grid.Flag[y + 6][x + 49] = true;
		Grid.Flag[y + 7][x + 49] = true;
		Grid.Flag[y + 10][x + 49] = true;
		// colonna51
		Grid.Flag[y][x + 50] = true;
		Grid.Flag[y + 4][x + 50] = true;
		Grid.Flag[y + 10][x + 50] = true;
		Grid.Flag[y + 11][x + 50] = true;
		Grid.Flag[y + 12][x + 50] = true;
		Grid.Flag[y + 13][x + 50] = true;
		// colonna52
		Grid.Flag[y][x + 51] = true;
		Grid.Flag[y + 4][x + 51] = true;
		// colonna53
		Grid.Flag[y][x + 52] = true;
		Grid.Flag[y + 4][x + 52] = true;
		Grid.Flag[y + 10][x + 52] = true;
		Grid.Flag[y + 13][x + 52] = true;
		// colonna54
		Grid.Flag[y][x + 53] = true;
		Grid.Flag[y + 10][x + 53] = true;
		Grid.Flag[y + 11][x + 53] = true;
		Grid.Flag[y + 13][x + 53] = true;
		// colonna55
		Grid.Flag[y + 11][x + 54] = true;
		Grid.Flag[y + 12][x + 54] = true;
		// colonna56
		Grid.Flag[y][x + 55] = true;
		Grid.Flag[y + 1][x + 55] = true;
		Grid.Flag[y + 2][x + 55] = true;
		Grid.Flag[y + 3][x + 55] = true;
		Grid.Flag[y + 4][x + 55] = true;
		Grid.Flag[y + 5][x + 55] = true;
		Grid.Flag[y + 6][x + 55] = true;
		Grid.Flag[y + 7][x + 55] = true;
		// colonna57
		Grid.Flag[y][x + 56] = true;
		Grid.Flag[y + 3][x + 56] = true;
		Grid.Flag[y + 4][x + 56] = true;
		Grid.Flag[y + 7][x + 56] = true;
		// colonna58
		Grid.Flag[y][x + 57] = true;
		Grid.Flag[y + 3][x + 57] = true;
		Grid.Flag[y + 4][x + 57] = true;
		Grid.Flag[y + 7][x + 57] = true;
		// colonna59
		Grid.Flag[y][x + 58] = true;
		Grid.Flag[y + 7][x + 58] = true;
		// colonna60
		Grid.Flag[y][x + 59] = true;
		Grid.Flag[y + 7][x + 59] = true;

	}
}
