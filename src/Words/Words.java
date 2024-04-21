package Words;
import java.util.ArrayList;

public class Words {

    private String[] words = {"bola","pato","computador"};

    private ArrayList<String> callWords =  new ArrayList<>();

    public int length;

    public String[] getWords() {
        return this.words;
    }

    public void setWords(String[] words) {
        this.words = words;
    }

    public ArrayList<String> getCallWords() {
        return this.callWords;
    }

    public void setCallWords(ArrayList<String> callWords) {
        this.callWords = callWords;
    }

  
}
