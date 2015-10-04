package SortingAlgorithms;

public class QuickSort implements SortingStrategy {

	public void sort(int[] numbers) {
		System.out.println("QuickSort");
		quickSort(numbers, 0, numbers.length-1);
	}
	
	private int partition(int[] numbers, int left, int right) {
		int i = left;
		int j = right;
		int pivot = numbers[(right+left)/2];
		int tmp;
		
		while (i <= j) {
			while(numbers[i] < pivot) {
				i++;
			}
			while(numbers[j] > pivot) {
				j--;
			}
            if (i <= j) {
                tmp = numbers[i];
                numbers[i] = numbers[j];
                numbers[j] = tmp;
                i++;
                j--;
          }
		}
		
		return i;
	}
	
	private void quickSort(int[] numbers, int left, int right) {
	      int index = partition(numbers, left, right);
	      if (left < index - 1)
	            quickSort(numbers, left, index - 1);
	      if (index < right)
	            quickSort(numbers, index, right);	
	}
	
}
