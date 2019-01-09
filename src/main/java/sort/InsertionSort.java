package sort;

import java.util.Arrays;

public class InsertionSort {

	private int[] originalArray;
	public int[] sortedArray;
	private int arrayLength;
	private int compareCount;
	private int swapCount;

	public InsertionSort(int[] originalDataSet) {
		originalArray = new int[originalDataSet.length];
		sortedArray = new int[originalDataSet.length];
		System.arraycopy(originalDataSet, 0, originalArray, 0, originalDataSet.length);
		System.arraycopy(originalDataSet, 0, sortedArray, 0, originalDataSet.length);
		arrayLength = originalArray.length;
		compareCount = 0;
		swapCount = 0;
	}

	public void sort() {
		for (int i = 1; i < arrayLength; i++) {
			int key = sortedArray[i];
			int j = i - 1;
			while (j >= 0 && sortedArray[j] > key) {
				sortedArray[j + 1] = sortedArray[j];
				j--;
			}
			sortedArray[j + 1] = key;
		}
	}

	public static void main(String[] args) {
		InsertionSort insertionSort = new InsertionSort(ArrayData.originalDataSet);
		insertionSort.sort();
		System.out.println(Arrays.toString(insertionSort.originalArray));
		System.out.println(Arrays.toString(insertionSort.sortedArray));
		System.out.println(insertionSort.swapCount);
		System.out.println(insertionSort.compareCount);
	}

}
