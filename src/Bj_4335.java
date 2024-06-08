import java.io.*;
import java.util.*;

public class Bj_4335 {
    public static void main(String[] args) throws IOException {
        System.out.println(Runtime.getRuntime().totalMemory());
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int[] arr = new int[11];
        boolean flag = true;

        while (true) {
            int n = Integer.parseInt(br.readLine());
            if (n == 0) break;
            String s = br.readLine();
            if (Objects.equals("too high", s)) {
                if (arr[n] != 0 && arr[n] != 1) {
                    flag = false;
                }
                arr[n] = 1;
            } else if (Objects.equals("too low", s)) {
                if (arr[n] != 0 && arr[n] != 2) {
                    flag = false;
                }
                arr[n] = 2;
            } else if (Objects.equals("right on", s)) {
                if (arr[n] != 0) {
                    flag = false;
                }
                arr[n] = 3;
                for (int i=1; i<n; i++) {
                    if (arr[i] != 0 && arr[i] != 2) {
                        flag = false;
                        break;
                    }
                }
                for (int i=n+1; i<11; i++) {
                    if (arr[i] != 0 && arr[i] != 1) {
                        flag = false;
                        break;
                    }
                }
                if (flag) {
                    sb.append("Stan may be honest\n");
                } else {
                    sb.append("Stan is dishonest\n");
                }
                arr = new int[11];
                flag = true;
            }
        }
        System.out.print(sb);
    }
}