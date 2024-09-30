import java.io.*;
import java.util.*;

public class Bj_1788 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());
        int std = 1000000;
        int mod = 1000000000;
        int[] arr = new int[std*2+1];
        arr[std] = 0;
        arr[std+1] = 1;

        if (n > 0) {
            for (int i = std+2; i <= std + n; i++) {
                arr[i] = (arr[i-1] + arr[i-2]) % mod;
            }
        } else if (n < 0) {
            for (int i = std-1; i >= std + n; i--) {
                arr[i] = (arr[i+2] - arr[i+1]) % mod;
            }
        }
        System.out.println(Integer.compare(arr[std + n], 0));
        System.out.print(Math.abs(arr[std+n]));
    }
}