import java.util.*;
class HelloReverse
{
	public static void main(String[] args)
	{

		Map<String,String> m = new HashMap<String,String>();
		m.put("message","kgh");
		char[] letter = "hello".toCharArray();
		StringBuilder olleh = new StringBuilder();
			for(int i = letter.length-1; i >= 0; i--)
			{
				olleh.append(letter[i]);
				System.out.println(letter[i]);
			}
		System.out.println(olleh);
	}
}