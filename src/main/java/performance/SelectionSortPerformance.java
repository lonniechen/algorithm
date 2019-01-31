package performance;

import sort.SelectionSort;

public class SelectionSortPerformance implements IPerformance{

	public static void main(String[] args) {
		IPerformance selectionSortPerformance = new SelectionSortPerformance();
		selectionSortPerformance.performanceTest();
	}

	@Override
	public void performanceTest() {
		System.out.println("SelectionSort");
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
		SelectionSort selectionUnsorted = new SelectionSort(dataSet);
		startTime = System.currentTimeMillis();
		selectionUnsorted.sort();
		endTime = System.currentTimeMillis();
		System.out.println("Time : " + (endTime - startTime));
		System.out.println("Compare Count : " + selectionUnsorted.getCompareCount());
		System.out.println("Index Change Count : " + selectionUnsorted.getIndexChangeCount());
		System.out.println("Swap Count : " + selectionUnsorted.getSwapCount());
	}
}
