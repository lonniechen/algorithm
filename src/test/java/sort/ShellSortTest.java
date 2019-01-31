package sort;

import org.junit.Assert;
import org.junit.Test;

public class ShellSortTest {

	@Test
	public void testForDataSet1() {
		ISort shellSort = new ShellSort(TestData.testDataSet1);
		shellSort.sort();
		Assert.assertArrayEquals(TestData.result1, shellSort.getSortedArrary());
	}

	@Test
	public void testForDataSet2() {
		ISort shellSort = new ShellSort(TestData.testDataSet2);
		shellSort.sort();
		Assert.assertArrayEquals(TestData.result2, shellSort.getSortedArrary());
	}

	@Test
	public void testForDataSet3() {
		ISort shellSort = new ShellSort(TestData.testDataSet3);
		shellSort.sort();
		Assert.assertArrayEquals(TestData.result3, shellSort.getSortedArrary());
	}

	@Test
	public void testForDataSet4() {
		ISort shellSort = new ShellSort(TestData.testDataSet4);
		shellSort.sort();
		Assert.assertArrayEquals(TestData.result4, shellSort.getSortedArrary());
	}

	@Test
	public void testForDataSet5() {
		ISort shellSort = new ShellSort(TestData.testDataSet5);
		shellSort.sort();
		Assert.assertArrayEquals(TestData.result5, shellSort.getSortedArrary());
	}

}
