import java.io.*;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;


public class DuplicateRemover {

    Set<String> uniqueWords;

    public void remove(String dataFile) throws IOException {

        String words;
        String str = "problem1.txt";

        uniqueWords = new HashSet<String>();

        Scanner scnr = new Scanner(new File(dataFile));

        while(scnr.hasNext())
        {
            words = scnr.next();
            uniqueWords.add(words);
        }
        scnr.close();
    }

    public void write(String outputFile)
    {
        try {
            PrintWriter writer = new PrintWriter(new File(outputFile));

            for (String string : uniqueWords)
            {
                writer.println(string);
            }
            writer.flush();
            writer.close();
        } catch (FileNotFoundException e)
        {
            System.out.println(e);
        }
    }
}