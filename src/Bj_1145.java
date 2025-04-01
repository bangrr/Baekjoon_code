import java.io.*;
import java.util.*;

public class Bj_1145 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());
        int[] arr = new int[5];
        for (int i = 0; i < 5; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        int i = 1;
        while (true) {
            int cnt = 0;
            for (int j = 0; j < 5; j++) {
                if (i % arr[j] == 0) cnt++;
            }
            if (cnt >= 3) {
                System.out.print(i);
                return;
            }
            i++;
        }
    }
}