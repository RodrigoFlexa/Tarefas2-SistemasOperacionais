package exercicio4threadsABC;

public class Tarefa1 implements Runnable {
	EsperaOcupada eo;
	
	public Tarefa1(EsperaOcupada eo) {
		this.eo = eo;
	}

	@Override
	public void run() {
		if(eo.getValor() == 0) {
			System.out.println("A");
		}
		eo.setValor((eo.getValor()+1));
	}

}
