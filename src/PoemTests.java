

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;



public class PoemTests {
	
	
	String[] luuletusRunnel = new String[]{"Kui sind kiusab kurat",

			"hüüa valjusti: Kurat!",

			"kui sind jälgib jumal,",

			"ütle julgesti: Jumal!",

			"ära Häbene sõpru,",

			"ära vaenlasi varja,",

			"lahke meelega mine",

			"väike karjalaps karja."};
	

	Poem luuletus = new Poem();
	
	@Test
	public void ifPoemContainsWord() {
		assertThat(Poem.hasWord(luuletusRunnel, "Jumal"), is(true));
	}
	
	@Test
	public void ifPoemDoesNotContainWord() {//notContainingWord
		assertThat(Poem.hasWord(luuletusRunnel, "küpsis"), is(false));
	}
	
	@Test
	public void countTimesWordAppearsInPoem() {//countWordAppearsInPoem
		assertThat(luuletus.countWord(luuletusRunnel, "jumal"), is(2));
	}
	
	@Test
	public void wordDoesntAppearInPoem() {
		assertThat(luuletus.countWord(luuletusRunnel, "küpsis"), is(0));
	}

	@Test
	public void checkRowNrTheWordFirstAppearsIn()  {
		assertThat(luuletus.firstAppear(luuletusRunnel, "sind"), is(1));
	}
	
	@Test
	public void checkRowNrsTheWordAppearsIn() {
		List<Integer> itDoesContain = Arrays.asList(3,4);
		List<Integer> itDoesNotContain = Arrays.asList();
		
		assertThat(luuletus.appearedRows(luuletusRunnel, "jumal"), is(itDoesContain));
		assertThat(luuletus.appearedRows(luuletusRunnel, "küpsis"), is(itDoesNotContain));
	}
	
	@Test
	public void showRowWords() {
		List<String> itDoesContain = Arrays.asList("Kui sind kiusab kurat","kui sind jälgib jumal,");
		List<String> itDoesNotContain = Arrays.asList();
		
		assertThat(luuletus.appearedRowsWords(luuletusRunnel, "kui"), is(itDoesContain));
		assertThat(luuletus.appearedRowsWords(luuletusRunnel, "küpsis"), is(itDoesNotContain));
	}

}
