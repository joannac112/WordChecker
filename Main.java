import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> words = new ArrayList<String>();
        words.add("an");
        words.add("band");
        words.add("band");
        words.add("abandon");
        System.out.println(words);
        WordChecker x = new WordChecker(words);
        System.out.println(x.isWordChain());
        ArrayList<String> word = new ArrayList<String>();
        word.add("to");
        word.add("too");
        word.add("stool");
        word.add("tools");
        System.out.println(word);
        WordChecker y = new WordChecker(word);
        System.out.println(y.isWordChain());
        ArrayList<String> example = new ArrayList<String>();
        example.add("catch");
        example.add("bobcat");
        example.add("catchacat");
        example.add("cat");
        example.add("at");
        System.out.println(example);
        ArrayList<String> example2 = createList("cat");
    }
}