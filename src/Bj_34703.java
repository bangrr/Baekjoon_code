import java.io.*;
import java.util.*;

public class Bj_34703 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[5];
        for (int i=0; i<n; i++) {
            int a = Integer.parseInt(br.readLine());
            arr[a-1]++;
        }
        for (int i=0; i<5; i++) {
            if (arr[i] == 0) {
                System.out.print("YES");
                return;
            }
        }
        System.out.print("NO");
    }
}