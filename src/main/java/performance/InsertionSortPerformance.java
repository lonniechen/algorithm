package performance;

import sort.InsertionSort;

public class InsertionSortPerformance {
	public static void main(String[] args) {

		long startTime, endTime;
		System.out.println("InsertionSort");
//		unsorted data
		InsertionSort insertionUnsorted = new InsertionSort(LargeDataSet.unsortedData);
		startTime = System.currentTimeMillis();
		insertionUnsorted.sort();
		endTime = System.currentTimeMillis();
		System.out.println("---- Unsorted Data ----");
		System.out.println("Time : " + (endTime - startTime));
		System.out.println("Move Count : " + insertionUnsorted.getMoveCount());
		System.out.println("Insert Count : " + insertionUnsorted.getInsertCount());
//		sorted data
		InsertionSort insertionSorted = new InsertionSort(LargeDataSet.sortedData);
		startTime = System.currentTimeMillis();
		insertionSorted.sort();
		endTime = System.currentTimeMillis();
		System.out.println("---- Sorted Data ---");
		System.out.println("Time : " + (endTime - startTime));
		System.out.println("Move Count : " + insertionSorted.getMoveCount());
		System.out.println("Insert Count : " + insertionSorted.getInsertCount());
//		reverse sorted data
		InsertionSort insertionReverseSorted = new InsertionSort(LargeDataSet.reverseSortedData);
		startTime = System.currentTimeMillis();
		insertionReverseSorted.sort();
		endTime = System.currentTimeMillis();
		System.out.println("---- Reverse Sorted Data ----");
		System.out.println("Time : " + (endTime - startTime));
		System.out.println("Move Count : " + insertionReverseSorted.getMoveCount());
		System.out.println("Insert Count : " + insertionReverseSorted.getInsertCount());
	}
}
