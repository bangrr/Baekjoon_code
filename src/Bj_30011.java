import java.io.*;
import java.util.*;

public class Bj_30011 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        int[] arr = new int[n];
        for (int i=0; i<n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        int sum = 0;
        sum += (arr[0]-2) * 180;
        for (int i=1; i<n; i++) {
            sum += arr[i] * 180;
        }
        System.out.print(sum);
    }
}