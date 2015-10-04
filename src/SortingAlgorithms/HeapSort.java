package SortingAlgorithms;

public class HeapSort implements SortingStrategy {

	public void sort(int[] numbers) {
		System.out.println("HeapSort");

		heapify(numbers);
		int end = numbers.length - 1;
		while(end > 0) {
			int temp = numbers[end];
			numbers[end] = numbers[0];
			numbers[0] = temp;
			
			end = end - 1;
			
			shiftDown(numbers, 0, end);
		}
	}
	
	private void shiftDown(int[] numbers, int start, int end) {
		int root = start;
		
		while (root * 2 +1 <= end) {
			int child =  root * 2 + 1;
			int swap = root;
			
			if(numbers[swap] < numbers[child]) {
				swap = child;
			}
			if(child+1 <= end && numbers[swap] < numbers[child + 1]) {
				swap = child + 1;
			}
			if(swap == root) {
				return;
			} else {
				int temp = numbers[root];
				numbers[root] = numbers[swap];
				numbers[swap] = temp;
				
				root = swap;
			}
		}
	}
	
	private void heapify(int[] numbers) {
		int start = (numbers.length - 2)/ 2;
		
		while(start >= 0) {
	        shiftDown(numbers, start, numbers.length - 1);
	        start = start - 1;
		}
	}
	
	
}
