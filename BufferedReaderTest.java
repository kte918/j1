import java.util.Scanner;
import java.io.*;

public class BufferedReaderTest {
	public static void main(String[] args) throws Exception
	{
	try{
	File f = new File("test2.txt");
	FileReader fr = new FileReader(f);
	BufferedReader br = new BufferedReader(fr);
	String s;
	while((s = br.readLine())!=null){
	System.out.println(s.toLowerCase());
	}
	} catch (FileNotFoundException e) {
	System.out.println("I can't find File");
	}
	}
}