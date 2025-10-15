import java.io.*;
import java.util.*;

public class Bj_6784 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        char[] arr = new char[n];
        for (int i = 0; i < n; i++) {
            arr[i] = br.readLine().charAt(0);
        }

        int cnt = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] == br.readLine().charAt(0)) {
                cnt++;
            }
        }
        System.out.print(cnt);
    }
}