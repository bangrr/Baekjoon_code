import java.io.*;
import java.util.*;

public class Bj_31821 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());
        int[] menu = new int[n];
        for (int i = 0; i < n; i++) {
            menu[i] = Integer.parseInt(br.readLine());
        }
        int m = Integer.parseInt(br.readLine());
        int sum = 0;
        for (int i = 0; i < m; i++) {
            sum += menu[Integer.parseInt(br.readLine()) - 1];
        }
        System.out.print(sum);
    }
}