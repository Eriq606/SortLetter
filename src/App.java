import java.util.LinkedList;
import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {
        Word word1=new Word("932c");
        Word word2=new Word("832u32");
        Word word3=new Word("2344b");

        LinkedList<Word> words=new LinkedList<>(List.of(word1, word2, word3));

        words.sort(null);

        // output: [ 2344b, 932c, 832u32 ]
        for(Word w:words){
            System.out.println(w.getWord());
        }
    }
}
