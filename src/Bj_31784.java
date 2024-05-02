import java.io.*;
import java.util.*;

public class Bj_31784 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        String s = br.readLine();
        int[] arr = new int[n];
        for (int i=0; i<n; i++) {
            arr[i] = s.charAt(i)-'A';
        }
        for (int i=0; k>0 && i<n; i++) {
            if (arr[i] != 0 && k >= 26-arr[i]) {
                k -= (26-arr[i]);
                arr[i] = 0;
            }
        }
        k%=26;
        arr[n-1] += k;
        for (int i=0; i<n; i++) {
            sb.append((char)(arr[i]+'A'));
        }
        System.out.print(sb);
    }
}