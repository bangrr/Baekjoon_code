import java.io.*;
import java.util.*;

public class Bj_11383 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        String[] arr = new String[n];
        for (int i = 0; i < n; i++) {
            arr[i] = br.readLine();
            for (int j = 0; j < m; j++) {
                char c = arr[i].charAt(j);
                sb.append(c).append(c);
            }
            arr[i] = sb.toString();
            sb.setLength(0);
        }

        for (int i = 0; i < n; i++) {
            String b = br.readLine();
            if (!b.equals(arr[i])) {
                System.out.print("Not Eyfa");
                return;
            }
        }
        System.out.print("Eyfa");
    }
}
