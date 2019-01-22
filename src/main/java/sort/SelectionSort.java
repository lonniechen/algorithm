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
		int minIndex;
		for (int i = 0; i < arrayLength; i++) {
			minIndex = i;
			for (int j = i + 1; j < arrayLength; j++) {
				compareCount++;
				if (sortedArray[j] < sortedArray[minIndex]) {
					minIndex = j;
				}
			}
			if (minIndex != i) {
				swapCount++;
				sortedArray[minIndex] = sortedArray[minIndex] + sortedArray[i];
				sortedArray[i] = sortedArray[minIndex] - sortedArray[i];
				sortedArray[minIndex] = sortedArray[minIndex] - sortedArray[i];
			}
		}
	}

	public static void main(String[] args) {
		SelectionSort selectionSort = new SelectionSort(ArrayData.originalDataSet);
		selectionSort.sort();
		System.out.println(Arrays.toString(selectionSort.originalArray));
		System.out.println(Arrays.toString(selectionSort.sortedArray));
		System.out.println(selectionSort.swapCount);
		System.out.println(selectionSort.compareCount);
	}

}
