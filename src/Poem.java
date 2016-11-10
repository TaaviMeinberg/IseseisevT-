
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Poem {
	
	public static void main(String[] args) {
		System.out.println(toLower("B"));
	}

	public static boolean hasWord(String[] poem, String specificWord) {
		//TODO vaata üle need muutujad
		String specificWordCapitalized = capitalize(specificWord);
		String specificWordDeCapitalized = deCapitalize(specificWord);
		for (String string : poem) {
			String[] parts = string.replaceAll("[,:!?.]","").split(" ");
			
			if (contains(parts,specificWordDeCapitalized) || Arrays.asList(parts).contains(specificWordCapitalized)) {
//				System.out.println(Arrays.toString(parts));
				return true;
			}
		}
		return false;
	}
	
	public int countWord(String[] poem, String specificWord) {
		String specificWordCapitalized = capitalize(specificWord);
		String specificWordDeCapitalized = deCapitalize(specificWord);
		int count = 0;
		
		for (String string : poem) {
			String[] parts = string.replaceAll("[,:!?.]","").split(" ");
			if (contains(parts, specificWordCapitalized) || Arrays.asList(parts).contains(specificWordCapitalized)) {
//				System.out.println(Arrays.toString(parts));
				count++;
			}
		}
		return count;
	}
	
	public int firstAppear(String[] poem, String specificWord) {
		String specificWordCapitalized = capitalize(specificWord);
		String specificWordDeCapitalized = deCapitalize(specificWord);
		int rowNum = 1;
		
		for (String string : poem) {
			String[] parts = string.replaceAll("[,:!?.]","").split(" ");
			if (contains(parts, specificWordDeCapitalized) || Arrays.asList(parts).contains(specificWordCapitalized)) {
//				System.out.println(Arrays.toString(parts));
				return rowNum;
			}
			rowNum++;
		}
		return -1;
	}
	
	public List<Integer> appearedRows(String[] poem, String specificWord) {
		String specificWordCapitalized = capitalize(specificWord);
		String specificWordDeCapitalized = deCapitalize(specificWord);
		List<Integer> NumberOfRows = new ArrayList<Integer>();
		int rowNumber = 1;
		
		for (String string : poem) {
			String[] parts = string.replaceAll("[,:!?.]","").split(" ");
			if (Arrays.asList(parts).contains(specificWordDeCapitalized) || Arrays.asList(parts).contains(specificWordCapitalized)) {
//				System.out.println(Arrays.toString(parts));
				NumberOfRows.add(rowNumber);
			}
			rowNumber++;
		}
	
		return NumberOfRows;
	}
	
	public List<String> appearedRowsWords(String[] poem, String specificWord) {
		String specificWordCapitalized = capitalize(specificWord);
		String specificWordDeCapitalized = specificWord.substring(0, 1).toLowerCase() + specificWord.substring(1);
		List<String> rowWords = new ArrayList<String>();
		
		for (String string : poem) {
			String[] parts = string.replaceAll("[,:!?.]","").split(" ");
			if (Arrays.asList(parts).contains(specificWordDeCapitalized) || Arrays.asList(parts).contains(specificWordCapitalized)) {
				rowWords.add(string);
			}
		}
		return rowWords;
	}
	
	private static String capitalize(String word) {
		return word.substring(0, 1).toUpperCase() + word.substring(1);
	}
	public static String deCapitalize(String word) {
		return word.substring(0, 1).toLowerCase() + word.substring(1);
	}
	
	private static boolean contains(String[] array, String word) {
		for (String str : array) {
			if (str.equals(word)) {
				return true;
			}
		}
		return false;
	}
	
	private static String toLower(String ch) {
//		String[] uppers = {"A", "B", "C" };
//		String[] lowers =  {"a", "b", "c" };
		Map<String, String> lettersMap = new HashMap<String, String>();
		lettersMap.put("A", "a");
		lettersMap.put("B", "b");
		lettersMap.put("C", "c");
		//
		
		return "Not found";
	}

}
