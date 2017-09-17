package sorting.algorithms;

public class MergeSort {
	private int[] numbers;

	private int[] helper; // Additional O(n) space required

	private int number;

	public void sort(int[] values) {
		numbers = values;
		number = values.length;
		helper = new int[number];

		mergesort(0, number - 1);
	}

	private void mergesort(int low, int high) {
		if (low < high) {
			// Get the index of the element which is in the middle
			int middle = (low + high) / 2;
			// Sort the left side of the array
			mergesort(low, middle);
			// Sort the right side of the array
			mergesort(middle + 1, high);
			// Combine them both
			merge(low, middle, high);
		}
	}

	protected void merge(int low, int middle, int high) {
		// copy both parts into helper array
		for (int i = 0; i <= high; i++) {
			helper[i] = numbers[i];
		}

		int i = low;
		int j = middle + 1;
		int k = low;

		while (i <= middle && j <= high) {

			if (helper[i] < helper[j]) {
				numbers[k] = helper[i];
				i++;
			} else {
				numbers[k] = helper[j];
				j++;
			}
			k++;
		}

		// copy the rest of the left side of the array into the target array
		while (i <= middle) {
			numbers[k] = helper[i];
			k++;
			i++;
		}

		// no need to copy the rest of the right side, since these values are
		// already in the correct place
	}
}
