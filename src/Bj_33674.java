import java.io.*;
import java.util.*;

public class Bj_33674 {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken()); // 입력수
        int d = Integer.parseInt(st.nextToken()); // 총 일수
        int k = Integer.parseInt(st.nextToken()); // 폭발점
        int m = 0;
        st = new StringTokenizer(br.readLine());
        for (int i=0; i<n; i++) {
            m = Math.max(m, Integer.parseInt(st.nextToken()));
        }
        int c = k/m;
        System.out.print(d==1?0:(d-1)/c);
    }
}