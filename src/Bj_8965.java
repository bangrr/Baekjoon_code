import java.io.*;
import java.util.*;

public class Bj_8965 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        int t = Integer.parseInt(br.readLine());
        while (t-- > 0) {
            String s = br.readLine();
            String ss = s+s;
            String smallest = s;
            for (int i = 1; i < s.length(); i++) {
                String tmp = ss.substring(i, i + s.length());
                if (tmp.compareTo(smallest) < 0) {
                    smallest = tmp;
                }
            }
            sb.append(smallest).append("\n");
        }
        System.out.print(sb);
    }
}