import java.io.*;
import java.util.*;

public class Bj_16018 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        char[] arr = br.readLine().toCharArray();
        String s = br.readLine();
        int cnt = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] == 'C' && arr[i] == s.charAt(i)) {
                cnt++;
            }
        }
        System.out.print(cnt);
    }
}