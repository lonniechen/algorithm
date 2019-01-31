package performance;

import sort.ShellSort;

public class ShellSortPerformance implements IPerformance{

	public static void main(String[] args) {
		IPerformance insertionSortPerformance = new ShellSortPerformance();
		insertionSortPerformance.performanceTest();
	}

	@Override
	public void performanceTest() {
		System.out.println("ShellSort");
//		unsorted data
		System.out.println("---- Unsorted Data ---");
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
		ShellSort insertionUnsorted = new ShellSort(dataSet);
		startTime = System.currentTimeMillis();
		insertionUnsorted.sort();
		endTime = System.currentTimeMillis();
		System.out.println("Time : " + (endTime - startTime));
		System.out.println("Move Count : " + insertionUnsorted.getMoveCount());
		System.out.println("Insert Count : " + insertionUnsorted.getInsertCount());
	}
}
