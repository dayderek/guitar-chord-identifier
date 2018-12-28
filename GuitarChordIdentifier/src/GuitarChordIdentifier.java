import java.util.Scanner;


/**
 * This class contains the main method and methods to convert the fret
 * on each string to its corresponding note.
 * @author dayderek
 *
 */
public class GuitarChordIdentifier 
{
	public static void main(String[] args)
	{
		String sixthStr = "X";
		String fifthStr = "X";
		String fourthStr = "X";
		String thirdStr = "X";
		String secondStr = "X";
		String firstStr = "X";
		String rootIn = "";
		
		Scanner get = new Scanner(System.in);
		System.out.println("Welcome to the Guitar Chord Identifier");
		System.out.println("Enter fret number or X if no note will be played...");
		
		boolean inputIsValid = true;
		boolean inputFinished = false;
		int i = 6;
		try 
		{
			while (inputIsValid && !inputFinished)
			{
				System.out.printf("String %d: ", i);
				
				switch (i)
				{
					case 6:
						sixthStr = get.next();
						if (isValidInput(sixthStr))
						{
							i -= 1;
						}
						else 
						{
							inputIsValid = false;
						}
					break;
					
					case 5:
						fifthStr = get.next();
						if (isValidInput(fifthStr))
						{
							i -= 1;
						}
						else 
						{
							inputIsValid = false;
						}
					break;
					
					case 4:
						fourthStr = get.next();
						if (isValidInput(fourthStr))
						{
							i -= 1;
						}
						else 
						{
							inputIsValid = false;
						}
					break;
					
					case 3:
						thirdStr = get.next();
						if (isValidInput(thirdStr))
						{
							i -= 1;
						}
						else 
						{
							inputIsValid = false;
						}
					break;
					
					case 2:
						secondStr = get.next();
						if (isValidInput(secondStr))
						{
							i -= 1;
						}
						else 
						{
							inputIsValid = false;
						}
					break;
					
					case 1:
						firstStr = get.next();
						if (isValidInput(firstStr))
						{
							inputFinished = true;
						}
						else 
						{
							inputIsValid = false;
						}
					break;	
					
					default:
						inputFinished = true;
					break;	
				}	
			}
			if (!inputIsValid)
			{
				System.out.println("Invalid input.");
				System.exit(1);
			}
			
			else
			{
				System.out.println("Enter root of chord...");
				System.out.println(">>>If it's a sharp/flat note, input should be formatted like this - A#/Bb");
				System.out.print("Root: ");
				rootIn = get.next().toUpperCase();
			
				Chord c = new Chord(rootIn, eFretToNote(sixthStr), aFretToNote(fifthStr), 
						dFretToNote(fourthStr), gFretToNote(thirdStr), bFretToNote(secondStr),
						eFretToNote(firstStr));
				System.out.println();
				System.out.println("Here are your notes:");
				System.out.println();
				System.out.printf("Sixth string note and scale degree:    %5s --- %s\n", eFretToNote(sixthStr), c.getSD6());
				System.out.printf("Fifth string note and scale degree:    %5s --- %s\n", aFretToNote(fifthStr), c.getSD5());
				System.out.printf("Fourth string note and scale degree:   %5s --- %s\n", dFretToNote(fourthStr), c.getSD4());
				System.out.printf("Third string note and scale degree:    %5s --- %s\n", gFretToNote(thirdStr), c.getSD3());
				System.out.printf("Second string note and scale degree:   %5s --- %s\n", bFretToNote(secondStr), c.getSD2());
				System.out.printf("First string note and scale degree:    %5s --- %s\n", eFretToNote(firstStr), c.getSD1());
			
				get.close();
			}
		}
		catch (NumberFormatException nfe) 
		{
			System.out.println("Invalid input");
			System.exit(1);
			get.close();
			
		}
		
		
	}
	
	/**
	 * This method takes checks to see if the input for a single string
	 * was an x or a valid or invalid fret number.
	 * @param fret The input to find if it's a valid fret between 0-24 or an x
	 * @return True if the input is valid
	 */
	public static boolean isValidInput(String fret)
	{
		boolean returnVal = false;
		
		if (fret.toUpperCase().equals("X"))
		{
			returnVal = true;
		}
		else if (Integer.valueOf(fret) >= 0 && Integer.valueOf(fret) <= 24)
		{
			returnVal = true;
		}
		
		return returnVal;
	}
	
