package sort;

import org.junit.Assert;
import org.junit.Test;

public class SelectionSortTest {

	@Test
	public void testForDataSet1() {
		ISort selectionSort = new SelectionSort(TestData.testDataSet1);
		selectionSort.sort();
		Assert.assertArrayEquals(TestData.result1, selectionSort.getSortedArrary());
	}

	@Test
	public void testForDataSet2() {
		ISort selectionSort = new SelectionSort(TestData.testDataSet2);
		selectionSort.sort();
		Assert.assertArrayEquals(TestData.result2, selectionSort.getSortedArrary());
	}

	@Test
	public void testForDataSet3() {
		ISort selectionSort = new SelectionSort(TestData.testDataSet3);
		selectionSort.sort();
		Assert.assertArrayEquals(TestData.result3, selectionSort.getSortedArrary());
	}

	@Test
	public void testForDataSet4() {
		ISort selectionSort = new SelectionSort(TestData.testDataSet4);
		selectionSort.sort();
		Assert.assertArrayEquals(TestData.result4, selectionSort.getSortedArrary());
	}

	@Test
	public void testForDataSet5() {
		ISort selectionSort = new SelectionSort(TestData.testDataSet5);
		selectionSort.sort();
		Assert.assertArrayEquals(TestData.result5, selectionSort.getSortedArrary());
	}

}
