import java.io.*;
import java.util.*;

public class Bj_6721 {
    public static int reverse(int num) {
        int result = 0;
        while (num > 0) {
            result = result * 10 + num % 10;
            num /= 10;
        }
        return result;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());
        for (int i=0; i<n; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int revA = reverse(a);
            int revB = reverse(b);
            int sum = revA + revB;
            int result = reverse(sum);
            sb.append(result).append("\n");
        }
        System.out.print(sb);
    }
}