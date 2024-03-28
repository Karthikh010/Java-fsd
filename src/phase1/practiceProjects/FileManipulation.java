package phase1.practiceProjects;

import java.io.*;;

public class FileManipulation 
{
	public static void readFile(String filename) 
	{
        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) 
        {
            String line;
            while ((line = reader.readLine()) != null) 
            {
                System.out.println(line);
            }
        } 
        catch (IOException e) 
        {
            System.out.println("Error reading file: " + e.getMessage());
        }
    }

	public static void writeFile(String filename, String content) 
	{
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filename))) 
        {
            writer.write(content);
            System.out.println("\nContent written to file successfully.");
        } 
        catch (IOException e) 
        {
            System.out.println("Error writing to file: " + e.getMessage());
        }
    }
	
	public static void appendToFile(String filename, String content) 
	{
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filename, true))) 
        {
            writer.newLine(); 
            writer.write(content);
            System.out.println("\nContent appended to file successfully.");
        } 
        catch (IOException e) 
        {
            System.out.println("Error appending to file: " + e.getMessage());
        }
    }
	
	public static void main(String[] args) 
	{
		String filename = "TestFile.txt";
		writeFile(filename, "This is the content we are writing to this file.");
		
		System.out.println("\nPrinting the Content written to file:");
        readFile(filename);
        
        appendToFile(filename, "This is the string appended to the file.");
        
        System.out.println("\nContents of file after appending:");
        readFile(filename);
	}

}
