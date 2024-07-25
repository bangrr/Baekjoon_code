import java.io.*;
import java.util.*;

public class Bj_10769 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        String s = br.readLine();
        int happy = 0;
        int sad = 0;
        for (int i=0; i<s.length()-2; i++) {
            if (s.charAt(i) == ':' && s.charAt(i+1) == '-') {
                if (s.charAt(i+2) == ')') happy++;
                else if (s.charAt(i+2) == '(') sad++;
            }
        }

        if (happy == 0 && sad == 0) System.out.print("none");
        else if (happy > sad) System.out.print("happy");
        else if (happy < sad) System.out.print("sad");
        else System.out.print("unsure");
    }
}