import java.io.*;
import java.util.*;

public class Bj_18228 {
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
        boolean chk = false;
        int min = 1111111111;
        int sum = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] == -1) {
                sum += min;
                min = 1111111111;
                chk = !chk;
            } else {
                min = Math.min(min, arr[i]);
            }
        }
        System.out.print(sum + min);
    }
}