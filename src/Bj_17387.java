import java.io.*;
import java.util.*;

public class Bj_17387 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());
        int x1 = Integer.parseInt(st.nextToken());
        int y1 = Integer.parseInt(st.nextToken());
        int x2 = Integer.parseInt(st.nextToken());
        int y2 = Integer.parseInt(st.nextToken());

        if (compare(x1, y1, x2, y2) > 0) {
            int[] arr = new int[]{x2, y2, x1, y1};
            x1 = arr[0];
            y1 = arr[1];
            x2 = arr[2];
            y2 = arr[3];
        }

        st = new StringTokenizer(br.readLine());
        int x3 = Integer.parseInt(st.nextToken());
        int y3 = Integer.parseInt(st.nextToken());
        int x4 = Integer.parseInt(st.nextToken());
        int y4 = Integer.parseInt(st.nextToken());

        if (compare(x3, y3, x4, y4) > 0) {
            int[] arr = new int[]{x4, y4, x3, y3};
            x3 = arr[0];
            y3 = arr[1];
            x4 = arr[2];
            y4 = arr[3];
        }

        int ccw1 = ccw(x1, y1, x2, y2, x3, y3);
        int ccw2 = ccw(x1, y1, x2, y2, x4, y4);
        int ccw3 = ccw(x3, y3, x4, y4, x1, y1);
        int ccw4 = ccw(x3, y3, x4, y4, x2, y2);

        if (ccw1 != ccw2 && ccw3 != ccw4) {
            System.out.print(1);
        } else if (ccw1 == 0 && ccw2 == 0 && ccw3 == 0 && ccw4 == 0) {
            System.out.print(compare(x1, y1, x4, y4) <= 0 && compare(x3, y3, x2, y2) <= 0 ? 1 : 0);
        } else {
            System.out.print(0);
        }
    }

    private static int compare(int x1, int y1, int x2, int y2) {
        if (x1 == x2) {
            return y1 - y2;
        } else {
            return x1 - x2;
        }
    }

    private static int ccw(int x1, int y1, int x2, int y2, int x3, int y3) {
        long a = (long)(x2-x1)*(y3-y1);
        long b = (long)(x3-x1)*(y2-y1);

        return Long.compare(a, b);
    }
}