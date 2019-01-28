package sort;

public class InsertionSort {

	private int[] originalArray;
	public int[] sortedArray;
	private int arrayLength;
	private long moveCount;
	private long insertCount;

	public InsertionSort(int[] originalDataSet) {
		originalArray = new int[originalDataSet.length];
		sortedArray = new int[originalDataSet.length];
		System.arraycopy(originalDataSet, 0, originalArray, 0, originalDataSet.length);
		System.arraycopy(originalDataSet, 0, sortedArray, 0, originalDataSet.length);
		arrayLength = originalArray.length;
		moveCount = 0;
		insertCount = 0;
	}

	public void sort() {
		for (int i = 1; i < arrayLength; i++) {
			int key = sortedArray[i];
			int j;
			for (j = i - 1; j >= 0; j--) {
				if (sortedArray[j] < key) {
					break;
				}
				moveCount++;
				sortedArray[j + 1] = sortedArray[j];
			}
			insertCount++;
			sortedArray[j + 1] = key;
		}
	}

	public long getMoveCount() {
		return moveCount;
	}

	public long getInsertCount() {
		return insertCount;
	}

}
