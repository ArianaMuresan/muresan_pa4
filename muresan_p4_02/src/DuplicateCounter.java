import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class DuplicateCounter {

    private Map<String,Integer> wordCounter;

    public void count(String dataFile) throws IOException {

        String wordcount;

        wordCounter = new HashMap <String,Integer>();

        Scanner scnr = new Scanner(new File(dataFile));

        while(scnr.hasNext())

        {

            wordcount = scnr.next();

            if (wordCounter.containsKey(wordcount)) {

                wordCounter.put(wordcount, wordCounter.get(wordcount) + 1);

            }

            else {

                wordCounter.put(wordcount, 1);

            }

        }

        scnr.close();

    }


    public void write(String filename)
    {
        try
        {
            PrintWriter outfile = new PrintWriter(new File(filename));
            for (String word : wordCounter.keySet())
            {
                outfile.println(word + " " + wordCounter.get(word));
            }
            outfile.close();
        }

        catch (FileNotFoundException e) {
            System.out.println(e.getMessage());

        }

    }
}
