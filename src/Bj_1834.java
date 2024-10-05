import java.io.*;
import java.util.*;

public class Bj_1834 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());
        long sum = 0;
        for (long i=1; i<n; i++) {
            sum += (i*(n+1));
        }
        System.out.print(sum);
    }
}