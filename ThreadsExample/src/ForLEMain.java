
public class ForLEMain {
	
	public static void main(String[] args) throws InterruptedException {
		
		ForLoopExecution fe = new ForLoopExecution();
		//fe.setPriority(0);
		
		System.out.println(fe.getName());

		Thread.sleep(1000);
		System.out.println();
		RunnableThreadExample rte = new RunnableThreadExample();
		Thread t = new Thread(rte);
		
		Thread t1 = new Thread(new RunnableThreadExample());
		//t.setPriority(10);
		System.out.println(t.getName());
		
		fe.start();
		t.start();
		for(int i =0;i<10;i++) {
			System.out.println("Main"+i);
		}
		
	}
}
