package exercicio7threadsLoop;

public class TarefaDormir implements Runnable {
	
	@Override
	public void run() {
		try {
			Thread.sleep(100000000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
