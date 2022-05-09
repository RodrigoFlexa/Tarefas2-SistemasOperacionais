package exercicio4threadsABC;

public class Tarefa2 implements Runnable{
	EsperaOcupada eo;
	
	public Tarefa2(EsperaOcupada eo) {
		this.eo = eo;
	}
	@Override
	public void run() {
		while(eo.getValor() != 1) {
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println("B");
		eo.setValor((eo.getValor()+1));
	}

}
