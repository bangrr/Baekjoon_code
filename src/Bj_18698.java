import java.io.*;
import java.util.*;

public class Bj_18698 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        int t = Integer.parseInt(br.readLine());
        while (t-- > 0) {
            String s = br.readLine();
            int c = 0;
            for (int i=0; i<s.length(); i++) {
                if (s.charAt(i) == 'D') break;
                c++;
            }
            sb.append(c).append("\n");
        }
        System.out.print(sb);
    }
}