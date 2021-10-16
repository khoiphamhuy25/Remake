import java.util.Scanner;

public class DictionaryCommandline {
    private DictionaryManagement dictionaryManagement = new DictionaryManagement();

    public DictionaryCommandline() {
    }

    public void dictionaryBasic() {
        int option;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.print("Choose your option:\n1.Add words.\n2.Print dictionary\n3.Quit.\n");
            System.out.println("Your option :\n");
            option = sc.nextInt();
            if(option == 1){
                this.dictionaryManagement.insertFromCommandline();
            }
            else if(option == 2){
                this.dictionaryManagement.ShowAllWords();
            }
        }
        while(option!=3);
    }
}
