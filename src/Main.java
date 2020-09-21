public class Main {
    public static void main(String[] args) {
        Dictionary dictionary = new Dictionary();
        DictionaryManagement.insertFromCommandline(dictionary);
        DictionaryCommandline.dictionaryBasic(dictionary);
    }
}
