import java.io.*;
import java.util.*;

public class Bj_10610 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        char[] arr = br.readLine().toCharArray();
        int len = arr.length;
        Arrays.sort(arr);
        if (arr[0] == '0') {
            int sum = 0;
            for (int i=0; i<len; i++) {
                sb.append(arr[len-1-i]);
                sum += (arr[i]-'0');
            }
            if (sum % 3 == 0) {
                System.out.print(sb);
            } else {
                System.out.print(-1);
            }
        } else {
            System.out.print(-1);
        }
    }
}