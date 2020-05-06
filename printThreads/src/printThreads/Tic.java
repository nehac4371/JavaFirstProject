package printThreads;

public class Tic implements Runnable {
	
	private SharedPrinter sp;

	public Tic() {

	}
	
	public Tic(SharedPrinter sp) {
		super();
		this.sp = sp;
	}

	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			sp.printTic();
		}
		
	}


}
