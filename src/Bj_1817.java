import java.io.*;
import java.util.*;

public class Bj_1817 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int[] boxes = new int[n];
        int[] books = new int[n];
        if (n > 0) st = new StringTokenizer(br.readLine());
        for (int i=0; i<n; i++) {
            books[i] = Integer.parseInt(st.nextToken());
        }
        int j = 0;
        for (int i=0; i<n; i++) {
            while (j < n) {
                if (boxes[j] + books[i] <= m) {
                    boxes[j] += books[i];
                    break;
                } else {
                    j++;
                }
            }
        }
        int cnt = 0;
        for (int it : boxes) {
            if (it > 0) {
                cnt++;
            }
        }
        System.out.print(cnt);
    }
}