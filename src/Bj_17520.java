import java.io.*;
import java.util.*;

public class Bj_17520 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[100001];
        arr[0] = 0;
        arr[1] = 2;
        arr[2] = 2;
        arr[3] = 4;
        for (int i = 4; i <= n; i++) {
            arr[i] = (arr[i-2] * 2) % 16769023;
        }
        System.out.print(arr[n]);
    }
}