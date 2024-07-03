import java.io.*;
import java.util.*;

public class Bj_26560 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());
        for (int i = 0; i < n; i++) {
            String s = br.readLine();
            int len = s.length();
            if (s.charAt(len-1) != '.') s+='.';
            sb.append(s).append("\n");
        }
        System.out.println(sb);
    }
}