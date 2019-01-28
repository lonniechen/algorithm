package sort;

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
		for (int i = 0; i < arrayLength; i++) {
			for (int j = arrayLength - 1; j > i; j--) {
				compareCount++;
				if (sortedArray[j] < sortedArray[j - 1]) {
					swapCount++;
//					swapping two elements
					sortedArray[j] = sortedArray[j] + sortedArray[j - 1];
					sortedArray[j - 1] = sortedArray[j] - sortedArray[j - 1];
					sortedArray[j] = sortedArray[j] - sortedArray[j - 1];
				}
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
