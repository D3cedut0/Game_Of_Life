package gameOfLife;

/*
 * This class controls the thread approach. 
 */
public class ThreadInterface implements Runnable{
	


	public static int rows = Grid.getRowsNumber();
	public static int columns = Grid.getColumnsNumber();

	public static boolean flag[][] = Grid.getGridFlags();
	public static boolean killFlag[][] = Grid.getGridKillFlags();
	
	//Two array of max dim
	public static boolean[][] tempCells= new boolean[rows][columns];
	public static boolean[][] prewCells= new boolean[rows][columns];
	public static boolean[][] newFlags= Grid.getGridFlags();
	
	
	/**
	 * 
	 * @return boolean newFlags
	 */
	public static boolean[][] getNewFlags(){
		return newFlags;
	}
	/**
	 * 
	 * @return boolean PrewFlag
	 */
	public static boolean[][] getPrewFlag(){
		return prewCells;
	}
	
	/**
	 * Return an offset used in the 3 ThreadMode
	 * 
	 * @return offsetCase3
	 */
	private static int offsetCase3(){
		if (rows%3==2) return 1;
		else return 0;
	}
	
	int type=1;
	int part=0;
	
	
	
	
	private static int offset=offsetCase3();	
	private static int mod2R=rows%2;
	private static int mod3R=rows%3;

	/**
	 * Constructor of thread with its features.
	 * @param type =[1,2,3,4] threads
	 * @param part = the tread [n] of the [1,2,3,4]threads section
	 */
	ThreadInterface(int type, int part){
		this.type=type; 
		this.part=part;
	}

	/**
	 * The run method. 
	 * 
	 * Each thread controls a different code (related to its specific screen part)
	 * defined by its constructor. 
	 */
	public void run() {
		switch (type){
			case 2: if(part==1) NextGeneration.nextGeneration(0, (rows - mod2R) / 2, 0, columns);
					else NextGeneration.nextGeneration((rows - mod2R) / 2, rows, 0,columns); 
					break;
			
			case 3: switch (part){
						case 1:NextGeneration.nextGeneration(0, (rows-mod3R)/3 , 0, columns);break;
						case 2:NextGeneration.nextGeneration((rows-mod3R)/3, 2*(rows-mod3R)/3+offset , 0, columns);break;
						case 3:NextGeneration.nextGeneration(2*(rows-mod3R)/3+offset, rows , 0, columns);
					}
					break;
			
			case 4: switch (part){
						case 1:NextGeneration.nextGeneration(0, (rows-mod2R)/4, 0, columns);break;
						case 2:NextGeneration.nextGeneration((rows-mod2R)/4,(rows-mod2R)/2, 0, columns);break;
						case 3:NextGeneration.nextGeneration((rows-mod2R)/2, 3*(rows-mod2R)/4, 0,columns);break;
						case 4:NextGeneration.nextGeneration(3*(rows-mod2R)/4, rows, 0, columns);
					} 
					break;
			
			default: NextGeneration.nextGeneration(0, rows, 0, columns);
	
		}
	}
	/**
	 * Starts the threads
	 * 
	 * @param tnumber = threads number
	 */
	static void setMode(int tnumber) {
		for (int i = 0; i < rows; i++) {
			for (int n = 0; n < columns; n++) {
				ThreadInterface.prewCells[i][n] = ThreadInterface.flag[i][n];
				ThreadInterface.tempCells[i][n] = ThreadInterface.prewCells[i][n];
			}
		}
		
		switch (tnumber) {
			
			case 2:
				ThreadInterface b1=new ThreadInterface(2,1);
				ThreadInterface b2=new ThreadInterface(2,2);
				Thread t1= new Thread(b1, "NextGenT1");
				Thread t2= new Thread(b2, "NextGenT2");
				t2.start();
				t1.start();
				try{t1.join();}catch(InterruptedException e1){}
				try{t2.join();}catch(InterruptedException e2){}
				break;

			case 3:
				ThreadInterface c1=new ThreadInterface(3,1);
				ThreadInterface c2=new ThreadInterface(3,2);
				ThreadInterface c3=new ThreadInterface(3,3);
				Thread t4= new Thread(c1, "NextGenT1");
				Thread t5= new Thread(c2, "NextGenT2");
				Thread t6= new Thread(c3, "NextGenT3");
				t4.start();
				t5.start();
				t6.start();
				try{t4.join();}catch(InterruptedException e1){}
				try{t5.join();}catch(InterruptedException e2){}
				try{t6.join();}catch(InterruptedException e3){}
				break;

			case 4:
				ThreadInterface d1=new ThreadInterface(4,1);
				ThreadInterface d2=new ThreadInterface(4,2);
				ThreadInterface d3=new ThreadInterface(4,3);
				ThreadInterface d4=new ThreadInterface(4,4);
				Thread t7= new Thread(d1, "NextGenT1");
				Thread t8= new Thread(d2, "NextGenT2");
				Thread t9= new Thread(d3, "NextGenT3");
				Thread t10= new Thread(d4, "NextGenT4");
				t7.start();
				t8.start();
				t9.start();
				t10.start();
				try{t7.join();}catch(InterruptedException e1){}
				try{t8.join();}catch(InterruptedException e2){}
				try{t9.join();}catch(InterruptedException e3){}
				try{t10.join();}catch(InterruptedException e4){}

				break;
		
			default:
				ThreadInterface a=new ThreadInterface(1,0);
				Thread t0=new Thread(a, "NextGenThread");
				t0.start();
				try{t0.join();}catch(InterruptedException e0){}
		}
	}
}