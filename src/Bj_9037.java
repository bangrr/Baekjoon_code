import java.io.*;
import java.util.*;

public class Bj_9037 {
    static StringBuilder sb = new StringBuilder();
    static int n;
    static int[] arr;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int t = Integer.parseInt(br.readLine());
        while (t-- > 0) {
            n = Integer.parseInt(br.readLine());
            arr = new int[n];
            int[] tmp = new int[n];
            st = new StringTokenizer(br.readLine());
            for (int i=0; i<n; i++) {
                arr[i] = Integer.parseInt(st.nextToken());
            }
            int cnt = 0;
            while (true) {
                if(check()) break;
                tmp[0] = (arr[0]+arr[n-1])/2;
                for (int i=1; i<n; i++) {
                    tmp[i] = (arr[i]+arr[i-1])/2;
                }
                arr = tmp.clone();
                cnt++;
            }
            sb.append(cnt).append("\n");
        }

        System.out.print(sb);
    }

    static boolean check() {
        for (int i=0; i<n; i++) {
            if (arr[i] % 2 == 1) arr[i]+=1;
        }
        for (int i=1; i<n; i++) {
            if (arr[i] != arr[i-1]) return false;
        }
        return true;
    }
}