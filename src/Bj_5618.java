import java.io.*;
import java.util.*;

public class Bj_5618 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());
        TreeSet<Integer> set = new TreeSet<>();
        st = new StringTokenizer(br.readLine());
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        int min = Integer.MAX_VALUE;
        if (n == 2) {
            min = Math.min(arr[0], arr[1]);
        } else if (n == 3) {
            min = Math.min(arr[0], Math.min(arr[1], arr[2]));
        }
        int pass = 0;
        for (int i = 1; i <= min; i++) {
            for (int j = 0; j < n; j++) {
                if (arr[j] % i == 0) {
                    pass++;
                }
            }
            if (pass == n) set.add(i);
            pass = 0;
        }
        for (int it : set) {
            sb.append(it).append("\n");
        }
        System.out.print(sb);
    }
}