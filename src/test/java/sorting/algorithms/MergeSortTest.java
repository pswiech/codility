package sorting.algorithms;

import org.junit.Test;

public class MergeSortTest {

	@Test
	public void mergeMethodTest() {

		int[] numbers = { 5, 3, 7, 6, 8, 9, 10, 22, 11, 4, 8, 5 };
		
		displayArray(numbers);
		MergeSort sorter = new MergeSort();
        sorter.sort(numbers);
        displayArray(numbers);
	}

	private void displayArray(int[] numbers) {
		for (int i=0; i<numbers.length; i++) {
        	if (i==0) {
        		System.out.print("{ ");
        	}        			
        	System.out.print(numbers[i]);
        	if (i<numbers.length-1) {
        		System.out.print(", ");
        	}
        }
        System.out.println(" }");
	}

}
