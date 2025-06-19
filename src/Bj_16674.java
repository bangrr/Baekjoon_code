import java.io.*;
import java.util.*;

public class Bj_16674 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        String s = br.readLine();
        int t = 0;
        int z = 0;
        int o = 0;
        int e = 0;
        for (int i=0; i<s.length(); i++) {
            char c = s.charAt(i);
            if (c == '2') {
                t++;
            } else if (c == '0') {
                z++;
            } else if (c == '1') {
                o++;
            } else if (c == '8') {
                e++;
            } else {
                System.out.print(0);
                return;
            }
        }

        int ans;
        if (t == z && z == o && o == e) {
            ans = 8;
        } else if (t > 0 && z > 0 && o > 0 && e > 0) {
            ans = 2;
        } else {
            ans = 1;
        }
        System.out.print(ans);
    }
}