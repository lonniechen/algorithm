package performance;

import sort.MergeSort;

public class MergeSortPerformance implements IPerformance{

	public static void main(String[] args) {
		IPerformance mergeSortPerformance = new MergeSortPerformance();
		mergeSortPerformance.performanceTest();
	}
	
	@Override
	public void performanceTest() {
		System.out.println("MergeSort");
//	    unsorted data
		System.out.println("---- Unsorted Data ----");
		test(LargeDataSet.unsortedData);
//	    sorted data
		System.out.println("---- Sorted Data ---");
		test(LargeDataSet.sortedData);
//	    reverse sorted data
		System.out.println("---- Reverse Sorted Data ----");
		test(LargeDataSet.reverseData);
		System.out.println();
		System.out.println();
	}

	private void test(int[] dataSet) {
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
