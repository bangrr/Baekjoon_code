import java.io.*;
import java.util.*;

public class Bj_31608 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        String s = br.readLine();
        String t = br.readLine();
        int cnt = 0;
        for (int i = 0; i < n; i++) {
            if (s.charAt(i) != t.charAt(i)) cnt++;
        }
        System.out.print(cnt);
    }
}