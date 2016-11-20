import java.util.*;
class countDigitsLetters
{
	public static void main(String[] args)
	{
		Map<String,String> m = new HashMap<String,String>();
		m.put("message","kgh");
		char[] letter = "word".toCharArray();
		StringBuilder b = new StringBuilder();

		for(int i = 0; i < letter.length; i++)

		{
			b.append(letter[i]);
			System.out.println(letter[i]);
		}
		System.out.println("\n");
		System.out.println(letter);
		System.out.println("message's length is "+letter.length);
	}
}