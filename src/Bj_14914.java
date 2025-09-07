import java.io.*;
import java.util.*;

public class Bj_14914 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        for (int i=1; i<=Math.max(a,b); i++) {
            if (a % i == 0 && b % i == 0) {
                sb.append(i).append(" ").append(a / i).append(" ").append(b / i).append("\n");
            }
        }
        System.out.print(sb);
    }
}