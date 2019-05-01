package thread_demo;

public class ThreadExt extends Thread {
	private String threadName;
	/**
	 * 
	 */
	public ThreadExt(String threadName) {
		this.threadName = threadName;
		
	}
	public void run() {
		for(int i=0;i<10;i++) {
		System.out.println("Printing in thread "+threadName + " " +i);
//		try {
//			Thread.sleep(1000);
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		}

	}
	public static void main(String[] args) {
		ThreadExt thread3 = new ThreadExt("Thing1");
		thread3.setPriority(Thread.MAX_PRIORITY);
		thread3.start();
		
		ThreadExt thread4 = new ThreadExt("Thing2");
		thread4.setPriority(Thread.MIN_PRIORITY);
		thread4.start();
	}

}
