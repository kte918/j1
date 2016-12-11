import java.util.*;
import java.io.*;

class PrintFile {
	
    public void print() 
	{
		try{
			File f = new File("test.txt");
			FileReader fr=new FileReader(f); 
			BufferedReader br = new BufferedReader(fr);
			String s;
			while((s = br.readLine())!=null) { 
				System.out.println(s); 
			} 
			fr.close();
		} catch (Exception e) {
		System.out.println("I can't find Files");
		}
    }
	
	public static void main(String[] args)
	{
	PrintFile p = new PrintFile();
	p.print();
	}
}