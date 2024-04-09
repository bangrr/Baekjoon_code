import java.io.*;
import java.util.*;

public class Bj_24080 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());
        String s = br.readLine();
        int[] arr = new int[5];
        int cnt = 0;
        for (int i=0; i<n; i++) {
            char c = s.charAt(i);
            if (arr[c-'A'] == 0) {
                cnt++;
            }
            arr[c-'A']++;
        }
        if (cnt < 3) {
            System.out.print("No");
        } else {
            System.out.print("Yes");
        }
    }
}