import java.io.*;
import java.util.*;

public class Bj_33924 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(br.readLine());
        String s = br.readLine();
        for (int i = 0; i < k; i++) {
            char c = s.charAt(i);
            switch (c) {
                case 'A':
                    n = n > 2 ? n - 2 : n + 2;
                    break;
                case 'B':
                    n = n > 2 ? 7 ^ n : 3 ^ n;
                    m = 3 ^ m;
                    break;
                case 'C':
                    n = 5 - n;
                    m = 3 - m;
                    break;
                case 'D':
                    if (m == 1) {
                        if (n == 1) {
                            m++;
                        } else {
                            n--;
                        }
                    } else {
                        if (n == 4) {
                            m--;
                        } else {
                            n++;
                        }
                    }
                    break;
            }
        }
        System.out.print(n + " " + m);
    }
}