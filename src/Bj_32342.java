import java.io.*;
import java.util.*;

public class Bj_32342 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());
        for (int i=0; i<n; i++) {
            String s = br.readLine();
            int cnt = 0;
            for (int j=0; j<s.length()-2; j++) {
                if (s.charAt(j) == 'W' && s.charAt(j+1) == 'O' && s.charAt(j+2) == 'W') cnt++;
            }
            sb.append(cnt).append("\n");
        }
        System.out.print(sb);
    }
}