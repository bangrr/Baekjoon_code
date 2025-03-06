import java.io.*;
import java.util.*;

public class Bj_1568 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());
        int k = 1;
        int a = 0;
        while (n > 0) {
            if (k > n) {
                k = 1;
            }
            n -= k;
            a += 1;
            k += 1;
        }
        System.out.print(a);
    }
}