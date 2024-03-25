import java.io.*;
import java.util.*;

public class Bj_1439 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        String s = br.readLine();
        char c = ' ';
        int a = 0;
        for (int i=0; i<s.length(); i++) {
            if (c != s.charAt(i)) {
                c = s.charAt(i);
                a++;
            }
        }
        System.out.print(a/2);
    }
}
