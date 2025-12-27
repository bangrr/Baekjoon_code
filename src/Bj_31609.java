import java.io.*;
import java.util.*;

public class Bj_31609 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[10];
        st = new StringTokenizer(br.readLine());
        for (int i=0; i<n; i++) {
            arr[Integer.parseInt(st.nextToken())] = 1;
        }
        for (int i=0; i<arr.length; i++) {
            if (arr[i] == 0) continue;
            sb.append(i).append("\n");
        }
        System.out.print(sb);
    }
}