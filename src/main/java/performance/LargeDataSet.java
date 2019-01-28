package performance;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class LargeDataSet {

	static public int[] unsortedData = createTestDataSet("src/main/resources/unsortedData.csv");
	static public int[] sortedData = createTestDataSet("src/main/resources/sortedData.csv");
	static public int[] reverseSortedData = createTestDataSet("src/main/resources/reverseSortedData.csv");

	static private int[] createTestDataSet(String filePath) {

		BufferedReader bufferedReader = null;
		try {
			bufferedReader = new BufferedReader(new FileReader(new File(filePath)));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		String line = null;
		ArrayList<Integer> arrayList = new ArrayList<Integer>();
		try {
			while ((line = bufferedReader.readLine()) != null) {
				arrayList.add(Integer.parseInt(line));
			}
		} catch (NumberFormatException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		try {
			bufferedReader.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return arrayList.stream().mapToInt(Integer::intValue).toArray();
	}
}
