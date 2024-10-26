import java.io.*;
import java.util.*;

public class Bj_11179 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());
        String s = Integer.toString(n, 2);
        for (int i = 0; i < s.length(); i++) {
            sb.append(s.charAt(s.length()-1-i));
        }
        System.out.print(Integer.valueOf(sb.toString(), 2));
    }
}