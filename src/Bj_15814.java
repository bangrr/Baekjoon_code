import java.io.*;
import java.util.*;

public class Bj_15814 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        char[] arr = br.readLine().toCharArray();
        int t = Integer.parseInt(br.readLine());
        while (t-- > 0) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            char tmp = arr[a];
            arr[a] = arr[b];
            arr[b] = tmp;
        }
        for (char c : arr) {
            sb.append(c);
        }
        System.out.print(sb);
    }
}