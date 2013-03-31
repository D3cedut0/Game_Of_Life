package gameOfLife;

import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.Toolkit;
import java.lang.Math;

import javax.swing.JButton;
import javax.swing.border.TitledBorder;
import javax.swing.border.EtchedBorder;
import javax.swing.JPanel;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
/*
 * Creates the game grid and updates it.
 */
public class Grid extends JPanel {

	private static final long serialVersionUID = 1L;
	static Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
	final static int x = (int) screenSize.getWidth();
	final static int y = (int) screenSize.getHeight();
	public static int z = 15; //cell dim
	public final static int colonne = x / z;
	public final static int righe = y / z;
	public static int i;
	public static int n;
	public static JButton cell[][] = new JButton[righe][colonne];
	public static boolean Flag[][] = new boolean[righe][colonne];
	public static boolean killFlag[][] = new boolean[righe][colonne];
	public static int tempPopulation;
	public static int stabilizedCheck=0;
	
	
	/**
	 * @return Rows number.
	 */
	public static int getRowsNumber(){
		return righe;
	}
	/**
	 * @return Columns number.
	 */
	public static int getColumnsNumber(){
		return colonne;
	}
	/**
	 * @return Grid Flags.
	 */
	public static boolean[][] getGridFlags(){
		return Flag;
		}
	/**
	 * @return Grid Killed cells.
	 */
	public static boolean[][] getGridKillFlags(){
		return killFlag;
	}
	
	
	/**
	 * Creates the grid.
	 */
	public Grid() {
		setLayout(new GridLayout(righe, colonne, 0, 0));
		setBorder(new TitledBorder(new EtchedBorder(), "World"));
		for (i = 0; i < righe; i++) {
			for (n = 0; n < colonne; n++) {
				Flag[i][n] = false;
				cell[i][n] = new JButton();
				cell[i][n].setBackground(Color.black);
				add(cell[i][n]);
				cell[i][n].addActionListener(click);
				repaint();
			}
		}
	}
	/**
	 * Clean the grid.
	 */
	public static void clean() {
		for (i = 0; i < righe; i++) {
			for (n = 0; n < colonne; n++) {
				Flag[i][n] = false;
				killFlag[i][n] = false;
				cell[i][n].setBackground(Color.black);
			}
		}
	}

	/**
	 * Updates the grid.
	 */
	public static void update() {

		boolean newFlag[][]= ThreadInterface.getNewFlags();
		tempPopulation=DataPanel.populationIndex;
		DataPanel.populationIndex = 0;
		for (i = 0; i < righe; i++) {
			for (n = 0; n < colonne; n++) {
					if (killFlag[i][n] == true) {
						cell[i][n].setBackground(Color.RED);
					} else if (newFlag[i][n] == false)
						cell[i][n].setBackground(Color.black);
					else {
						cell[i][n].setBackground(Color.WHITE);
						DataPanel.populationIndex++;
					}
			}
		}
		if (tempPopulation==DataPanel.populationIndex)
			stabilizedCheck++;
		else stabilizedCheck=0;
		if (stabilizedCheck==30){
			tP();
			Status.status(9);
		}
		DataPanel.update();

	}
	/**
	 * 
	 * @return Temp population number.
	 */
	public static int tP(){
		return tempPopulation;
	}
	/**
	 * 
	 * @param y = Selected row
	 * @param x = Selected column
	 */
	public static void insFig(int y, int x) {
		switch (Frame.picNumberFlag) {
		case 00:
			new IntroPattern(y, x);
			break;
		case 1:
			new Starship(y, x);
			update();
			break;
		case 2:
			new Ship(y, x);
			break;
		case 3:
			new Glider(y, x);
			break;
		case 4:
			new Block(y, x);
			break;
		case 5:
			new Blinker(y, x);
			break;
		case 6:
			new GosperGun(y, x);
			break;
		}
		update();
	}

	/*
	 * The Mouse Click event action listener.
	 * 
	 * Change cells color, give coordinates to insert patterns.
	 */
	ActionListener click = (new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			final JButton source = (JButton) e.getSource();
			for (i = 0; i < righe; i++) {
				for (n = 0; n < colonne; n++) {
					if (source == cell[i][n]) {
						if (Frame.PFlag == true) {
							insFig(i, n);
						} else if (Frame.killCellFlag == false) {
							if (killFlag[i][n] == false) {
								if (Flag[i][n] == false) {
									Flag[i][n] = true;
									cell[i][n].setBackground(Color.WHITE);
									DataPanel.populationIndex++;
									DataPanel.update();
								} else {
									Flag[i][n] = false;
									cell[i][n].setBackground(Color.BLACK);
									DataPanel.populationIndex--;
									DataPanel.update();
								}
							}
						} else if (Frame.killCellFlag == true) {
							if (killFlag[i][n] == false) {
								killFlag[i][n] = true;
								if (Flag[i][n]){
									DataPanel.populationIndex--;
									DataPanel.update();
								}
								Flag[i][n]=false;
								cell[i][n].setBackground(Color.RED);
																
							} else {
								killFlag[i][n] = false;
								cell[i][n].setBackground(Color.BLACK);
							}
						}
					}
				}
			}
		}
	});
	/*
	 * Fills the grid with random live cells.
	 */
	public static void random() {
		for (i = 0; i < righe; i++) {
			for (n = 0; n < colonne; n++) {
				double randVal =  Math.random();
				if (randVal < 0.2)
					Flag[i][n] = true;
			}
		}
		update();
	}
}