import java.io.*;
import java.util.*;

public class Bj_21965 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n + 2];
        int pk = 0;
        int pi = 0;
        st = new StringTokenizer(br.readLine());
        for (int i=1; i<=n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
            if (pk < arr[i]) {
                pk = arr[i];
                pi = i;
            }
        }

        for (int i=1; i<=pi; i++) {
            if (arr[i - 1] >= arr[i]) {
                System.out.print("NO");
                return;
            }
        }
        for (int i=pi+1; i<=n; i++) {
            if (arr[i - 1] <= arr[i]) {
                System.out.print("NO");
                return;
            }
        }
        System.out.print("YES");
    }
}