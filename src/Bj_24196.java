import java.io.*;
import java.util.*;

public class Bj_24196 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        String s = br.readLine();
        int a = 0;
        for (int i=0; i<s.length(); i+=a) {
            char c = s.charAt(i);
            sb.append(c);
            a = c-'A'+1;
        }
        System.out.print(sb);
    }
}