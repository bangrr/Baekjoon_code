import java.io.*;
import java.util.*;

public class Bj_24074 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];
        int max = Integer.MIN_VALUE;
        int idx = -1;
        int ls = 0;
        int rs = 0;
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
            if (max < arr[i]) {
                max = arr[i];
                idx = i;
            }
        }
        for (int i = 0; i < idx; i++) {
            ls += arr[i];
        }
        for (int i = idx+1; i < n; i++) {
            rs += arr[i];
        }
        System.out.println(ls);
        System.out.print(rs);
    }
}