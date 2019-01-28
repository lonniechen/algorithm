package performance;

import sort.BubbleSort;

public class BubbleSortPerformance {
	public static void main(String[] args) {

		long startTime, endTime;
		System.out.println("BubbleSort");
//		sorted data
		BubbleSort bubbleSorted = new BubbleSort(LargeDataSet.sortedData);
		startTime = System.currentTimeMillis();
		bubbleSorted.sort();
		endTime = System.currentTimeMillis();
		System.out.println("---- Sorted Data ---");
		System.out.println("Time : " + (endTime - startTime));
		System.out.println("Compare Count : " + bubbleSorted.getCompareCount());
		System.out.println("Swap Count : " + bubbleSorted.getSwapCount());
//		reverse sorted data
		BubbleSort bubbleReverseSorted = new BubbleSort(LargeDataSet.reverseSortedData);
		startTime = System.currentTimeMillis();
		bubbleReverseSorted.sort();
		endTime = System.currentTimeMillis();
		System.out.println("---- Reverse Sorted Data ----");
		System.out.println("Time : " + (endTime - startTime));
		System.out.println("Compare Count : " + bubbleReverseSorted.getCompareCount());
		System.out.println("Swap Count : " + bubbleReverseSorted.getSwapCount());
		
		
//		unsorted data
		BubbleSort bubbleUnsorted = new BubbleSort(LargeDataSet.unsortedData);
		startTime = System.currentTimeMillis();
		bubbleUnsorted.sort();
		endTime = System.currentTimeMillis();
		System.out.println("---- Unsorted Data ----");
		System.out.println("Time : " + (endTime - startTime));
		System.out.println("Compare Count : " + bubbleUnsorted.getCompareCount());
		System.out.println("Swap Count : " + bubbleUnsorted.getSwapCount());
	}
}
