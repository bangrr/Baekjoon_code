import java.io.*;
import java.util.*;

public class Bj_26148 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());
        int a = Integer.parseInt(br.readLine());

        int[] arr = new int[]{31,28,31,30,31,30,31,31,30,31,30,31};
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += (arr[i] % 7);
        }

        if (n % 4 == 0 && (n % 100 != 0 || n % 400 == 0)) {
            System.out.print(sum+1);
        } else {
            System.out.print(sum);
        }
    }
}
