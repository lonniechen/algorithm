package sort;

import java.util.Arrays;

public class SelectionSort {

	private int[] originalArray;
	public int[] sortedArray;
	private int arrayLength;
	private int compareCount;
	private int swapCount;

	public SelectionSort(int[] originalDataSet) {
		originalArray = new int[originalDataSet.length];
		sortedArray = new int[originalDataSet.length];
		System.arraycopy(originalDataSet, 0, originalArray, 0, originalDataSet.length);
		System.arraycopy(originalDataSet, 0, sortedArray, 0, originalDataSet.length);
		arrayLength = originalArray.length;
		compareCount = 0;
		swapCount = 0;
	}

	public void sort() {
		int min;
		int temp;
		for (int i = 0; i < arrayLength; i++) {
			min = i;

			for (int j = i + 1; j < arrayLength; j++) {
				if (sortedArray[j] < sortedArray[min]) {
					min = j;
				}
			}

			temp = sortedArray[min];
			sortedArray[min] = sortedArray[i];
			sortedArray[i] = temp;
		}
	}

	public static void main(String[] args) {
		SelectionSort bubbleSort = new SelectionSort(ArrayData.originalDataSet);
		bubbleSort.sort();
		System.out.println(Arrays.toString(bubbleSort.originalArray));
		System.out.println(Arrays.toString(bubbleSort.sortedArray));
		System.out.println(bubbleSort.swapCount);
		System.out.println(bubbleSort.compareCount);
	}

}
