package performance;

import sort.BubbleSort;

public class BubbleSortPerformance implements IPerformance{

	public static void main(String[] args) {
		IPerformance bubbleSortPerformance = new BubbleSortPerformance();
		bubbleSortPerformance.performanceTest();
	}

	@Override
	public void performanceTest() {
		System.out.println("BubbleSort");
//		unsorted data
		System.out.println("---- Unsorted Data ----");
		test(LargeDataSet.unsortedData);
//		sorted data
		System.out.println("---- Sorted Data ---");
		test(LargeDataSet.sortedData);
//		reverse sorted data
		System.out.println("---- Reverse Sorted Data ----");
		test(LargeDataSet.reverseData);
		System.out.println();
		System.out.println();
	}

	private void test(int[] dataSet) {
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
