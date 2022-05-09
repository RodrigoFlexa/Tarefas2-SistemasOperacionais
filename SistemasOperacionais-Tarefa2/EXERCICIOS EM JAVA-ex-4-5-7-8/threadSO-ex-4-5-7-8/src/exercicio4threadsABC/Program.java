package exercicio4threadsABC;

public class Program {
	public static void main(String[] args) {
		EsperaOcupada eo = new EsperaOcupada();
		Thread th1 = new Thread(new Tarefa1(eo),"TarefaA");
		Thread th2 = new Thread(new Tarefa2(eo),"TarefaB");
		Thread th3 = new Thread(new Tarefa3(eo),"TarefaC");
		th1.start();
		th2.start();
		th3.start();
	}
}
