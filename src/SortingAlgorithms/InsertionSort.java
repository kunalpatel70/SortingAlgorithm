package SortingAlgorithms;

public class InsertionSort implements SortingStrategy{

	public void sort(int[] numbers) {
		System.out.println("InsertionSort");

		for(int i = 1; i < numbers.length; i++) {
			int j = i;
			while(j > 0 && numbers[j-1] > numbers[j]) {
				int temp = numbers[j];
				numbers[j] = numbers[j-1];
				numbers[j-1] = temp;
				j -= 1;
			}
		}
	}
	
}
