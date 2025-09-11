import java.io.*;
import java.util.*;

public class Bj_4118 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        String s;
        while ((s = br.readLine()) != null) {
            if (s.equals("0")) {
                break;
            }
            boolean[] arr = new boolean[49];
            int n = Integer.parseInt(s);
            for (int i = 0; i < n; i++) {
                st = new StringTokenizer(br.readLine());
                for (int j = 0; j < 6; j++) {
                    int a = Integer.parseInt(st.nextToken());
                    arr[a-1] = true;
                }
            }
            boolean b = true;
            for (boolean it : arr) {
                if (!it) {
                    b = false;
                    break;
                }
            }
            sb.append(b ? "Yes" : "No").append("\n");
        }
        System.out.print(sb);
    }
}