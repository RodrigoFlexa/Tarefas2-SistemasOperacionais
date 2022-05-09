package exercicio8;

import java.io.IOException;
import java.util.Scanner;

public class NThreads {
	public static void main(String[] args) throws InterruptedException {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite um Número");
		criaThreadsProcessos(sc.nextInt());
		sc.close();
	}

	public static void criaThreads(int n) {
		int k = 0;
		try {
			for(int i = 0; i < n ; i++){
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
	public static int criaProcessos(int N) {
		int k = 0;
		for(int i = 0; i < N; i ++) {
			try {
				Process pr = Runtime.getRuntime().exec("cmd /C dir");
				if(pr.isAlive()) {
					k++;
				}
				System.out.println(pr.pid());
			} catch (IOException e) {
				e.printStackTrace();
			}finally {
				System.out.println("Número de processos criados: " + k);
			}
		}
		return 0;
	}
	public static void criaThreadsProcessos(int n) {
		criaProcessos(n);
		criaThreads(n);
	}
}