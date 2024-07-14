import java.io.*;
import java.util.*;

public class Bj_27257 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());
        while (n % 10 == 0) {
            n /= 10;
        }
        String s = String.valueOf(n);
        int cnt = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '0') cnt++;
        }
        System.out.print(cnt);
    }
}