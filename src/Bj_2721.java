import java.io.*;
import java.util.*;

public class Bj_2721 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        int[] arr = new int[301];
        int a = 0;
        int d = 2;
        for (int i = 1; i <= 300; i++) {
            a += d++;
            arr[i] = a;
        }

        int t = Integer.parseInt(br.readLine());
        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine());
            sb.append(arr[n]*(arr[n]+1)/2).append("\n");
        }
        System.out.print(sb);
    }
}
