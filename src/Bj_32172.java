import java.io.*;
import java.util.*;

public class Bj_32172 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[999999];
        arr[0] = 1;
        int last = 0;
        for (int i = 1; i <= n; i++) {
            int tmp = last - i;
            if (tmp < 0 || arr[tmp] > 0) {
                tmp = last + i;
            }
            arr[tmp] = 1;
            last = tmp;
        }
        System.out.print(last);
    }
}