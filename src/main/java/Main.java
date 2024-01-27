

public class Main {
	
	public static void main(final String[] args) {
		PigLatin sim = new PigLatin();
        	//sim.tester();
		public void setup() 
{
    String[] lines = {"beast", "dough", "happy", "questions", "star", "three", "eagle", "try"};
    System.out.println("There are " + lines.length + " lines");
    for (int i = 0; i < lines.length; i++) 
    {
        System.out.println(pigLatin(lines[i]));
    }
}

public void draw()
{
    //not used
}

public int findFirstVowel(String sWord)
{
    for (int i = 0; i < sWord.length(); i++) 
    {
        if (sWord.substring(i, i + 1).equals("a") || sWord.substring(i, i + 1).equals("e") || 
            sWord.substring(i, i + 1).equals("i") || sWord.substring(i, i + 1).equals("o") || 
            sWord.substring(i, i + 1).equals("u")) 
        {
            return i;
        }
    }
    return -1;
}

public String pigLatin(String sWord)
{
    int firstVowelIndex = findFirstVowel(sWord);
    
    if (firstVowelIndex == -1)
    {
        return sWord + "ay";
    }
    else if (firstVowelIndex == 0)
    {
        return sWord + "way";
    }
    else 
    {
        String beginningConsonants = sWord.substring(0, firstVowelIndex);
        String restOfWord = sWord.substring(firstVowelIndex);
        
        // For words starting with "qu"
        if (beginningConsonants.toLowerCase().equals("qu")) 
        {
            return restOfWord + beginningConsonants + "ay";
        } 
        else 
        {
            return restOfWord + beginningConsonants + "ay";
        }
    }
}
	}
	


}

