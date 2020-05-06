package printThreads;

public class Toc implements Runnable{
	
	private SharedPrinter sp;
	
	public Toc() {
		
	}
	
	
	
	public Toc(SharedPrinter sp) {
		super();
		this.sp = sp;
	}



	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			sp.printToc();
		}

	}

}
