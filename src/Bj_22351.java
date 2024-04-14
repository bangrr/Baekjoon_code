import java.io.*;
import java.util.*;

public class Bj_22351 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb;
        StringTokenizer st;

        String s = br.readLine();
        int len = s.length();

        for (int t = 1; t <= 3; t++) {
            int start = Integer.parseInt(s.substring(0, t));
            sb = new StringBuilder();
            for (int i=start; ; i++) {
                sb.append(i);
                if (sb.length() == len && s.contentEquals(sb)) {
                    System.out.print(start + " " + i);
                    return;
                } else if (sb.length() > len) break;
            }
        }
    }
}