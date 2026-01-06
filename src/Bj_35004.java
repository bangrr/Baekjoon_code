import java.io.*;
import java.util.*;

public class Bj_35004 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        String s = Integer.toString(n, 2);
        int cnt = 0;
        for (int i = s.length()-1; i >= 0; i--) {
            if (s.charAt(i) != '0') cnt++;
        }
        System.out.print(cnt);
    }
}