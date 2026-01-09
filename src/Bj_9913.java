import java.io.*;
import java.util.*;

public class Bj_9913 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[1001];
        for (int i = 0; i < n; i++) {
            arr[Integer.parseInt(br.readLine())]++;
        }
        int max = 0;
        for (int i = 1; i <= 1000; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
        }
        System.out.print(max);
    }
}