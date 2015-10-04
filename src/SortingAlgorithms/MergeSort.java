package SortingAlgorithms;

public class MergeSort implements SortingStrategy {

	@Override
	public void sort(int[] numbers) {
		System.out.println("MergeSort");
		this.merge_sort(numbers, 0, numbers.length-1);
	}
	
	private void merge_sort(int[] numbers, int start, int end) {
		//System.out.println("merge_sort: start:" + start + " end:" + end);

		if(start == end) {
			return;
		}
				
		int left_end = start + (end - start)/2;
		int right_start = left_end + 1;
		
		this.merge_sort(numbers, start, left_end);
		this.merge_sort(numbers, right_start, end);
		
		
		this.merge(numbers, start, left_end, right_start, end);
		
	}
	
	private void merge(int[] numbers, int left_start, int left_end, int right_start, int right_end) {
		
		//System.out.println("merge: left_start:" + left_start + " left_end:" + left_end + " right_start:" + right_start + " right_end:" + right_end);
		
		int point1 = left_start;
		int point2 = right_start;
		
		int[] merged = new int[right_end - left_start + 1];
		int point = 0;
		
		while(point1 <= left_end && point2 <= right_end) {
			if(numbers[point1] < numbers[point2]) {
				merged[point] = numbers[point1];
				point1++;
			} else {
				merged[point] = numbers[point2];
				point2++;
			}
			point++;
		}
		
		if(point1 > left_end) {
			while (point2 <= right_end) {
				merged[point] = numbers[point2];
				point2++;
				point++;
			}
		} else {
			while (point1 <= left_end) {
				merged[point] = numbers[point1];
				point1++;
				point++;
			}		
		}
		
		for(int i = 0; i < merged.length; i++) {
			numbers[i + left_start] = merged[i];
		}
		
	}

}
