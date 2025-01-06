import java.io.*;
import java.util.*;

public class Bj_8371 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());
        char[] a = br.readLine().toCharArray();
        char[] b = br.readLine().toCharArray();
        int cnt = 0;
        for (int i = 0; i < n; i++) {
            if (a[i] != b[i]) {
                cnt++;
            }
        }
        System.out.print(cnt);
    }
}
