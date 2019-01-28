package performance;

import sort.BubbleSort;

public class BubbleSortPerformance {

	public static void main(String[] args) {

		System.out.println("BubbleSort");
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
		BubbleSort bubbleUnsorted = new BubbleSort(dataSet);
		startTime = System.currentTimeMillis();
		bubbleUnsorted.sort();
		endTime = System.currentTimeMillis();
		System.out.println("Time : " + (endTime - startTime));
		System.out.println("Compare Count : " + bubbleUnsorted.getCompareCount());
		System.out.println("Swap Count : " + bubbleUnsorted.getSwapCount());
	}
}
