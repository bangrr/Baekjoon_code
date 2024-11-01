import java.io.*;
import java.util.*;

public class Bj_15655 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringBuilder sb = new StringBuilder();
    static int n, m;
    static int[] selected;
    static int[] arr;
    static boolean[] used;

    public static void main(String[] args) throws IOException {
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        selected = new int[m];
        used = new boolean[n];

        arr = new int[n];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(arr);

        rec_func(0, 0);
        System.out.print(sb);
    }

    private static void rec_func(int start, int depth) {
        if (depth == m) {
            for (int i = 0; i < m; i++) {
                sb.append(selected[i]).append(" ");
            }
            sb.append("\n");
        } else {
            for (int i = start; i < arr.length; i++) {
                if (!used[i]) {
                    used[i] = true;
                    selected[depth] = arr[i];
                    rec_func(i, depth + 1);
                    used[i] = false;
                }
            }
        }
    }
}