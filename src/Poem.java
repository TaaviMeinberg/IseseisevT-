
import java.util.ArrayList;
import java.util.List;

public class Poem {

	public static boolean hasWord(String[] poem, String searchStr) {
		for (String string : poem) {
			String[] parts = removePunctuationAndSplit(string);
			if (contains(parts,searchStr)) {
				return true;
			}
		}
		return false;
	}

	
	public int countWord(String[] poem, String searchStr) {
		int count = 0;
		for (String string : poem) {
			String[] parts = removePunctuationAndSplit(string);
			if (contains(parts,searchStr)) {
				count++;
			}
		}
		return count;
	}
	
	public int firstAppear(String[] poem, String searchStr) {
		int rowNum = 1;
		for (String string : poem) {
			String[] parts = removePunctuationAndSplit(string);
			if (contains(parts,searchStr)) {
				return rowNum;
			}
			rowNum++;
		}
		return -1;
	}
	
	public List<Integer> appearedRows(String[] poem, String searchStr) {
		List<Integer> NumberOfRows = new ArrayList<Integer>();
		int rowNumber = 1;
		for (String string : poem) {
			String[] parts = removePunctuationAndSplit(string);
			if (contains(parts,searchStr)) {
				NumberOfRows.add(rowNumber);
			}
			rowNumber++;
		}
	
		return NumberOfRows;
	}
	
	public List<String> appearedRowsWords(String[] poem, String searchStr) {
		List<String> rowWords = new ArrayList<String>();
		for (String string : poem) {
			String[] parts = removePunctuationAndSplit(string);
			if (contains(parts,searchStr)) {
				rowWords.add(string);
			}
		}
		return rowWords;
	}
	
	private static boolean contains(String[] array, String word) {
		for (String str : array) {
			if (str.toLowerCase().equals(word.toLowerCase())) {
				return true;
			}
		}
		return false;
	}

	private static String[] removePunctuationAndSplit(String string) {
		return string.replaceAll("[,:!?.]","").split(" ");
	}
}
