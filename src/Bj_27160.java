import java.io.*;
import java.util.*;

public class Bj_27160 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[4];
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            String s = st.nextToken();
            int x = Integer.parseInt(st.nextToken());
            if (s.equals("STRAWBERRY")) {
                arr[0] += x;
            } else if (s.equals("BANANA")) {
                arr[1] += x;
            } else if (s.equals("LIME")) {
                arr[2] += x;
            } else if (s.equals("PLUM")) {
                arr[3] += x;
            }
        }
        String ans = "NO";
        for (int i = 0; i < 4; i++) {
            if (arr[i] == 5) {
                ans = "YES";
            }
        }
        System.out.print(ans);
    }
}