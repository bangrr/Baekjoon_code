import java.io.*;
import java.util.*;

public class Bj_26546 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        int t = Integer.parseInt(br.readLine());
        while (t-- > 0) {
            st = new StringTokenizer(br.readLine());
            char[] arr = st.nextToken().toCharArray();
            int i = Integer.parseInt(st.nextToken());
            int j = Integer.parseInt(st.nextToken());
            for (int k = 0; k < i; k++) {
                sb.append(arr[k]);
            }
            for (int k = j; k < arr.length; k++) {
                sb.append(arr[k]);
            }
            sb.append("\n");
        }
        System.out.print(sb);
    }
}
