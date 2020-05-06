package printThreads;

public class TicToc {
		
	public static void main(String[] args) {
		
		SharedPrinter sp = new SharedPrinter();
		
		Tic _tic = new Tic(sp);
		Thread tic = new Thread(_tic);
		
		Toc _toc = new Toc(sp);
		Thread toc = new Thread(_toc);
		
		
		tic.start();
		toc.start();
	}
	
}
