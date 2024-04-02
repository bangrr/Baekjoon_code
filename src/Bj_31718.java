import java.io.*;
import java.util.*;

public class Bj_31718 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];
        st = new StringTokenizer(br.readLine());
        for (int i=0; i<n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
            while (arr[i] % 2 == 0) {
                arr[i] /= 2;
            }
        }
        Arrays.sort(arr);
        int max = 1;
        int cnt = 1;
        for (int i=1; i<n; i++) {
            if (arr[i] == arr[i-1]) {
                cnt++;
            } else {
                if (cnt > max) {
                    max = cnt;
                }
                cnt = 1;
            }
        }
        System.out.print(Math.max(max, cnt));
    }
}