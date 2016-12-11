import java.util.Scanner;
import java.io.*;

public class ScannerTest{
public static void main(String[] args)
{
	try{
		Scanner f = new Scanner(new File("test.txt"));
		String line = f.nextLine();
		System.out.println(line);
	} catch(FileNotFoundException e){
		System.out.println("I can't find file");
	}
}
}


