

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;



public class PoemTests {
	
	
	String[] luuletusRunnel = new String[]{"Kui sind kiusab kurat",

			"h��a valjusti: Kurat!",

			"kui sind j�lgib jumal,",

			"�tle julgesti: Jumal!",

			"�ra H�bene s�pru,",

			"�ra vaenlasi varja,",

			"lahke meelega mine",

			"v�ike karjalaps karja."};
	

	Poem luuletus = new Poem();
	
	@Test
	public void ifItContainsASpecificWord() {
		assertThat(Poem.hasWord(luuletusRunnel, "Jumal"), is(true));
	}
	
	@Test
	public void ifItDoesNotContainsASpecificWord() {//notContainingWord
		assertThat(Poem.hasWord(luuletusRunnel, "k�psis"), is(false));
	}
	
	@Test
	public void countHowManyTimesAWordAppearsInThePoem() {//countWordAppearsInPoem
		assertThat(luuletus.countWord(luuletusRunnel, "Jumal"), is(2));
	}
	
	@Test
	public void countHowManyTimesAWordAppearsInThePoemIsZero() throws Exception {
		assertThat(luuletus.countWord(luuletusRunnel, "k�psis"), is(0));
	}

	@Test
	public void checkWhichRowTheWordFirstAppearsIn() throws Exception {
		assertThat(luuletus.firstAppear(luuletusRunnel, "sind"), is(1));
	}
	
	@Test
	public void checkOnWhichRowsTheWordAppearsIn() throws Exception {
		List<Integer> itDoesContain = Arrays.asList(3,4);
		List<Integer> itDoesNotContain = Arrays.asList(-1);
		
		assertThat(luuletus.appearedRows(luuletusRunnel, "jumal"), is(itDoesContain));
		assertThat(luuletus.appearedRows(luuletusRunnel, "k�psis"), is(itDoesNotContain));
	}
	
	@Test
	public void showRowWords() throws Exception {
		List<String> itDoesContain = Arrays.asList("Kui sind kiusab kurat","kui sind j�lgib jumal,");
		List<String> itDoesNotContain = Arrays.asList();
		
		assertThat(luuletus.appearedRowsWords(luuletusRunnel, "kui"), is(itDoesContain));
		assertThat(luuletus.appearedRowsWords(luuletusRunnel, "k�psis"), is(itDoesNotContain));
	}

}
