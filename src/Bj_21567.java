import java.io.*;
import java.util.*;

public class Bj_21567 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        long a = Long.parseLong(br.readLine());
        long b = Long.parseLong(br.readLine());
        long c = Long.parseLong(br.readLine());
        String d = String.valueOf(a * b * c);
        int[] arr = new int[10];
        for (int i = 0; i < d.length(); i++) {
            arr[d.charAt(i)-'0']++;
        }
        for (int j : arr) {
            System.out.println(j);
        }
    }
}