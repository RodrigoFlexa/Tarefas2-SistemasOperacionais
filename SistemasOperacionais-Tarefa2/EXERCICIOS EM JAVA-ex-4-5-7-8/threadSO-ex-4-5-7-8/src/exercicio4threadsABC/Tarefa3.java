package exercicio4threadsABC;

public class Tarefa3 implements Runnable{
	EsperaOcupada eo;
	
	public Tarefa3(EsperaOcupada eo) {
		this.eo = eo;
	}
	@Override
	public void run() {
		while(eo.getValor() != 2) {
			try {
				Thread.sleep(10000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println("C");
	}
}
