package sort;

public class ShellSort implements ISort {

	private int[] originalArray;
	private int[] sortedArray;
	private int arrayLength;
	private long moveCount;
	private long insertCount;

	public ShellSort(int[] originalDataSet) {
		originalArray = new int[originalDataSet.length];
		sortedArray = new int[originalDataSet.length];
		System.arraycopy(originalDataSet, 0, originalArray, 0, originalDataSet.length);
		System.arraycopy(originalDataSet, 0, sortedArray, 0, originalDataSet.length);
		arrayLength = originalArray.length;
		moveCount = 0;
		insertCount = 0;
	}

	@Override
	public void sort() {
		int interval = arrayLength / 2;
		while (interval > 0) {
			for (int i = interval; i < arrayLength; i++) {
				int key = sortedArray[i];
				int j = i - interval;
				while (j >= 0 && sortedArray[j] > key) {
					moveCount++;
					sortedArray[j + interval] = sortedArray[j];
					j -= interval;
				}
				insertCount++;
				sortedArray[j + interval] = key;
			}
			interval = interval / 2;
		}
	}

	@Override
	public int[] getSortedArrary() {
		return this.sortedArray;
	}

	public long getMoveCount() {
		return moveCount;
	}

	public long getInsertCount() {
		return insertCount;
	}

}
