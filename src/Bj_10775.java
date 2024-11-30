import java.io.*;
import java.util.*;

public class Bj_10775 {
    static int[] arr;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        int G = Integer.parseInt(br.readLine());
        arr = new int[G+1];
        for (int i = 1; i <= G; i++) {
            arr[i] = i;
        }

        int P = Integer.parseInt(br.readLine());
        int cnt = 0;
        for (int i = 0; i < P; i++) {
            int g = Integer.parseInt(br.readLine());
            if (find(g) == 0) {
                break;
            }
            cnt++;
            union(find(g), find(g)-1);
        }
        System.out.print(cnt);
    }

    static void union(int u, int v) {
        u = find(u);
        v = find(v);
        arr[u] = v;
    }

    static int find(int x) {
        if (arr[x] == x) {
            return x;
        }
        return arr[x] = find(arr[x]);
    }
}