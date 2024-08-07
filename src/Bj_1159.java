import java.io.*;
import java.util.*;

public class Bj_1159 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        int[] arr = new int[26];
        int n = Integer.parseInt(br.readLine());
        for (int i = 0; i < n; i++) {
            arr[br.readLine().charAt(0)-97]++;
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= 5) sb.append((char)(i+97));
        }
        if (sb.length() == 0) {
            System.out.print("PREDAJA");
        } else {
            System.out.print(sb);
        }
    }
}