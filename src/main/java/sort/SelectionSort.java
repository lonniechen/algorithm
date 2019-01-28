package sort;

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
//				swapping two elements
				swapCount++;
				sortedArray[minIndex] = sortedArray[minIndex] + sortedArray[i];
				sortedArray[i] = sortedArray[minIndex] - sortedArray[i];
				sortedArray[minIndex] = sortedArray[minIndex] - sortedArray[i];
			}
		}
	}

	public int getCompareCount() {
		return compareCount;
	}

	public int getSwapCount() {
		return swapCount;
	}

}
