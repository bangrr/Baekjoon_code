import java.io.*;
import java.util.*;

public class Bj_8416 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        int[] arr = new int[]{1, 1, 4, 4, 2, 1, 1, 4, 4, 2};
        st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken()) % 10;
        int b = Integer.parseInt(st.nextToken());
        b = b % arr[a] == 0 ? arr[a] : b % arr[a];
        System.out.print((int) Math.pow(a, b) % 10);
    }
}