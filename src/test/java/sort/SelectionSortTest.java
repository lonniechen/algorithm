package sort;

import org.junit.Assert;
import org.junit.Test;

public class SelectionSortTest {

	@Test
	public void testForDataSet1() {
		SelectionSort selectionSort = new SelectionSort(TestData.dataSet1);
		selectionSort.sort();
		Assert.assertArrayEquals(TestData.result1, selectionSort.sortedArray);;
	}
	
	@Test
	public void testForDataSet2() {
		SelectionSort selectionSort = new SelectionSort(TestData.dataSet2);
		selectionSort.sort();
		Assert.assertArrayEquals(TestData.result2, selectionSort.sortedArray);;
	}
	
	@Test
	public void testForDataSet3() {
		SelectionSort selectionSort = new SelectionSort(TestData.dataSet3);
		selectionSort.sort();
		Assert.assertArrayEquals(TestData.result3, selectionSort.sortedArray);;
	}
	
}
