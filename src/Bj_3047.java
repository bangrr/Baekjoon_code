import java.io.*;
import java.util.*;

public class Bj_3047 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());
        int[] arr = new int[3];
        for (int i=0; i<3; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(arr);
        String s = br.readLine();
        for (int i=0; i<s.length(); i++) {
            System.out.print(arr[s.charAt(i)-'A'] + " ");
        }
    }
}