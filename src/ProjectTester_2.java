import static org.junit.Assert.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class ProjectTester_2 {

	
	/**Bedingungen Nur bei Wiederspruch darf das Programm ablehnen
	nicht definierte Variablen sind Gültig**/ 
	
	
	Projekt plinear = new Projekt(new String[][] {{"a","c"},{"b","c"},{"d","e"},{"a","d"}});
	Projekt ptree = new Projekt(new String[][] {{"a","b"},{"b","d"},{"a","c"},{"c","e"}});
	
	
	
	@Test
	void plinear1() {
		assertFalse(plinear.is_sorted(new String[]{}));
	}
	@Test
	void plinear2() {
		assertTrue(plinear.is_sorted(new String[]{"a","a"}));
	}
	
	@Test
	void plinear3() {
		assertFalse(plinear.is_sorted(new String[]{"a","c","b","e"}));
	}
	
	
	@Test
	void plinear4() {
		assertTrue(plinear.is_sorted(new String[]{"a","c","d","e"}));
	}
	@Test
	void plinear5() {
		assertTrue(plinear.is_sorted(new String[]{"a","g"}));
	}

	@Test
	void ptree1() {
		assertFalse(ptree.is_sorted(new String[]{}));
	}

}
