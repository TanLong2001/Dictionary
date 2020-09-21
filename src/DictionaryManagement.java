import java.util.Scanner;

public class DictionaryManagement {
    public static void insertFromCommandline(Dictionary dictionary) {
        Scanner sc = new Scanner(System.in);
        String target = sc.nextLine();
        String explain = sc.nextLine();
        Word word = new Word(target, explain);
        dictionary.words.add(word);
    }
}
