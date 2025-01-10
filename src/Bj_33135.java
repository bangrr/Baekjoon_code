import java.io.*;
import java.util.*;

public class Bj_33135 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        String s = br.readLine();
        int ans = s.length();
        int[] arr = new int[26];
        for (int i = s.length()-1; i >= 0; i--) {
            int ch = s.charAt(i)-'A';
            if (arr[ch] == 0) {
                arr[ch]++;
                ans--;
            } else {
                break;
            }
        }
        System.out.print(ans);
    }
}
