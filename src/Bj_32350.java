import java.io.*;
import java.util.*;

public class Bj_32350 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int d = Integer.parseInt(st.nextToken());
        int p = Integer.parseInt(st.nextToken());
        int[] arr = new int[n];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        int cnt = 0;
        int idx = 0;
        while (arr[arr.length-1] > 0) {
            cnt++;
            if (arr[idx] > 0) {
                arr[idx] -= d;
                if (arr[idx] <= 0 && idx < arr.length-1) {
                    int od = -arr[idx] * p / 100;
                    arr[idx+1] -= od;
                    if (arr[idx+1] <= 0) ++idx;
                    ++idx;
                }
            } else if (arr[idx] == 0) {
                ++idx;
            }
        }
        System.out.print(cnt);
    }
}