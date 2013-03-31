package gameOfLife;
/*
 * Select the thread number
 */

import java.util.Hashtable;

import javax.swing.JLabel;
import javax.swing.JSlider;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class ThreadSlider extends JSlider {
	private static final long serialVersionUID = 1L;
	private static int TM = 4;
	private static int Tm = 1;
	private static int dT0 = 1;
	private static int tnumber=0;
/**
 * Creates the slider
 */
	public ThreadSlider(){


//			JSlider speedSelector = new JSlider(JSlider.VERTICAL, dtm, dtM, dt0);
			setOrientation(VERTICAL);
			setMaximum(TM);
			setMinimum(Tm);
			setValue(dT0);
			
			setPaintTicks(true);
			setMajorTickSpacing(1);

			// Create the label table
			Hashtable<Integer, JLabel> labelTable = new Hashtable<Integer, JLabel>();
			labelTable.put(new Integer(Tm + 3), new JLabel("4"));
			labelTable.put(new Integer(Tm + 2), new JLabel("3"));
			labelTable.put(new Integer(Tm + 1), new JLabel("2"));
			labelTable.put(new Integer(Tm), new JLabel("1"));
			setLabelTable(labelTable);

			setPaintLabels(true);

			addChangeListener(new ChangeListener() {

				@Override
				public void stateChanged(ChangeEvent e) {
					JSlider Tnumber = (JSlider) e.getSource();
					
					if (!Tnumber.getValueIsAdjusting()) {
						tnumber=Tnumber.getValue();
						//cosa fa se cambi numero di thread
					}
				}

			});
	}
	/**
	 * avoid problems due to default
	 * @return thread number
	 */
	public static int dtnumber(){
		if(tnumber==0) tnumber = 1;
		return tnumber;
	}

}
