package sort;

public class BubbleSort implements ISort {

	private int[] originalArray;
	private int[] sortedArray;
	private int arrayLength;
	private long compareCount;
	private long swapCount;

	public BubbleSort(int[] originalDataSet) {
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

	@Override
	public int[] getSortedArrary() {
		return this.sortedArray;
	}

	public long getCompareCount() {
		return compareCount;
	}

	public long getSwapCount() {
		return swapCount;
	}

}
