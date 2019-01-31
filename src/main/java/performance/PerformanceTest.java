package performance;

public class PerformanceTest {
	public static void main(String[] args) {

//		O(N^2)
		IPerformance bubbleSortPerformance = new BubbleSortPerformance();
		bubbleSortPerformance.performanceTest();

		IPerformance insertionSortPerformance = new InsertionSortPerformance();
		insertionSortPerformance.performanceTest();

		IPerformance selectionSortPerformance = new SelectionSortPerformance();
		selectionSortPerformance.performanceTest();

//		O(N(logN)^2)
		IPerformance shellSortPerformance = new ShellSortPerformance();
		shellSortPerformance.performanceTest();

//		O(NlogN)
		IPerformance mergeSortPerformance = new MergeSortPerformance();
		mergeSortPerformance.performanceTest();
	}
}
