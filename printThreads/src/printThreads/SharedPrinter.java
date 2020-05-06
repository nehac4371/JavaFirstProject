package printThreads;

import java.util.concurrent.Semaphore;

public class SharedPrinter {
	
	private Semaphore tic = new Semaphore(1);
	private Semaphore toc = new Semaphore(0);
	
	void printTic() {
		try {
			tic.acquire();	
		} catch (InterruptedException e) {
			Thread.currentThread().interrupt();
		}
		
		System.out.print("tic-");
		toc.release();
	}
	
	void printToc() {
		try {
			toc.acquire();
		} catch (InterruptedException e) {
			Thread.currentThread().interrupt();
		}
		
		System.out.print("toc");
		System.out.println();
		tic.release();
	}

}
