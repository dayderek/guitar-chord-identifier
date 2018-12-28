
/**
 * This class is for setting up the key that the chord is based in. This 
 * is the same thing as the root (at least for purposes of this application).
 * @author dayderek
 *
 */

public class Key 
{
	public static final String[] initialNotes = {"C", "C#/Db", "D", "D#/Eb", "E", "F", 
			"F#/Gb", "G", "G#/Ab", "A", "A#/Bb", "B"};
	
	private String[] notesInKey = new String[12];
	
	/**
	 * This sets up the notesInKey String array so that each index of the 
	 * array correspond to the next note in the key.
	 * @param noteOfKey
	 */
	public Key(String noteOfKey)
	{
		int posOfRoot = 0;
		for (int i = 0; i <= 12; i++)
		{
			try
			{
				if (noteOfKey.equals(initialNotes[i]))
				{
					posOfRoot = i;
					break;
				}
			}
			catch (ArrayIndexOutOfBoundsException aioob) 
			{
				System.out.println("Invalid key");
				System.exit(1);
			}
		}
		
		int noteArrPos = posOfRoot;
		int j = 0;
		
		//Fills up the notesInKey array with notes (in order)
		//from the initialNotes array until it reaches the end of 
		//the initial notes.
		while (noteArrPos < 12)
		{
			notesInKey[j] = initialNotes[noteArrPos];
			j += 1;
			noteArrPos += 1;
		}
		
		//At this point we have to start at the beginning of the 
		//initial notes and go until the notesInKey array is full.
		
		noteArrPos = 0;
		
		while (j < 12)
		{
			notesInKey[j] = initialNotes[noteArrPos];
			j += 1; 
			noteArrPos += 1;
		}
	}
	
	/**
	 * The purpose of this method is to get the scale degree
	 * (in the form of a string) of the note that is passed in.
	 * @param note The note to find the scale degree of.
	 * @return A string of the scale degree the note corresponds to.
	 */
	public String getScaleDegreeOfNote(String note)
	{
		String scaleDegree = "";
		int positionOfNoteInKey = 0;
		for (int i = 0; i < notesInKey.length; i++)
		{
			if (note.equals(notesInKey[i]))
			{
				positionOfNoteInKey = i;
				break;
			}
		}
		
		if (positionOfNoteInKey == 0)
		{
			scaleDegree += "1";
		}
		else if (positionOfNoteInKey == 1)
		{
			scaleDegree += "b2/b9";
		}
		else if (positionOfNoteInKey == 2)
		{
			scaleDegree += "2/9";
		}
		else if (positionOfNoteInKey == 3)
		{
			scaleDegree += "b3";
		}
		else if (positionOfNoteInKey == 4)
		{
			scaleDegree += "3";
		}
		else if (positionOfNoteInKey == 5)
		{
			scaleDegree += "4/11";
		}
		else if (positionOfNoteInKey == 6)
		{
			scaleDegree += "b5/#11";
		}
		else if (positionOfNoteInKey == 7)
		{
			scaleDegree += "5";
		}
		else if (positionOfNoteInKey == 8)
		{
			scaleDegree += "#5";
		}
		else if (positionOfNoteInKey == 9)
		{
			scaleDegree += "6/13";
		}
		else if (positionOfNoteInKey == 10)
		{
			scaleDegree += "b7";
		}
		else
		{
			scaleDegree += "7";
		}
		
		return scaleDegree;
	}
	
	/**
	 * This method was created for use in testing. It prints 
	 * the notes of this key object in order.
	 */
	public void printNotesInKey()
	{
		for (int i = 0; i < notesInKey.length; i++)
		{
			System.out.println(i + 1 + " " + notesInKey[i]);
		}
	}
	
	
}
