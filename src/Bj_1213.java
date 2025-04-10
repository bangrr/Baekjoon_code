import java.io.*;
import java.util.*;

public class Bj_1213 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        String s = br.readLine();
        int[] arr = new int[26];
        for (int i = 0; i < s.length(); i++) {
            arr[s.charAt(i) - 'A']++;
        }
        int oddCnt = 0;
        for (int i = 0; i < 26; i++) {
            if (arr[i] % 2 == 1) oddCnt++;
        }
        if (oddCnt > 1) {
            System.out.print("I'm Sorry Hansoo");
        } else {
            String ans;
            String cen = "";
            for (int i = 0; i < 26; i++) {
                if (arr[i] == 0) continue;

                if (arr[i] % 2 == 0) {
                    sb.append(String.valueOf((char) ('A' + i)).repeat(arr[i] / 2));
                } else {
                    if (arr[i] > 1) {
                        sb.append(String.valueOf((char) ('A' + i)).repeat(arr[i] / 2));
                    }
                    cen = String.valueOf((char) ('A' + i));
                }
            }
            ans = sb + cen;
            System.out.print(ans + sb.reverse());
        }
    }
}