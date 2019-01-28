package performance;

import sort.BubbleSort;
import sort.InsertionSort;
import sort.MergeSort;
import sort.SelectionSort;

public class Performance {

	public static void main(String[] args) {

		long startTime, endTime;

//		bubble sort
		System.out.println("BubbleSort");
//		unsorted data
		BubbleSort bubbleUnsorted = new BubbleSort(LargeDataSet.unsortedData);
		startTime = System.currentTimeMillis();
		bubbleUnsorted.sort();
		endTime = System.currentTimeMillis();
		System.out.println("---- Unsorted Data ----");
		System.out.println("Time : " + (endTime - startTime));
//		sorted data
		BubbleSort bubbleSorted = new BubbleSort(LargeDataSet.sortedData);
		startTime = System.currentTimeMillis();
		bubbleSorted.sort();
		endTime = System.currentTimeMillis();
		System.out.println("---- Sorted Data ---");
		System.out.println("Time : " + (endTime - startTime));
//		reverse sorted data
		BubbleSort bubbleReverseSorted = new BubbleSort(LargeDataSet.reverseSortedData);
		startTime = System.currentTimeMillis();
		bubbleReverseSorted.sort();
		endTime = System.currentTimeMillis();
		System.out.println("---- Reverse Sorted Data ----");
		System.out.println("Time : " + (endTime - startTime));

		System.out.println();
		System.out.println();

//		selection sort
		System.out.println("SelectionSort");
//		unsorted data
		SelectionSort selectionUnsorted = new SelectionSort(LargeDataSet.unsortedData);
		startTime = System.currentTimeMillis();
		selectionUnsorted.sort();
		endTime = System.currentTimeMillis();
		System.out.println("---- Unsorted Data ----");
		System.out.println("Time : " + (endTime - startTime));
//		sorted data
		SelectionSort selectionSorted = new SelectionSort(LargeDataSet.sortedData);
		startTime = System.currentTimeMillis();
		selectionSorted.sort();
		endTime = System.currentTimeMillis();
		System.out.println("---- Sorted Data ---");
		System.out.println("Time : " + (endTime - startTime));
//		reverse sorted data
		SelectionSort selectionReverseSorted = new SelectionSort(LargeDataSet.reverseSortedData);
		startTime = System.currentTimeMillis();
		selectionReverseSorted.sort();
		endTime = System.currentTimeMillis();
		System.out.println("---- Reverse Sorted Data ----");
		System.out.println("Time : " + (endTime - startTime));

		System.out.println();
		System.out.println();

//		insertion sort
		System.out.println("InsertionSort");
//		unsorted data
		InsertionSort insertionUnsorted = new InsertionSort(LargeDataSet.unsortedData);
		startTime = System.currentTimeMillis();
		insertionUnsorted.sort();
		endTime = System.currentTimeMillis();
		System.out.println("---- Unsorted Data ----");
		System.out.println("Time : " + (endTime - startTime));
//		sorted data
		InsertionSort insertionSorted = new InsertionSort(LargeDataSet.sortedData);
		startTime = System.currentTimeMillis();
		insertionSorted.sort();
		endTime = System.currentTimeMillis();
		System.out.println("---- Sorted Data ---");
		System.out.println("Time : " + (endTime - startTime));
//		reverse sorted data
		InsertionSort insertionReverseSorted = new InsertionSort(LargeDataSet.reverseSortedData);
		startTime = System.currentTimeMillis();
		insertionReverseSorted.sort();
		endTime = System.currentTimeMillis();
		System.out.println("---- Reverse Sorted Data ----");
		System.out.println("Time : " + (endTime - startTime));

		System.out.println();
		System.out.println();

//		merge sort
		System.out.println("MergeSort");
//		unsorted data
		MergeSort mergeUnsorted = new MergeSort(LargeDataSet.unsortedData);
		startTime = System.currentTimeMillis();
		mergeUnsorted.sort();
		endTime = System.currentTimeMillis();
		System.out.println("---- Unsorted Data ----");
		System.out.println("Time : " + (endTime - startTime));
//		sorted data
		MergeSort mergeSorted = new MergeSort(LargeDataSet.sortedData);
		startTime = System.currentTimeMillis();
		mergeSorted.sort();
		endTime = System.currentTimeMillis();
		System.out.println("---- Sorted Data ---");
		System.out.println("Time : " + (endTime - startTime));
//		reverse sorted data
		MergeSort mergeReverseSorted = new MergeSort(LargeDataSet.reverseSortedData);
		startTime = System.currentTimeMillis();
		mergeReverseSorted.sort();
		endTime = System.currentTimeMillis();
		System.out.println("---- Reverse Sorted Data ----");
		System.out.println("Time : " + (endTime - startTime));

		System.out.println();
		System.out.println();
	}

}
