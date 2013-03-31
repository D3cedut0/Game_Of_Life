package gameOfLife;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;

/*
 * Create the graphical environment. 
 */
public class Frame extends JFrame {
	Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();

	/*
	 * Flag creation
	 */
	public static boolean killCellFlag = false;
	public static boolean gameStateFlag = false;
	public static boolean veichleFlag = false;
	public static boolean figuresFlag = false;
	public static boolean starshipPFlag = false;
	public static boolean shipPFlag = false;
	public static boolean gliderPFlag = false;
	public static boolean blockPFlag = false;
	public static boolean blinkerPFlag = false;
	public static boolean gosperGunPFlag = false;
	public static boolean PFlag = false;
	public static boolean ClickPicFlag = false;
	public static int picNumberFlag = 00;

public Frame(String initName){
	super(initName);

	/*
	 * creation of the panel titles
	 */
	TitledBorder title = new TitledBorder("GameState");
	title.setTitleJustification(TitledBorder.CENTER);
	TitledBorder title2 = new TitledBorder("Patterns");
	title2.setTitleJustification(TitledBorder.CENTER);
	TitledBorder title5 = new TitledBorder("Click to inserect");
	title5.setTitleJustification(TitledBorder.CENTER);
	TitledBorder title6 = new TitledBorder("Select veichle");
	title6.setTitleJustification(TitledBorder.CENTER);
	TitledBorder title7 = new TitledBorder("Select figure");
	title7.setTitleJustification(TitledBorder.CENTER);


	ImageIcon starship = new ImageIcon("Images/Starship.jpg");
	ImageIcon glider = new ImageIcon("Images/Glider.jpg");
	ImageIcon ship = new ImageIcon("Images/Ship.jpg");
	
	ImageIcon block = new ImageIcon("Images/Block.jpg");
	ImageIcon blinker = new ImageIcon("Images/Blinker.jpg");
	ImageIcon gosperGun = new ImageIcon("Images/GosperGun.jpg");

	/*
	 * initialization of the internal panels
	 */
	JPanel gameStatePanel = new JPanel();
	JPanel patternsPanel = new JPanel();
	final JPanel previewPanel = new JPanel();
	final JPanel veichlesPanel = new JPanel();
	final JPanel figuresPanel = new JPanel();
	
	/*
	 * initialization of the external panels (imported)
	 */
	final DataPanel dataPanel = new DataPanel();
	Grid grid = new Grid();
	Slider speedSelector = new Slider();
	ThreadSlider threadSlider = new ThreadSlider();
	About about = new About();

/*
 * initialization of all the buttons
 * - gameStatePanel's buttons
 * - patterns' buttons
 * - images' buttons 
 * - patterns' preview panel
 * */
	final JButton play = new JButton("Play");
	JButton stop = new JButton("Stop");
	JButton clear = new JButton("Clear");
	JButton random = new JButton("Random");
	final JButton update = new JButton("Update");
	final JButton killCell = new JButton("Kill Cell");
	
	final JButton veichle = new JButton("Veichle");
	final JButton figures = new JButton("Figures");

	final JButton starshipB = new JButton("Starship");
	final JButton gliderB = new JButton("Glider");
	final JButton shipB = new JButton("Ship");
	final JButton blockB = new JButton("Block");
	final JButton blinkerB = new JButton("Blinker");
	final JButton gosperGunB = new JButton("Gosper Gun");
	
	final JButton starshipP = new JButton(starship);
	final JButton gliderP = new JButton(glider);
	final JButton shipP = new JButton(ship);
	final JButton blockP = new JButton(block);
	final JButton blinkerP = new JButton(blinker);
	final JButton gosperGunP = new JButton(gosperGun);

	/*
	 * panel.add(button) 
	 * adding buttons to the panels
	 */
	gameStatePanel.add(play);
	gameStatePanel.add(stop);
	gameStatePanel.add(clear);
	gameStatePanel.add(random);
	gameStatePanel.add(update);
	gameStatePanel.add(killCell);

	patternsPanel.add(veichle);
	patternsPanel.add(figures);

	veichlesPanel.add(starshipB);
	veichlesPanel.add(gliderB);
	veichlesPanel.add(shipB);

	figuresPanel.add(blinkerB);
	figuresPanel.add(blockB);
	figuresPanel.add(gosperGunB);

	/*
	 * add(panel)
	 * adding panels to the frame
	 * - imported panels
	 * - internal panels
	 */
	
	add(grid);
	add(about);
	add(gameStatePanel);
	
	add(patternsPanel);
	add(speedSelector);
	add(threadSlider);

	/*
	 * define features of the frame
	 */
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	setResizable(false);

/*
 * define features of panels
 */
	setLayout(null);
	gameStatePanel.setLayout(null);
	patternsPanel.setLayout(null);
	previewPanel.setLayout(null);
	figuresPanel.setLayout(null);
	veichlesPanel.setLayout(null);

/*
 * inplementation of titles 
 */

	gameStatePanel.setBorder(title);
	patternsPanel.setBorder(title2);
	previewPanel.setBorder(title5);
	veichlesPanel.setBorder(title6);
	figuresPanel.setBorder(title7);

/*
 * setting the position of the frame
 */
	setBounds(0, 0, screenSize.width - 65, screenSize.height - 55);

	/*
	 * setting the position of the internal panels
	 */
	gameStatePanel.setBounds(0, 0, 140, 235);
	patternsPanel.setBounds(0, 240, 140, 100);
	previewPanel.setBounds(0, 490, 140, 130);
	veichlesPanel.setBounds(0, 345, 140, 140);
	figuresPanel.setBounds(0, 345, 140, 140);
	
	/*
	 * setting the position of the imported panels
	 */
	dataPanel.setBounds(150, 0, getWidth() - 250, 60);
	grid.setBounds(150, 65, getWidth() - 250, getHeight() - 100);
	about.setBounds(150, getHeight() - 35, getWidth() - 250, 25);
	speedSelector.setBounds(getWidth() - 90, 65, 65, getHeight() - 85);
	threadSlider.setBounds(getWidth() - 100, 0, 65, 60);
	
	/*
	 * painting panels/buttons
	 */
	dataPanel.setBackground(Color.YELLOW);

	play.setBackground(Color.GREEN);
	stop.setBackground(Color.RED);

/*
 * set the position of the panels
 */
/*
 * gamestatepanel's buttons
 */
	play.setBounds(20, 25, 100, 25);
	stop.setBounds(20, 60, 100, 25);
	clear.setBounds(20, 95, 100, 25);
	random.setBounds(20, 130, 100, 25);
	killCell.setBounds(20, 165, 100, 25);
	update.setBounds(20, 200, 100, 25);

	/*
	 * patternsPanels's buttons
	 */
	veichle.setBounds(20, 25, 100, 25);
	figures.setBounds(20, 60, 100, 25);

	/*
	 * veichlesPanel's buttons
	 */
	starshipB.setBounds(20, 25, 100, 25);
	gliderB.setBounds(20, 60, 100, 25);
	shipB.setBounds(20, 95, 100, 25);
	
	/*
	 * figuresPanel's buttons
	 */
	blockB.setBounds(20, 25, 100, 25);
	blinkerB.setBounds(20, 60, 100, 25);
	gosperGunB.setBounds(20, 95, 100, 25);

	/*
	 * preview
	 */
	starshipP.setBounds(25, 25, 90, 90);
	gliderP.setBounds(25, 25, 90, 90);
	shipP.setBounds(25, 25, 90, 90);
	blockP.setBounds(25, 25, 90, 90);
	blinkerP.setBounds(25, 25, 90, 90);
	gosperGunP.setBounds(5, 25, 130, 80);


/*
 * set the frame visible
 */
	setVisible(true);

	/*
	 *setting the content pane 
	 */
	getContentPane().add(dataPanel);

/*
 * adding custom listeners to main buttons
 */
	play.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			if (killCellFlag == true) {
			} else {
				if (gameStateFlag == true) {
				} else {
					Status.status(1);
					play.setBackground(Color.GRAY);
					gameStateFlag = true;
					dataPanel.setBackground(Color.GREEN);
					DataPanel.upperPanel.setBackground(Color.GREEN);
					DataPanel.lowerPanel.setBackground(Color.GREEN);
				}
			}
		}
	});
	stop.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			if (gameStateFlag == true) {
				Status.status(2);
				gameStateFlag = false;
				play.setBackground(Color.GREEN);
				dataPanel.setBackground(Color.YELLOW);
				DataPanel.upperPanel.setBackground(Color.YELLOW);
				DataPanel.lowerPanel.setBackground(Color.YELLOW);
			}
		}
	});
	clear.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			Grid.clean();
			repaint();
			DataPanel.generationIndex = 0;
			DataPanel.populationIndex = 0;
			Grid.stabilizedCheck = 0;
			Status.status(4);
		}
	});
	random.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			Grid.random();
			Status.status(6);
		}
	});
	killCell.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			if ((!figuresFlag && !veichleFlag)){
				if (gameStateFlag == false) {
					if (killCellFlag == false) {
						killCellFlag = true;
						killCell.setBackground(Color.GRAY);
						Status.status(7);
					} else {
						killCellFlag = false;
						killCell.setBackground(null);
						Status.status(8);
					}
				}
			}
		}
	});
	update.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			if (killCellFlag == true || gameStateFlag == true) {
			} else {
				Grid.update();
				Status.status(5);
			}
		}
	});

	veichle.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			if (killCellFlag == false) {
				if (PFlag == false) {
					if (figuresFlag == false) {
						if (veichleFlag == true) {
							veichle.setBackground(null);
							veichleFlag = false;
							remove(veichlesPanel);
							repaint();

						} else {
							veichleFlag = true;
							veichle.setBackground(Color.GRAY);
							add(veichlesPanel);
							repaint();
						}
					}
				}
			}
		}
	});
	figures.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			if (killCellFlag == false) {
				if (PFlag == false) {
					if (veichleFlag == false) {
						if (figuresFlag == true) {
							figures.setBackground(null);
							figuresFlag = false;
							remove(figuresPanel);
							repaint();

						} else {
							figuresFlag = true;
							figures.setBackground(Color.GRAY);
							add(figuresPanel);
							repaint();
						}
					}
				}
			}
		}
	});
	/*
	 * standard listener for pictures button
	 */
	ActionListener listen = (new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			final JButton source = (JButton) e.getSource();

			if (source == starshipB) {
				if (starshipPFlag == false && PFlag == false) {
					picNumberFlag = 1;
					PFlag = true;
					starshipB.setBackground(Color.GRAY);
					starshipPFlag = true;
					previewPanel.add(starshipP);
					add(previewPanel);
					repaint();
				} else if (starshipPFlag == true) {
					picNumberFlag = 00;
					starshipPFlag = false;
					PFlag = false;
					starshipB.setBackground(null);
					previewPanel.remove(starshipP);
					remove(previewPanel);
					repaint();
				}
			} else if (source == shipB) {
				if (shipPFlag == false && PFlag == false) {
					picNumberFlag = 2;
					PFlag = true;
					shipB.setBackground(Color.GRAY);
					shipPFlag = true;
					previewPanel.add(shipP);
					add(previewPanel);
					repaint();
				} else if (shipPFlag == true) {
					picNumberFlag = 00;
					shipPFlag = false;
					PFlag = false;
					shipB.setBackground(null);
					previewPanel.remove(shipP);
					remove(previewPanel);
					repaint();
				}
			} else if (source == gliderB) {
				if (gliderPFlag == false && PFlag == false) {
					picNumberFlag = 3;
					PFlag = true;
					gliderB.setBackground(Color.GRAY);
					gliderPFlag = true;
					previewPanel.add(gliderP);
					add(previewPanel);
					repaint();
				} else if (gliderPFlag == true) {
					picNumberFlag = 00;
					gliderPFlag = false;
					PFlag = false;
					gliderB.setBackground(null);
					previewPanel.remove(gliderP);
					remove(previewPanel);
					repaint();
				}
			} else if (source == blockB) {
				if (blockPFlag == false && PFlag == false) {
					picNumberFlag = 4;
					PFlag = true;
					blockB.setBackground(Color.GRAY);
					blockPFlag = true;
					previewPanel.add(blockP);
					add(previewPanel);
					repaint();
				} else if (blockPFlag == true) {
					picNumberFlag = 00;
					blockPFlag = false;
					PFlag = false;
					blockB.setBackground(null);
					previewPanel.remove(blockP);
					remove(previewPanel);
					repaint();
				}
			} else if (source == blinkerB) {
				if (blinkerPFlag == false && PFlag == false) {
					picNumberFlag = 5;
					PFlag = true;
					blinkerB.setBackground(Color.GRAY);
					blinkerPFlag = true;
					previewPanel.add(blinkerP);
					add(previewPanel);
					repaint();
				} else if (blinkerPFlag == true) {
					picNumberFlag = 00;
					blinkerPFlag = false;
					PFlag = false;
					blinkerB.setBackground(null);
					previewPanel.remove(blinkerP);
					remove(previewPanel);
					repaint();
				}
			} else if (source == gosperGunB) {
				if (gosperGunPFlag == false && PFlag == false) {
					picNumberFlag = 6;
					PFlag = true;
					gosperGunB.setBackground(Color.GRAY);
					gosperGunPFlag = true;
					previewPanel.add(gosperGunP);
					add(previewPanel);
					repaint();
				} else if (gosperGunPFlag == true) {
					picNumberFlag = 00;
					gosperGunPFlag = false;
					PFlag = false;
					gosperGunB.setBackground(null);
					previewPanel.remove(gosperGunP);
					remove(previewPanel);
					repaint();
				}
			}
		}
	});
	/*
	 * standard listener must be added to the buttons
	 */
	starshipB.addActionListener(listen);
	shipB.addActionListener(listen);
	gliderB.addActionListener(listen);
	blockB.addActionListener(listen);
	blinkerB.addActionListener(listen);
	gosperGunB.addActionListener(listen);
  }
}
