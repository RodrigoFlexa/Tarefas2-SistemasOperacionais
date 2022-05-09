package exercicio7threadsLoop;

public class ThreadsLoop {
	public static void main(String[] args) throws InterruptedException {
		System.out.println("THREAD MAIN:");
		Thread.sleep(50000);
		System.out.println("Thread maina acordada");
		criaThreads();
	}

	public static void criaThreads() {
		int k = 0;
		try {
			
			while (true){
				String nome = "Rodrigo" + k;
				Thread th1 = new Thread(new TarefaDormir(),nome);
				th1.start();
				k ++;
			}
		}catch(RuntimeException e) {
			System.out.println(e.getMessage());	
		}finally {
			System.out.println("Numero de Threads Criadas: "+  k);
		}
	}
}