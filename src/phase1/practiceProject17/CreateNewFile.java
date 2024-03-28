package phase1.practiceProject17;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CreateNewFile {

	public static void main(String[] args) throws IOException 
	{
		File f  = new File("testFile1.txt");
		//create new file
		f.createNewFile();
		
		//print true if the file exist
		System.out.println("If the file exists: "+ f.exists());
		
		//write content
		FileWriter w = new FileWriter(f);
		w.write("This is testFile1");
		w.flush();
		w.close();
		
		String s = "This is testFile2";
		FileOutputStream fos = new FileOutputStream("testFile2.txt");
		fos.write(s.getBytes());
		fos.close();
		
		//read the file
		System.out.println("The content in the file is: ");
		FileReader fr = new FileReader(f);
		BufferedReader br = new BufferedReader(fr);
		String line = br.readLine();
		while(line!=null)
		{
			System.out.println(line);
			line = br.readLine();
		}
		br.close();
		f.delete();
		System.out.println("If the file exists: "+ f.exists());
	}

}
