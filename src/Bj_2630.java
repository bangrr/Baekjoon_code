import java.util.*;
import java.io.*;

public class Bj_2630 {
    static int n, white, blue;
    static int[][] arr;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());
        arr = new int[n][n];
        for (int i=0; i<n; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j=0; j<n; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        recursion(0, 0, n);
        System.out.println(white);
        System.out.println(blue);
    }

    private static void recursion(int r, int c, int size) {
        if (check(r, c, size)) {
            if (arr[r][c] == 0) {
                white++;
            } else {
                blue++;
            }
        } else {
            int newSize = size/2;
            recursion(r, c, newSize);
            recursion(r+newSize, c, newSize);
            recursion(r, c+newSize, newSize);
            recursion(r+newSize, c+newSize, newSize);
        }
    }

    private static boolean check(int r, int c, int size) {
        int color = arr[r][c];
        for (int i=r; i<r+size; i++) {
            for (int j=c; j<c+size; j++) {
                if (arr[i][j] != color) return false;
            }
        }
        return true;
    }
}