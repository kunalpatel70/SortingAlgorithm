package SortingAlgorithms;

public class BubbleSort implements SortingStrategy {

	public void sort(int[] numbers) {
		System.out.println("BubbleSort");

		boolean swapped = true;
		while(swapped) {
			swapped = false;
			for (int i = 1; i < numbers.length; i++) {
				if(numbers[i-1] > numbers[i]) {
					int temp = numbers[i];
					numbers[i] = numbers[i-1];
					numbers[i-1] = temp;
					swapped = true;
				}
			}
		}
		
	}
	
}
