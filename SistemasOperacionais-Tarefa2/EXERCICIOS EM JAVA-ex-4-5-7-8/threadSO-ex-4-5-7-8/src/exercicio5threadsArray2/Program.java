package exercicio5threadsArray2;

import java.util.Arrays;

public class Program {
	public static void main(String[] args) throws InterruptedException {
		int[] array  = { 11 ,43, 24, 56, 12, 65, 90, 12, 53, 23};
		multiThreadSort(2, array, 0, array.length - 1);
	}
	public static void multiThreadSort(int threads, int[] arr, int start, int stop) {
	    int[] array = arr;
		if (threads > 1) {
	        int midpoint = partition(array, start, stop);
	        new Thread(){public void run() {
	              multiThreadSort(threads - 1, array, start, midpoint);
	        }}.start();
	        new Thread(){public void run() {
	              multiThreadSort(threads - 1, array, midpoint, stop);
	        }}.start();
	    }
	    else 
	        Arrays.sort(array, start, stop);
	    for(Integer in : array) {
	    	System.out.println(in);
	    }
	}
	public static int partition(int[] arr, int low, int high) {
	    int pivot = arr[high];
	   
	    int i = (low - 1);
	 
	    for(int j = low; j <= high - 1; j++) {	         
	     
	        if (arr[j] < pivot){
	            i++;
	            swap(arr, i, j);
	        }
	    }
	    swap(arr, i + 1, high);
	    return (i + 1);
	}
	public static void swap(int[] arr, int i, int j){
	    int temp = arr[i];
	    arr[i] = arr[j];
	    arr[j] = temp;
	}

}
