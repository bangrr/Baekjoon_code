import java.io.*;
import java.math.BigInteger;
import java.util.*;

public class Bj_15841 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        BigInteger[] arr = new BigInteger[491];
        arr[0] = BigInteger.ZERO;
        arr[1] = BigInteger.ONE;
        for (int i=2; i<=490; i++) arr[i] = arr[i-1].add(arr[i-2]);
        while (true) {
            int n = Integer.parseInt(br.readLine());
            if (n == -1) break;

            sb.append("Hour ").append(n).append(": ").append(arr[n]).append(" cow(s) affected\n");
        }
        System.out.print(sb);
    }
}