package performance;

import sort.SelectionSort;

public class SelectionSortPerformance {
	public static void main(String[] args) {

		System.out.println("SelectionSort");
//		unsorted data
		System.out.println("---- Unsorted Data ----");
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
		SelectionSort selectionUnsorted = new SelectionSort(dataSet);
		startTime = System.currentTimeMillis();
		selectionUnsorted.sort();
		endTime = System.currentTimeMillis();
		System.out.println("Time : " + (endTime - startTime));
		System.out.println("Compare Count : " + selectionUnsorted.getCompareCount());
		System.out.println("Swap Count : " + selectionUnsorted.getSwapCount());
	}
}
