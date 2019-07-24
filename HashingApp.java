//Andre Barajas 

import java.awt.List;
import java.io.File;
import java.io.FileNotFoundException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.LinkedList;
import java.util.Scanner;

public class HashingApp 
{
	public static int smallT = 2857;
	public static int bigT = 5749;
	public static void main(String args[]) throws FileNotFoundException 
	{
		//small table test
		Scanner input = new Scanner(new File("/Users/alexphilayvanh/eclipse-workspace/HashingApp/src/file.txt"));
		HashTable table1 = new HashTable(smallT);
		HashTable table2 = new HashTable(smallT);
		HashTable table3= new HashTable(smallT);
		while(input.hasNext()) {
			String x = input.next();
			Key key  = new Key(x);
			table1.insertWord(key.functionOne());
			table2.insertWord(key.functionTwo());
			table3.insertWord(key.functionThree());
			
		}
		
		
		input.close();
		System.out.println("SMALL TABLE");
		System.out.println("Function 1");
		table1.statistics();
		System.out.println("Function 2");
		table2.statistics();
		System.out.println("Function 3");
		table3.statistics();
		
		
		//big table test
		Scanner input2 = new Scanner(new File("/Users/alexphilayvanh/eclipse-workspace/HashingApp/src/file.txt"));
		HashTable table4 = new HashTable(bigT);
		HashTable table5 = new HashTable(bigT);
		HashTable table6= new HashTable(bigT);
		while(input2.hasNext()) {
			String x = input2.next();
			Key key  = new Key(x);
			table4.insertWord(key.functionOne());
			table5.insertWord(key.functionTwo());
			table6.insertWord(key.functionThree());
			
		}
		
		
		input2.close();
		System.out.println("BIG TABLE");
		System.out.println("Function 1");
		table4.statistics();
		System.out.println("Function 2");
		table5.statistics();
		System.out.println("Function 3");
		table6.statistics();
		
		
		
		
		
		
		
	}
	
	public static int readFile(Scanner in)
	{
		int amt= 0;
		while(in.hasNextLine())
		{
			amt = in.nextInt();
		}
		return amt;
	}
}