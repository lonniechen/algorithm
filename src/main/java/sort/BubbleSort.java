package sort;

import java.util.Arrays;

public class BubbleSort {

	private int[] originalArray;
	public int[] sortedArray;
	private int arrayLength;
	private int compareCount;
	private int swapCount;

	public BubbleSort(int[] originalDataSet) {
		originalArray = new int[originalDataSet.length];
		sortedArray = new int[originalDataSet.length];
		System.arraycopy(originalDataSet, 0, originalArray, 0, originalDataSet.length);
		System.arraycopy(originalDataSet, 0, sortedArray, 0, originalDataSet.length);
		arrayLength = originalArray.length;
		compareCount = 0;
		swapCount = 0;
	}

	public void sort() {
		int temp;
		for (int i = 0; i < arrayLength; i++) {
			for (int j = arrayLength - 1; j > i; j--) {
				compareCount++;
				if (sortedArray[j] < sortedArray[j - 1]) {
					swapCount++;
					sortedArray[j] = sortedArray[j] + sortedArray[j - 1];
					sortedArray[j - 1] = sortedArray[j] - sortedArray[j - 1];
					sortedArray[j] = sortedArray[j] - sortedArray[j - 1];
				}
			}
		}
	}

	public static void main(String[] args) {
		BubbleSort bubbleSort = new BubbleSort(ArrayData.originalDataSet);
		bubbleSort.sort();
		System.out.println(Arrays.toString(bubbleSort.originalArray));
		System.out.println(Arrays.toString(bubbleSort.sortedArray));
		System.out.println(bubbleSort.swapCount);
		System.out.println(bubbleSort.compareCount);
	}

}
