package thread_demo;

public class ThreadImp implements Runnable {

	@Override
	public void run() {
		for(int i=0;i<10;i++) {
		System.out.println("Printing in thread: "+i);
		}

	}

	public static void main(String[] args) {
		ThreadImp thread1 = new ThreadImp();
		Thread thread2 = new Thread(thread1);
		thread2.start();
	}

}
