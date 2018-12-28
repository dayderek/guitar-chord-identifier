import static org.junit.Assert.*;

import org.junit.Test;

public class ChordTests {

	@Test
	public void printScaleDegreesTest() 
	{
		Chord cmaj = new Chord("C", "X", "C", "E", "G", "C", "x");
		cmaj.printScaleDegreesOnEachString();
	}

}
