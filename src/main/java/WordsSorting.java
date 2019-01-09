import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class WordsSorting {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        System.out.println(wordsSorting(str));
    }
    public static String wordsSorting(String s){
        if(s.trim()==""){
            return null;
        }
        else{
        String[] words = s.split(" ");
        Arrays.sort(words);
        String str = "" ;
        for (int i=0;i<words.length;i++){
           str += words[i] + " ";
        }
    return str.trim();
        }
    }
}
