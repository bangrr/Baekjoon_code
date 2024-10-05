import java.io.*;
import java.math.BigInteger;
import java.util.*;

public class Bj_4150 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());
        BigInteger[] arr = new BigInteger[n+5];
        arr[1] = BigInteger.ONE;
        arr[2] = BigInteger.ONE;
        for (int i = 3; i <= n; i++) {
            arr[i] = arr[i-1].add(arr[i-2]);
        }
        System.out.print(arr[n]);
    }
}