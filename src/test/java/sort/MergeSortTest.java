package sort;

import org.junit.Assert;
import org.junit.Test;

public class MergeSortTest {

	@Test
	public void testForDataSet1() {
		ISort mergeSort = new MergeSort(TestData.testDataSet1);
		mergeSort.sort();
		Assert.assertArrayEquals(TestData.result1, mergeSort.getSortedArrary());
	}

	@Test
	public void testForDataSet2() {
		ISort mergeSort = new MergeSort(TestData.testDataSet2);
		mergeSort.sort();
		Assert.assertArrayEquals(TestData.result2, mergeSort.getSortedArrary());
	}

	@Test
	public void testForDataSet3() {
		ISort mergeSort = new MergeSort(TestData.testDataSet3);
		mergeSort.sort();
		Assert.assertArrayEquals(TestData.result3, mergeSort.getSortedArrary());
	}

}
