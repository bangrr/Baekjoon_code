import java.io.*;
import java.util.*;

public class Bj_9226 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        String s;
        while (!(s = br.readLine()).equals("#")) {
            int idx = 0;
            for (int i = 0; i < s.length(); i++) {
                if ("aeiou".indexOf(s.charAt(i)) != -1) {
                    idx = i;
                    break;
                }
            }
            sb.append(s.substring(idx));
            sb.append(s, 0, idx);
            sb.append("ay\n");
        }
        System.out.print(sb);
    }
}