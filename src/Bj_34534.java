import java.io.*;
import java.util.*;

public class Bj_34534 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());
        boolean[] arr = new boolean[9];
        for (int i=0; i<5; i++) {
            arr[Integer.parseInt(st.nextToken())-1] = true;
        }

        int min = 5;
        for (int i=4; i<9; i++) {
            int cnt = 0;
            for (int j=i-4; j<=i; j++) {
                if (!arr[j]) cnt++;
            }
            min = Math.min(min, cnt);
        }
        System.out.print(min);
    }
}