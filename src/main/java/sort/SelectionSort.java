package sort;

public class SelectionSort implements ISort {

	private int[] originalArray;
	private int[] sortedArray;
	private int arrayLength;
	private long compareCount;
	private long indexChangeCount;
	private long swapCount;

	public SelectionSort(int[] originalDataSet) {
		originalArray = new int[originalDataSet.length];
		sortedArray = new int[originalDataSet.length];
		System.arraycopy(originalDataSet, 0, originalArray, 0, originalDataSet.length);
		System.arraycopy(originalDataSet, 0, sortedArray, 0, originalDataSet.length);
		arrayLength = originalArray.length;
		compareCount = 0;
		swapCount = 0;
	}

	@Override
	public void sort() {
		int minIndex;
		for (int i = 0; i < arrayLength; i++) {
			minIndex = i;
			for (int j = i + 1; j < arrayLength; j++) {
				compareCount++;
				if (sortedArray[j] < sortedArray[minIndex]) {
					indexChangeCount++;
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

	@Override
	public int[] getSortedArrary() {
		return this.sortedArray;
	}

	public long getCompareCount() {
		return compareCount;
	}

	public long getIndexChangeCount() {
		return indexChangeCount;
	}

	public long getSwapCount() {
		return swapCount;
	}

}
