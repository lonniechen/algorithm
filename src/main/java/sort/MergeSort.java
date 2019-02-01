package sort;

public class MergeSort implements ISort {

	private int[] originalArray;
	private int[] tempArray;
	private int[] sortedArray;
	private int arrayLength;
	private long compareCount;
	private long assignCount;

	public MergeSort(int[] originalDataSet) {
		originalArray = new int[originalDataSet.length];
		tempArray = new int[originalDataSet.length];
		sortedArray = new int[originalDataSet.length];
		System.arraycopy(originalDataSet, 0, originalArray, 0, originalDataSet.length);
		System.arraycopy(originalDataSet, 0, sortedArray, 0, originalDataSet.length);
		arrayLength = originalArray.length;
		compareCount = 0;
		assignCount = 0;
	}

	@Override
	public void sort() {
		divide(0, arrayLength - 1);
	}

	private void divide(int startIndex, int endIndex) {
		if (startIndex != endIndex) {
			int midIndex = (startIndex + endIndex) / 2;
			divide(startIndex, midIndex);
			divide(midIndex + 1, endIndex);
			merge(startIndex, midIndex, endIndex);
		}
	}

	private void merge(int startIndex, int midIndex, int endIndex) {
		int leftIndex = startIndex;
		int rightIndex = midIndex + 1;
		int tempIndex = startIndex;
		while (leftIndex <= midIndex && rightIndex <= endIndex) {
			compareCount++;
			assignCount++;
			if (sortedArray[leftIndex] <= sortedArray[rightIndex]) {
				tempArray[tempIndex++] = sortedArray[leftIndex++];
			} else {
				tempArray[tempIndex++] = sortedArray[rightIndex++];
			}
		}
		while (leftIndex <= midIndex) {
			assignCount++;
			tempArray[tempIndex++] = sortedArray[leftIndex++];
		}
		while (rightIndex <= endIndex) {
			assignCount++;
			tempArray[tempIndex++] = sortedArray[rightIndex++];
		}
		for (int i = startIndex; i <= endIndex; i++) {
			assignCount++;
			sortedArray[i] = tempArray[i];
		}
	}

	@Override
	public int[] getSortedArrary() {
		return this.sortedArray;
	}

	public long getCompareCount() {
		return compareCount;
	}

	public long getAssignCount() {
		return assignCount;
	}

}
