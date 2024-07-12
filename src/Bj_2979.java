import java.io.*;
import java.util.*;

public class Bj_2979 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());
        int[] arr = new int[101];
        for (int i = 0; i < 3; i++) {
            st = new StringTokenizer(br.readLine());
            int from = Integer.parseInt(st.nextToken());
            int to = Integer.parseInt(st.nextToken());
            for (int j = from; j < to; j++) {
                arr[j]++;
            }
        }
        int sum = 0;
        for (int i = 1; i <= 100; i++) {
            if (arr[i] == 1) {
                sum += (arr[i] * a);
            } else if (arr[i] == 2) {
                sum += (arr[i] * b);
            } else if (arr[i] == 3) {
                sum += (arr[i] * c);
            }
        }
        System.out.print(sum);
    }
}