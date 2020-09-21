public class DictionaryCommandline {
    static void showAllWords(Dictionary dictionary) {
        System.out.println("No    | English               | Vietnamese");
        for(int i = 0; i < dictionary.words.size(); i++) {
            System.out.printf("%d     | %-22s| %s\n", i+1, dictionary.words.get(i).word_target, dictionary.words.get(i).word_explain);
        }
    }

    static void dictionaryBasic(Dictionary dictionary) {
        DictionaryManagement.insertFromCommandline(dictionary);
        showAllWords(dictionary);
    }
}
