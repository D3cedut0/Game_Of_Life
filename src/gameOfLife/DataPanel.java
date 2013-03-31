package gameOfLife;

import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;

/*
 * Creation and updating of the informations about the game.
 */
public class DataPanel extends JPanel {
	public static int populationIndex = 0;
	public static int generationIndex = 0;
	public static String status = "Waiting for inputs";
	static JLabel generation = new JLabel("Generation: " + generationIndex);
	static JLabel population = new JLabel("Population: " + populationIndex);
	private static JLabel speedindex = new JLabel("Fps: " + Slider.dFps());
	static JLabel gameStatus = new JLabel("Game Information: " + status);

	static JPanel upperPanel = new JPanel();
	static JPanel lowerPanel = new JPanel();
	 
	
	/**
	 * Create the info panel.
	 * 
	 * 
	 */
	public DataPanel() {

		TitledBorder title3 = new TitledBorder("GameData");
		title3.setTitleJustification(TitledBorder.LEFT);

		GridLayout dataGrid = new GridLayout(1, 3);
		GridLayout panelDivision = new GridLayout(2, 1);

		setLayout(panelDivision);
		setBorder(title3);
		add(upperPanel);
		add(lowerPanel);

		upperPanel.setLayout(dataGrid);
		lowerPanel.setLayout(dataGrid);

		upperPanel.setBackground(Color.yellow);
		lowerPanel.setBackground(Color.yellow);

		upperPanel.add(generation);
		upperPanel.add(population);
		upperPanel.add(speedindex);

		lowerPanel.add(gameStatus);

	}

	 /**
	 *	Updates the info panel.
	 * 
	 */
	public static void update() {
		// repaint();
		generation.setText("Generation: " + generationIndex);
		population.setText("Population: " + populationIndex);
		speedindex.setText("Fps: " + Slider.dFps());
		gameStatus.setText("Game Information: " + status);

	}

}
