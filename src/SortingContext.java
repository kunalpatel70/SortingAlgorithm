import SortingAlgorithms.*;

public class SortingContext {
	
	public SortingContext() {
		this.algorithm = new MergeSort();
	}
	
	private SortingStrategy algorithm;
	
	public void setSortingAlgorithm (SortingAlgorithms algorithm) {
		
		switch(algorithm) {
		case MergeSort:
			this.algorithm = new MergeSort();
			break;
		case QuickSort:
			this.algorithm = new QuickSort();
			break;
		case SelectionSort:
			this.algorithm = new SelectionSort();
			break;
		case InsertionSort:
			this.algorithm = new InsertionSort();
			break;
		case BubbleSort:
			this.algorithm = new BubbleSort();
			break;
		case HeapSort:
			this.algorithm = new HeapSort();
			break;
		default:
			this.algorithm = null;
			
		}
	}
	
	public void sortNumbers(int[] numbers) {
		algorithm.sort(numbers);
	}
	
	public void sortNumbers(int[] numbers, SortingAlgorithms algorithm) {
		setSortingAlgorithm(algorithm);
		sortNumbers(numbers);
	}
	
}
