package gameOfLife;

public class StartGame {
	
	/**
	 * Instruction series to run nextGeneration
	 */
	public static void run() {
		
			if(Frame.gameStateFlag==true){
				DataPanel.generationIndex+=1;
				ThreadInterface.setMode(ThreadSlider.dtnumber());
				Grid.update();
			}
		sleepFor(Slider.waitingTime);
	}
		
	/**
	 * Waiting time between generations
	 * @param milliseconds
	 */
	 private static void sleepFor(int milliseconds) { 
		 try {
		 Thread.sleep(milliseconds); } 
	 catch (InterruptedException e){}
	 }
}