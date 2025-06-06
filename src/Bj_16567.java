import java.io.*;
import java.util.*;

public class Bj_16567 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        int flip = 0;
        int[] arr = new int[n+2];
        st = new StringTokenizer(br.readLine());
        for (int i=1; i<=n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
            if (arr[i] == 1) {
                flip = calcFlip(arr, i, flip);
            }
        }

        for (int i=0; i<m; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            if (a == 0) {
                sb.append(flip).append("\n");
            } else {
                int b = Integer.parseInt(st.nextToken());
                if (arr[b] == 0) {
                    arr[b] = 1;
                    flip = calcFlip(arr, b, flip);
                }
            }
        }
        System.out.print(sb);
    }

    private static int calcFlip(int[] arr, int b, int flip) {
        if (arr[b -1] == 0 && arr[b +1] == 0) {
            flip++;
        } else if (arr[b -1] == 1 && arr[b +1] == 1) {
            flip--;
        }
        return flip;
    }
}