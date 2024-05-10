import java.io.*;
import java.util.*;

public class Bj_31800 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());
        int[] benefit = new int[n];
        int[] price = new int[n];
        int[] sub = new int[n];
        st = new StringTokenizer(br.readLine());
        for (int i=0; i<n; i++) {
            benefit[i] = Integer.parseInt(st.nextToken());
        }
        int[] cpy = Arrays.copyOf(benefit, n);
        Arrays.sort(cpy);
        int max1st = cpy[n-1];
        int max2nd = cpy[n-2];
        st = new StringTokenizer(br.readLine());
        for (int i=0; i<n; i++) {
            price[i] = Integer.parseInt(st.nextToken());
            sub[i] = benefit[i] - ((benefit[i] == max1st ? max2nd : max1st) - price[i] + price[i]);
        }
        for (int i=0; i<n; i++) {
            sb.append(sub[i]).append(" ");
        }
        System.out.print(sb);
    }
}