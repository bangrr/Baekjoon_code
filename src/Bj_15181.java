import java.io.*;
import java.util.*;

public class Bj_15181 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        char[] arr = new char[]{'A', 'B', 'C', 'D', 'E', 'F', 'G', 'A', 'B', 'C', 'D', 'E', 'F'};

        while (true) {
            String s = br.readLine();
            if (s.equals("#")) break;

            boolean flag = true;
            for (int i = 0; i < s.length() - 1; i++) {
                char c = s.charAt(i);
                char next = s.charAt(i + 1);
                if (next != arr[c - 'A' + 2] && next != arr[c - 'A' + 4] && next != arr[c - 'A' + 6]) {
                    flag = false;
                    break;
                }
            }
            sb.append(flag ? "That music is beautiful.\n" : "Ouch! That hurts my ears.\n");
        }
        System.out.print(sb);
    }
}