package sort;

import org.junit.Assert;
import org.junit.Test;

public class InsertionSortTest {

	@Test
	public void testForDataSet1() {
		ISort insertionSort = new InsertionSort(TestData.testDataSet1);
		insertionSort.sort();
		Assert.assertArrayEquals(TestData.result1, insertionSort.getSortedArrary());
	}

	@Test
	public void testForDataSet2() {
		ISort insertionSort = new InsertionSort(TestData.testDataSet2);
		insertionSort.sort();
		Assert.assertArrayEquals(TestData.result2, insertionSort.getSortedArrary());
	}

	@Test
	public void testForDataSet3() {
		ISort insertionSort = new InsertionSort(TestData.testDataSet3);
		insertionSort.sort();
		Assert.assertArrayEquals(TestData.result3, insertionSort.getSortedArrary());
	}

}
