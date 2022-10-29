
public class ForLoopExecution extends Thread {
	
	
	public ForLoopExecution() {
		// TODO Auto-generated constructor stub
		this.setPriority(MIN_PRIORITY);
		
	}
	@Override
	public void run() {
		System.out.println("Thread Execution Started");
		
		for(int i =0;i<10;i++) {
			System.out.println("Thread "+i);
		}
		System.out.println(this.getState());
	}
	

}
