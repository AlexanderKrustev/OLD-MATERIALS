import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 * Created by krustev on 27-Mar-16.
 */
public class ExtractAllUniqueWords {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);

        String input=in.nextLine();
        String[] words=input.split("[^\\w']+");


        ArrayList<String> wordCounter=new ArrayList<>();
        for (String word : words) {
            if(!word.equals("") && !wordCounter.contains(word.toLowerCase())){
                wordCounter.add(word.toLowerCase());
            }
        }
        Collections.sort(wordCounter);
        System.out.println(wordCounter);
    }
}
