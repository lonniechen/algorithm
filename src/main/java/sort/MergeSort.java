package sort;

import java.util.Arrays;

public class MergeSort {

	private int[] originalArray;
	public int[] sortedArray;
	private int arrayLength;
	private int compareCount;
	private int swapCount;

	public MergeSort(int[] originalDataSet) {
		originalArray = new int[originalDataSet.length];
		sortedArray = new int[originalDataSet.length];
		System.arraycopy(originalDataSet, 0, originalArray, 0, originalDataSet.length);
		System.arraycopy(originalDataSet, 0, sortedArray, 0, originalDataSet.length);
		arrayLength = originalArray.length;
		compareCount = 0;
		swapCount = 0;
	}

	public void sort() {
		merge(0, sortedArray.length - 1);
	}

	public void merge(int startIndex, int endIndex) {
		if (endIndex - startIndex > 1) {
			int midIndex = (startIndex + endIndex) / 2;
		} else {
			
		}
	}

	public static void main(String[] args) {
		MergeSort mergeSort = new MergeSort(ArrayData.originalDataSet);
		mergeSort.sort();
		System.out.println(Arrays.toString(mergeSort.originalArray));
		System.out.println(Arrays.toString(mergeSort.sortedArray));
		System.out.println(mergeSort.swapCount);
		System.out.println(mergeSort.compareCount);
	}

}
