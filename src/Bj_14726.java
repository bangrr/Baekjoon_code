import java.io.*;
import java.util.*;

public class Bj_14726 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        int t = Integer.parseInt(br.readLine());
        while (t-- > 0) {
            int[] arr = new int[16];
            String s = br.readLine();
            for (int i = 0; i < s.length(); i++) {
                arr[i] = s.charAt(i) - '0';
            }

            for (int i = 14; i >= 0; i-=2) {
                arr[i] = 2 * Integer.parseInt(String.valueOf(arr[i]));
                if (arr[i] >= 10) {
                    arr[i] = arr[i] % 10 + 1;
                }
            }

            int sum = 0;
            for (int i = 0; i < 16; i++) {
                sum += arr[i];
            }

            if (sum % 10 == 0) {
                sb.append("T");
            } else {
                sb.append("F");
            }
            sb.append("\n");
        }
        System.out.print(sb);
    }
}
