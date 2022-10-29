
public class RunnableThreadExample implements Runnable {

	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Thread Runnable Started");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		for(int i=0;i<10;i++) {
			System.out.println("Runnable "+i);
		}
	}

}
