import java.util.Scanner;

public class DictionaryManagement {
    private Dictionary dictionary = new Dictionary();
    public void insertFromCommandline() {
        Scanner sc = new Scanner(System.in);
        Word word = new Word();
        String s1,s2;
        System.out.println("Enter numbers of words:");
        int n;
        n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.println("Enter English word:");
            s1 = sc.next();
            word.setWord_target(s1);
            System.out.println("Enter Vietnamese meaning:");
            s2 = sc.next();
            word.setWord_explain(s2);
            dictionary.addWord(word);
        }
    }

    public void ShowAllWords(){
        this.dictionary.ShowAllWords();
    }
}