	/**
	 * Converts the fret on the e string to its corresponding note or x.
	 * @param fret the fret on the e string
	 * @return The note that the fret on this string is
	 */
	public static String eFretToNote(String fret)
	{
		String note = "X";
		String[] eString = {"E", "F", "F#/Gb", "G", "G#/Ab", "A", 
				"A#/Bb", "B", "C", "C#/Db", "D", "D#/Eb", "E"};
		
		if (fret.toUpperCase().equals("X"))
		{
			return note;
		}
		else if (Integer.valueOf(fret) >= 0 && Integer.valueOf(fret) <= 12)
		{
			note = eString[Integer.valueOf(fret)];
		}
		else 
		{
			note = eString[Integer.valueOf(fret) - 12];
		}
		
		return note;
	}
	
	/**
	 * Converts the fret on the a string to its corresponding note or x.
	 * @param fret the fret on the a string
	 * @return The note that the fret on this string is
	 */
	public static String aFretToNote(String fret)
	{
		String note = "X";
		String[] aString = {"A", "A#/Bb", "B", "C", "C#/Db", "D", "D#/Eb", "E", "F", 
				"F#/Gb", "G", "G#/Ab", "A"};
		
		if (fret.toUpperCase().equals("X"))
		{
			return note;
		}
		else if (Integer.valueOf(fret) >= 0 && Integer.valueOf(fret) <= 12)
		{
			note = aString[Integer.valueOf(fret)];
		}
		else 
		{
			note = aString[Integer.valueOf(fret) - 12];
		}
		
		return note;
	}
	
	/**
	 * Converts the fret on the d string to its corresponding note or x.
	 * @param fret the fret on the d string
	 * @return The note that the fret on this string is
	 */
	public static String dFretToNote(String fret)
	{
		String note = "X";
		String[] dString = {"D", "D#/Eb", "E", "F", 
				"F#/Gb", "G", "G#/Ab", "A", "A#/Bb", "B", "C", "C#/Db", "D"};
		
		if (fret.toUpperCase().equals("X"))
		{
			return note;
		}
		else if (Integer.valueOf(fret) >= 0 && Integer.valueOf(fret) <= 12)
		{
			note = dString[Integer.valueOf(fret)];
		}
		else 
		{
			note = dString[Integer.valueOf(fret) - 12];
		}
		
		return note;
	}
	
	/**
	 * Converts the fret on the g string to its corresponding note or x.
	 * @param fret the fret on the g string
	 * @return The note that the fret on this string is
	 */
	public static String gFretToNote(String fret)
	{
		String note = "X";
		String[] gString = {"G", "G#/Ab", "A", "A#/Bb", "B", "C", "C#/Db", "D", "D#/Eb", "E", "F", 
				"F#/Gb", "G"};
		
		if (fret.toUpperCase().equals("X"))
		{
			return note;
		}
		else if (Integer.valueOf(fret) >= 0 && Integer.valueOf(fret) <= 12)
		{
			note = gString[Integer.valueOf(fret)];
		}
		else 
		{
			note = gString[Integer.valueOf(fret) - 12];
		}
		
		return note;
	}
	
	/**
	 * Converts the fret on the b string to its corresponding note or x.
	 * @param fret the fret on the b string
	 * @return The note that the fret on this string is
	 */
	public static String bFretToNote(String fret)
	{
		String note = "X";
		String[] bString = {"B", "C", "C#/Db", "D", "D#/Eb", "E", "F", 
				"F#/Gb", "G", "G#/Ab", "A", "A#/Bb", "B"};
		
		if (fret.toUpperCase().equals("X"))
		{
			return note;
		}
		else if (Integer.valueOf(fret) >= 0 && Integer.valueOf(fret) <= 12)
		{
			note = bString[Integer.valueOf(fret)];
		}
		else 
		{
			note = bString[Integer.valueOf(fret) - 12];
		}
		
		return note;
	}	
}
