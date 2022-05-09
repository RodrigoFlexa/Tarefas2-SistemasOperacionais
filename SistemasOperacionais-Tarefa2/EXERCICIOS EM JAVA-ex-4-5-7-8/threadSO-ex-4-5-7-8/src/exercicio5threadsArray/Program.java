package exercicio5threadsArray;
import java.util.Arrays;

public class Program {
	public static void main(String[] args) {
		int[] array = new int[] {2, 1, 8, 7, 4};
		Vetor vt = new Vetor(array);
		
	    Arrays.parallelSort(vt.getVetor());
	    
		for(int i = 0 ; i < vt.getVetor().length; i ++) {
			System.out.println(vt.getVetor()[i]);
		}
	}
}
