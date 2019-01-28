package sort;

import org.junit.Assert;
import org.junit.Test;

public class BubbleSortTest {

	@Test
	public void testForDataSet1() {
		BubbleSort bubbleSort = new BubbleSort(TestData.testDataSet1);
		bubbleSort.sort();
		Assert.assertArrayEquals(TestData.result1, bubbleSort.sortedArray);
	}
	
	@Test
	public void testForDataSet2() {
		BubbleSort bubbleSort = new BubbleSort(TestData.testDataSet2);
		bubbleSort.sort();
		Assert.assertArrayEquals(TestData.result2, bubbleSort.sortedArray);
	}
	
	@Test
	public void testForDataSet3() {
		BubbleSort bubbleSort = new BubbleSort(TestData.testDataSet3);
		bubbleSort.sort();
		Assert.assertArrayEquals(TestData.result3, bubbleSort.sortedArray);
	}
	
}
