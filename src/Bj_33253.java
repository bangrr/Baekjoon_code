import java.io.*;
import java.util.*;

public class Bj_33253 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());
        String a = br.readLine();
        int[] arr = new int[26];
        int d = 0;
        for (int i = 0; i < n; i++) {
            arr[a.charAt(i) - 'a']++;
            d++;
        }
        String b = br.readLine();
        for (int i = 0; i < n; i++) {
            int c = b.charAt(i) - 'a';
            if (arr[c] > 0) {
                arr[c]--;
                d--;
            }
        }
        System.out.print(d);
    }
}
