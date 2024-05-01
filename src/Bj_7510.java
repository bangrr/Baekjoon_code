import java.io.*;
import java.util.*;

public class Bj_7510 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[3];
        for (int i=1; i<=n; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j=0; j<3; j++) {
                arr[j] = Integer.parseInt(st.nextToken());
            }
            Arrays.sort(arr);
            sb.append(String.format("Scenario #%d:\n", i));
            if (Math.pow(arr[0],2) + Math.pow(arr[1],2) == Math.pow(arr[2],2)) {
                sb.append("yes\n\n");
            } else {
                sb.append("no\n\n");
            }
        }
        System.out.print(sb);
    }
}