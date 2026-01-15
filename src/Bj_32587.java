import java.io.*;
import java.util.*;

public class Bj_32587 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int cnt = 0;
        char[] arr = br.readLine().toCharArray();
        char[] arr2 = br.readLine().toCharArray();
        for (int i=0; i<n; i++) {
            char c = arr[i];
            char h = arr2[i];
            if ((c == 'R' && h == 'S') || (c == 'S' && h == 'P') || (c == 'P' && h == 'R')) {
                cnt++;
            } else if ((c == 'S' && h == 'R') || (c == 'R' && h == 'P') || (c == 'P' && h == 'S')) {
                cnt--;
            }
        }
        System.out.print(cnt > 0 ? "victory" : "defeat");
    }
}