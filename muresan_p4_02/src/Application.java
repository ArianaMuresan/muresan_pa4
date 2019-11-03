import java.io.IOException;

class Application
{
    public static void main(String[] args) throws IOException {

        DuplicateCounter dupe = new DuplicateCounter();
        dupe.count("problem2.txt");
        dupe.write("unique_words_counts.txt");

    }
}