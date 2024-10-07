import java.io.*;
import java.util.*;

public class Bj_32290 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());
        int l = Integer.parseInt(st.nextToken());
        int r = Integer.parseInt(st.nextToken());
        int x = Integer.parseInt(st.nextToken());
        int ans = 0;
        boolean[] arr = new boolean[2222];
        for (int i = l; i <= r; i++) {
            arr[i|x] = true;
            System.out.println(i|x);
        }
        for (int i = 0; i < arr.length; i++) {
            if (!arr[i]) {
                ans = i;
                break;
            }
        }
        System.out.print(ans);
    }
}