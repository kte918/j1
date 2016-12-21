import java.util.*;

public class Ch6_Q5_countChar{
	public static void main(String[] args){
 		Ch6_Q5_countChar c = new Ch6_Q5_countChar();
 		String sentence = "Java Program is fun";
 		c.countChar(sentence);
 	}
	
	public void countChar(String text){
 		char[] s = text.toCharArray();
 		Map<String, Integer> word = new HashMap<String,Integer>();
 		String w;
 		for(char c: s)
		{
 			w = Character.toString(c);
 			if(word.containsKey(w)){
 				word.put(w,word.get(w)+1);
 			} else {
 				word.put(w,1);
 			}
 		}
 		System.out.println(word);
	}

} 