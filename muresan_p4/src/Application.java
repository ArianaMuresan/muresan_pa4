import java.io.IOException;

class Application
{
    public static void main(String[] args) throws IOException {

        DuplicateRemover dupe = new DuplicateRemover();
        dupe.remove("problem1.txt");
        dupe.write("unique_words.txt");

    }
}