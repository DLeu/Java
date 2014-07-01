import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.io.Writer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;


public class Test {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		File f = new File("file_name");
		File g = new File("get_file");
		FileReader fr = new FileReader(f);
		FileWriter wr = new FileWriter(g);
		//Reader rd = new InputStreamReader("file_name");
		//Writer wr = new OutputStreamReader("get_file");
		BufferedReader br = new BufferedReader(fr);
		BufferedWriter writer = new BufferedWriter(wr);
		try{
			String line = br.readLine();
			while(line!=null && line.length()!=0)
			{
				System.out.println(line);
				writer.write(line);
				line = br.readLine();
				writer.newLine();
			}
		}
		catch(IOException iex)
		{
			
		}
		ArrayList<Integer> ai = new ArrayList<Integer>();
		Iterator<Integer> it;
		
		Random r = new Random();
		for(int i=0; i<5; i++)
		{
			int x = r.nextInt(10);
			ai.add(x);
		}
		it = ai.iterator();
		while(it.hasNext())
		{
			Integer item = it.next();
			System.out.println(item);
		}
		writer.close();
	}
	
}
