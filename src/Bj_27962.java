import java.io.*;
import java.util.*;

public class Bj_27962 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());
        String s = br.readLine();
        for (int i = 1; i < n; i++) {
            String a = s.substring(0, i);
            String b = s.substring(n-i);
            int cnt = 0;
            for (int j = 0; j < i; j++) {
                if (a.charAt(j) != b.charAt(j)) {
                    cnt++;
                }
            }
            if (cnt == 1) {
                System.out.print("YES");
                return;
            }
        }
        System.out.print("NO");
    }
}