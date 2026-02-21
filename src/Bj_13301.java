import java.io.*;
import java.util.*;

public class Bj_13301 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        long[] arr = new long[81];
        arr[1] = arr[2] = 1;
        for (int i = 3; i <= 80; i++) arr[i] = arr[i-1] + arr[i-2];

        long[] rect = new long[81];
        rect[1] = 4;
        rect[2] = 6;
        for (int i = 3; i <= 80; i++) rect[i] = rect[i-1] + arr[i] * 2;

        int n = Integer.parseInt(br.readLine());
        System.out.print(rect[n]);
    }
}