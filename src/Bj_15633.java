import java.io.*;
import java.util.*;

public class Bj_15633 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());
        int sum = 0;
        for (int i = 1; i*i <= n; i++) {
            if (n % i == 0) {
                sum += i;
                if (i != n/i) sum += n/i;
            }
        }
        System.out.print(sum*5-24);
    }
}