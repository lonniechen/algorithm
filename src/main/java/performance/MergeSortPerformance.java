package performance;

import sort.MergeSort;

public class MergeSortPerformance {
	public static void main(String[] args) {

		long startTime, endTime;
		System.out.println("MergeSort");
//	    unsorted data
		MergeSort mergeUnsorted = new MergeSort(LargeDataSet.unsortedData);
		startTime = System.currentTimeMillis();
		mergeUnsorted.sort();
		endTime = System.currentTimeMillis();
		System.out.println("---- Unsorted Data ----");
		System.out.println("Time : " + (endTime - startTime));
		System.out.println("Compare Count : " + mergeUnsorted.getCompareCount());
		System.out.println("Assign Count : " + mergeUnsorted.getAssignCount());
//	    sorted data
		MergeSort mergeSorted = new MergeSort(LargeDataSet.sortedData);
		startTime = System.currentTimeMillis();
		mergeSorted.sort();
		endTime = System.currentTimeMillis();
		System.out.println("---- Sorted Data ---");
		System.out.println("Time : " + (endTime - startTime));
		System.out.println("Compare Count : " + mergeSorted.getCompareCount());
		System.out.println("Assign Count : " + mergeSorted.getAssignCount());
//	    reverse sorted data
		MergeSort mergeReverseSorted = new MergeSort(LargeDataSet.reverseSortedData);
		startTime = System.currentTimeMillis();
		mergeReverseSorted.sort();
		endTime = System.currentTimeMillis();
		System.out.println("---- Reverse Sorted Data ----");
		System.out.println("Time : " + (endTime - startTime));
		System.out.println("Compare Count : " + mergeReverseSorted.getCompareCount());
		System.out.println("Assign Count : " + mergeReverseSorted.getAssignCount());
	}
}
