import java.io.*;
import java.util.*;

public class Bj_26731 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        char[] arr = br.readLine().toCharArray();
        Arrays.sort(arr);
        char ans = 'Z';
        for (int i=0; i<arr.length; i++) {
            char c = (char) ('A'+i);
            if (arr[i] != c) {
                ans = c;
                break;
            }
        }
        System.out.print(ans);
    }
}