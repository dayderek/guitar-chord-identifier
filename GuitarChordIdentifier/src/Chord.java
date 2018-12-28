/**
 * This class creates a chord object with the six scale degrees given
 * first by the user in the form of fret numbers, and then converted into 
 * notes and finally 6 scale degrees (or x's) for each string.
 * @author dayderek
 *
 */
public class Chord extends Key 
{

	/**
	 * This field would need to exist if the program were able to output the 
	 * name of the chord.
	 */
	//private String nameOfChord;
	
	/**
	 * These fields store the six scale degrees or x's of each string.
	 */
	private String sd6;
	private String sd5;
	private String sd4;
	private String sd3;
	private String sd2;
	private String sd1;
	
	/**
	 * This constructor sets up the chord object using the root of the chord
	 * and the scale degrees.
	 * @param rootOfChord The note the the chord is based on.
	 * @param sixthNote The note or x on the sixth string.
	 * @param fifthNote The note or x on the fifth string.
	 * @param fourthNote The note or x on the fourth string.
	 * @param thirdNote The note or x on the third string.
	 * @param secondNote The note or x on the second string.
	 * @param firstNote The note or x on the first string.
	 */
	public Chord (String rootOfChord, String sixthNote, String fifthNote, String
			fourthNote, String thirdNote, String secondNote, String firstNote) 
	{
		super(rootOfChord); 
		
		if (!sixthNote.toUpperCase().equals("X"))
		{
			sd6 = this.getScaleDegreeOfNote(sixthNote);
		}
		else 
		{
			sd6 = "X";
		}
		
		if (!fifthNote.toUpperCase().equals("X"))
		{
			sd5 = this.getScaleDegreeOfNote(fifthNote);
		}
		else 
		{
			sd5 = "X";
		}
		
		if (!fourthNote.toUpperCase().equals("X"))
		{
			sd4 = this.getScaleDegreeOfNote(fourthNote);
		}
		else 
		{
			sd4 = "X";
		}
		
		if (!thirdNote.toUpperCase().equals("X"))
		{
			sd3 = this.getScaleDegreeOfNote(thirdNote);
		}
		else 
		{
			sd3 = "X";
		}
		
		if (!secondNote.toUpperCase().equals("X"))
		{
			sd2 = this.getScaleDegreeOfNote(secondNote);
		}
		else 
		{
			sd2 = "X";
		}
		
		if (!firstNote.toUpperCase().equals("X"))
		{
			sd1 = this.getScaleDegreeOfNote(firstNote);
		}
		else 
		{
			sd1 = "X";
		}
		
		//nameOfChord = setNameOfChord(sd6, sd5, sd4, sd3, sd2, sd1);
	}
	
	
	// Potential method for identifying names of chords
	/*
	public String setNameOfChord(String sd6In, String sd5In, String sd4In, String sd3In, 
			String sd2In, String sd1In)
	{
		String chordName = "";
		
		//Major triads
		if (sd6In.equals("1") || sd5In.equals("1") || sd4In.equals("1") || sd3In.equals("1")
			|| sd2In.equals("1") || sd1In.equals("1"))
		{
			
		}
		
		if (sd6In.equals("3") || sd5In.equals("3") || sd4In.equals("3") || sd3In.equals("3")
				|| sd2In.equals("3") || sd1In.equals("3"))
			{
				
			}
			
		
		return chordName;
	}
	*/
	
	/**
	 * Prints the scale degrees on each string.
	 */
	public void printScaleDegreesOnEachString()
	{
		System.out.println("6: " + sd6);
		System.out.println("5: " + sd5);
		System.out.println("4: " + sd4);
		System.out.println("3: " + sd3);
		System.out.println("2: " + sd2);
		System.out.println("1: " + sd1);
	}
	
	/**
	 * This method returns the sixth string's scale degree so 
	 * that the chord can be identified.
	 * @return The sixth string's scale degree.
	 */
	public String getSD6()
	{
		return sd6;
	}
	
	/**
	 * This method returns the fifth string's scale degree so 
	 * that the chord can be identified.
	 * @return The fifth string's scale degree.
	 */
	public String getSD5()
	{
		return sd5;
	}
	
	/**
	 * This method returns the fourth string's scale degree so 
	 * that the chord can be identified.
	 * @return The fourth string's scale degree.
	 */
	public String getSD4()
	{
		return sd4;
	}
	
	/**
	 * This method returns the third string's scale degree so 
	 * that the chord can be identified.
	 * @return The third string's scale degree.
	 */
	public String getSD3()
	{
		return sd3;
	}
	
	/**
	 * This method returns the second string's scale degree so 
	 * that the chord can be identified.
	 * @return The second string's scale degree.
	 */
	public String getSD2()
	{
		return sd2;
	}
	
	/**
	 * This method returns the first string's scale degree so 
	 * that the chord can be identified.
	 * @return The first string's scale degree.
	 */
	public String getSD1()
	{
		return sd1;
	}
	
	/**
	 * Would return the name of the chord if it could be identified by 
	 * this application.
	 */
	/*
	public String getNameOfChord()
	{
		return nameOfChord;
	}
	*/
}
