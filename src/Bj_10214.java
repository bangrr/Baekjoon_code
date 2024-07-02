import java.io.*;
import java.util.*;

public class Bj_10214 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        int t = Integer.parseInt(br.readLine());
        while (t-- > 0) {
            int sum = 0;
            for (int i = 0; i < 9; i++) {
                st = new StringTokenizer(br.readLine());
                sum += Integer.parseInt(st.nextToken());
                sum -= Integer.parseInt(st.nextToken());
            }
            sb.append(sum > 0 ? "Yonsei" : sum < 0 ? "Korea" : "Draw").append("\n");
        }
        System.out.print(sb);
    }
}