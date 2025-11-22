import java.io.*;
import java.util.*;

public class Bj_34778 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());
        int ans = 4;
        boolean[] arr = new boolean[4];
        for (int i=0; i<10; i++) {
            int d = Integer.parseInt(st.nextToken());
            arr[d-1] = true;
        }
        for (int i=0; i<4; i++) {
            if (arr[i]) ans--;
        }
        System.out.print(ans);
    }
}