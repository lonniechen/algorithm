package sort;

import org.junit.Assert;
import org.junit.Test;

public class InsertionSortTest {

	@Test
	public void testForDataSet1() {
		InsertionSort insertionSort = new InsertionSort(TestData.dataSet1);
		insertionSort.sort();
		Assert.assertArrayEquals(TestData.result1, insertionSort.sortedArray);;
	}
	
	@Test
	public void testForDataSet2() {
		InsertionSort insertionSort = new InsertionSort(TestData.dataSet2);
		insertionSort.sort();
		Assert.assertArrayEquals(TestData.result2, insertionSort.sortedArray);;
	}
	
	@Test
	public void testForDataSet3() {
		InsertionSort insertionSort = new InsertionSort(TestData.dataSet3);
		insertionSort.sort();
		Assert.assertArrayEquals(TestData.result3, insertionSort.sortedArray);;
	}
	
}
