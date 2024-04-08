import java.io.*;
import java.util.*;

public class Bj_11656 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        String s = br.readLine();
        String[] arr = new String[s.length()];
        for (int i=0; i<arr.length; i++) {
            arr[i] = s.substring(i);
        }
        Arrays.sort(arr);
        for (int i=0; i<arr.length; i++) {
            sb.append(arr[i]).append("\n");
        }
        System.out.print(sb);
    }
}