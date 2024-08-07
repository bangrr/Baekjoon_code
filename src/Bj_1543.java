import java.io.*;
import java.util.*;

public class Bj_1543 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        String s = br.readLine();
        String t = br.readLine();
        int a = 0;
        for (int i = 0; i < s.length(); i++) {
            int c = 0;
            int k = i;
            for (int j = 0; j < t.length(); j++) {
                if (k < s.length() && s.charAt(k) == t.charAt(j)) {
                    c++;
                    k++;
                } else {
                    break;
                }
            }
            if (c == t.length()) {
                a++;
                i+=t.length()-1;
            }
        }
        System.out.print(a);
    }
}