package performance;

import sort.SelectionSort;

public class SelectionSortPerformance {
	public static void main(String[] args) {

		long startTime, endTime;
		System.out.println("SelectionSort");
//		unsorted data
		SelectionSort selectionUnsorted = new SelectionSort(LargeDataSet.unsortedData);
		startTime = System.currentTimeMillis();
		selectionUnsorted.sort();
		endTime = System.currentTimeMillis();
		System.out.println("---- Unsorted Data ----");
		System.out.println("Time : " + (endTime - startTime));
		System.out.println("Compare Count : " + selectionUnsorted.getCompareCount());
		System.out.println("Swap Count : " + selectionUnsorted.getSwapCount());
//		sorted data
		SelectionSort selectionSorted = new SelectionSort(LargeDataSet.sortedData);
		startTime = System.currentTimeMillis();
		selectionSorted.sort();
		endTime = System.currentTimeMillis();
		System.out.println("---- Sorted Data ---");
		System.out.println("Time : " + (endTime - startTime));
		System.out.println("Compare Count : " + selectionSorted.getCompareCount());
		System.out.println("Swap Count : " + selectionSorted.getSwapCount());
//		reverse sorted data
		SelectionSort selectionReverseSorted = new SelectionSort(LargeDataSet.reverseSortedData);
		startTime = System.currentTimeMillis();
		selectionReverseSorted.sort();
		endTime = System.currentTimeMillis();
		System.out.println("---- Reverse Sorted Data ----");
		System.out.println("Time : " + (endTime - startTime));
		System.out.println("Compare Count : " + selectionReverseSorted.getCompareCount());
		System.out.println("Swap Count : " + selectionReverseSorted.getSwapCount());
	}
}
