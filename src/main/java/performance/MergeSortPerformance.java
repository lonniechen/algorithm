package performance;

import sort.MergeSort;

public class MergeSortPerformance {
	
	public static void main(String[] args) {

		System.out.println("MergeSort");
//	    unsorted data
		System.out.println("---- Unsorted Data ----");
		performanceTest(LargeDataSet.unsortedData);
//	    sorted data
		System.out.println("---- Sorted Data ---");
		performanceTest(LargeDataSet.sortedData);
//	    reverse sorted data
		System.out.println("---- Reverse Sorted Data ----");
		performanceTest(LargeDataSet.reverseData);
	}

	private static void performanceTest(int[] dataSet) {
		long startTime;
		long endTime;
		MergeSort mergeUnsorted = new MergeSort(dataSet);
		startTime = System.currentTimeMillis();
		mergeUnsorted.sort();
		endTime = System.currentTimeMillis();
		System.out.println("Time : " + (endTime - startTime));
		System.out.println("Compare Count : " + mergeUnsorted.getCompareCount());
		System.out.println("Assign Count : " + mergeUnsorted.getAssignCount());
	}
}
