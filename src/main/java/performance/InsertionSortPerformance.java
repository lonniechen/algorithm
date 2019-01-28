package performance;

import sort.InsertionSort;

public class InsertionSortPerformance {

	public static void main(String[] args) {

		System.out.println("InsertionSort");
//		unsorted data
		System.out.println("---- Unsorted Data ---");
		performanceTest(LargeDataSet.unsortedData);
//		sorted data
		System.out.println("---- Sorted Data ---");
		performanceTest(LargeDataSet.sortedData);
//		reverse sorted data
		System.out.println("---- Reverse Sorted Data ----");
		performanceTest(LargeDataSet.reverseData);
	}

	private static void performanceTest(int[] dataSet) {
		long startTime;
		long endTime;
		InsertionSort insertionUnsorted = new InsertionSort(dataSet);
		startTime = System.currentTimeMillis();
		insertionUnsorted.sort();
		endTime = System.currentTimeMillis();
		System.out.println("Time : " + (endTime - startTime));
		System.out.println("Move Count : " + insertionUnsorted.getMoveCount());
		System.out.println("Insert Count : " + insertionUnsorted.getInsertCount());
	}
}
