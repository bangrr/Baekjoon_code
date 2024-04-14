import java.io.*;
import java.util.*;

public class Bj_19950 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());
        double x1 = Double.parseDouble(st.nextToken());
        double y1 = Double.parseDouble(st.nextToken());
        double z1 = Double.parseDouble(st.nextToken());
        double x2 = Double.parseDouble(st.nextToken());
        double y2 = Double.parseDouble(st.nextToken());
        double z2 = Double.parseDouble(st.nextToken());
        double d = Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1) + (z2 - z1) * (z2 - z1));

        int n = Integer.parseInt(br.readLine());
        Integer[] arr = new Integer[n];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(arr, Collections.reverseOrder());

        if (arr[0] >= d) {
            for (int i=1; i<n; i++) {
                arr[0] -= arr[i];
            }
            if (arr[0] <= d) {
                System.out.print("YES");
            } else {
                System.out.print("NO");
            }
        } else {
            for (int i=1; i<n; i++) {
                d -= arr[i];
            }
            if (d <= 0) {
                System.out.print("YES");
            } else {
                System.out.print("NO");
            }
        }
    }
}