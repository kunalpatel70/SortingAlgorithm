package SortingAlgorithms;

public class SelectionSort implements SortingStrategy 
{
	
	public void sort(int[] numbers) 
	{
		System.out.println("SelectionSort");

		for (int i = 0; i < numbers.length; i++) {
			int smallest_index = i;
			for (int j = i; j < numbers.length; j++) {
				if(numbers[j] < numbers[smallest_index]) {
					smallest_index = j;
				}
			}
			int temp = numbers[i];
			numbers[i] = numbers[smallest_index];
			numbers[smallest_index] = temp;
		}
	}

}
