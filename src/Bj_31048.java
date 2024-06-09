import java.io.*;
import java.util.*;

public class Bj_31048 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        int[] arr = new int[11];
        arr[0] = 1;
        for (int i=1; i<11; i++) {
            arr[i] = arr[i-1] * i;
        }

        int t = Integer.parseInt(br.readLine());
        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine());
            sb.append(arr[n]%10).append("\n");
        }
        System.out.print(sb);
    }
}