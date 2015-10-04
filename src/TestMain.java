import java.util.Arrays;

public class TestMain {

	public static void main(String[] args) {
		
		int numbers[] = {20, 50, 15, 6, 80, 5, 4, 3, 2, 1, 15};
		
		SortingContext context = new SortingContext();
		
		context.sortNumbers(numbers, SortingAlgorithms.HeapSort);
		
		System.out.println(Arrays.toString(numbers));
		
	}

}
