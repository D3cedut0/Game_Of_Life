package gameOfLife;

import java.util.Hashtable;

import javax.swing.JLabel;
import javax.swing.JSlider;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

/**
*The Slider pattern
* 
* @param int Click Row; int Click Column.
*/
public class Slider extends JSlider {

	private static final long serialVersionUID = 1L;

	public static int dtM = 19;
	public static int dtm = 1;
	public static int dt0 = 10;
	public static int waitingTime;
	public static int tempGameSpeed;
	public static int fps;

	/**
	 * Select the gamespeed
	 */
	public Slider() {
		setOrientation(VERTICAL);
		setMaximum(dtM);
		setMinimum(dtm);
		setValue(dt0);
		
		setMajorTickSpacing(10);
		setPaintTicks(true);
		setMajorTickSpacing(9);
		setMinorTickSpacing(1);

		// Create the label table
		Hashtable<Integer, JLabel> labelTable = new Hashtable<Integer, JLabel>();
		labelTable.put(new Integer(dtM), new JLabel("x10"));
		labelTable.put(new Integer(dtM - 1), new JLabel("x9"));
		labelTable.put(new Integer(dtM - 2), new JLabel("x8"));
		labelTable.put(new Integer(dtM - 3), new JLabel("x7"));
		labelTable.put(new Integer(dtM - 4), new JLabel("x6"));
		labelTable.put(new Integer(dtM - 5), new JLabel("x5"));
		labelTable.put(new Integer(dtM - 6), new JLabel("x4"));
		labelTable.put(new Integer(dtM - 7), new JLabel("x3"));
		labelTable.put(new Integer(dtM - 8), new JLabel("x2"));
		labelTable.put(new Integer((dtM + 1) / 2), new JLabel("x1"));
		labelTable.put(new Integer(dtm + 8), new JLabel("x0.9"));
		labelTable.put(new Integer(dtm + 7), new JLabel("x0.8"));
		labelTable.put(new Integer(dtm + 6), new JLabel("x0.7"));
		labelTable.put(new Integer(dtm + 5), new JLabel("x0.6"));
		labelTable.put(new Integer(dtm + 4), new JLabel("x0.5"));
		labelTable.put(new Integer(dtm + 3), new JLabel("x0.4"));
		labelTable.put(new Integer(dtm + 2), new JLabel("x0.3"));
		labelTable.put(new Integer(dtm + 1), new JLabel("x0.2"));
		labelTable.put(new Integer(dtm), new JLabel("x0.1"));
		setLabelTable(labelTable);

		setPaintLabels(true);

		addChangeListener(new ChangeListener() {

			@Override
			public void stateChanged(ChangeEvent e) {
				JSlider setSpeed = (JSlider) e.getSource();
				
				if (!setSpeed.getValueIsAdjusting()) {
					
					tempGameSpeed = setSpeed.getValue();
					
					fps(tempGameSpeed);
					
					DataPanel.update();
				}
			}

		});
	}

/**
 * convert from fps to waiting time
 * @param x = temporary speed
 * @return waiting time of the sistem
 */
	public int fps(int x) {
		if (x <= 10) {
			fps = x;
		} else if (x > 10) {
			fps = ((x-9)*10);
		};
		waitingTime = 1000/fps;
		return (waitingTime);
	}
	/**
	 * avoid the default problems
	 * @return frame per second
	 */
	public static int dFps(){
		if(fps==0)
			fps = 10;
		waitingTime = 1000/fps;
		return fps;
	}
}