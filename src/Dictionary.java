import java.util.ArrayList;

public class Dictionary {
    private ArrayList<Word> list = new ArrayList<Word>();
    private int size;

    public Dictionary() {
        size = 0;
    }

    public void addWord(Word word) {
        list.add(word);
        size++;
    }

    public int getSize() {
        return size;
    }

    public void ShowAllWords() {
        System.out.format("%-5s | %-10s | %-10s\n",
                "No.", "English", "Vietnamese");
        for (int i = 0; i < list.size(); i++) {
            System.out.format("%-5s | %-10s | %-10s\n",
                    i + 1, list.get(i).getWord_target(), list.get(i).getWord_explain());
        }
    }
}
