import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MatcherFind {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str1 = br.readLine();
        String str2 = br.readLine();
        System.out.println(matcher(str1,str2));
    }
    public static String matcher(String s1,String s2){
        Pattern ptr = Pattern.compile(s2);
        Matcher mtch = ptr.matcher(s1);
        String str ="";
        while (mtch.find()){
            str = str + "Found at:"+ mtch.start()+ "-" + mtch.end()+"\n";

        }
        return str.trim();
    }
}
