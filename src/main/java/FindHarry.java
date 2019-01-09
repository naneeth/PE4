import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FindHarry {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        System.out.println("Is Harry here ?" + findingHarry(str));
    }
    public static String findingHarry(String s) {
        if (s == null) {
            return null;
        } else {
            boolean b = false;
            String[] words = s.split("[ ,.]");
            for (String item : words) {
                if (item.equals("Harry")) {
                    b = true;
                    break;
                }

            }
            if (b) {
                return "Is Harry here ?" + b;
            } else {
                return "Is Harry here ?" + b;
            }

        }
    }
}
