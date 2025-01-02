import java.io.*;
import java.util.*;

public class Bj_13333 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(arr);

        for (int i = n; i >= 0; i--) {
            if (i == 0) {
                System.out.print(i);
                return;
            } else {
                if (i <= arr[n - i]) {
                    System.out.print(i);
                    return;
                }
            }
        }
    }
}
