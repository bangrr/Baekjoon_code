import java.io.*;
import java.util.*;

public class Bj_18384 {
    // 변수선언부
    static boolean[] notPrime;
    static int n;
    static ArrayList<Integer> primeNums;

    // main 메소드
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;
        eraPrime();
        int t = Integer.parseInt(br.readLine());
        while (t-- > 0) {
            int sum = 0;
            st = new StringTokenizer(br.readLine());
            for (int i=0; i<5; i++) {
                n = Integer.parseInt(st.nextToken());
                while (true) {
                    if (!notPrime[n]) {
                        sum += n;
                        break;
                    }
                    n++;
                }
            }
            sb.append(sum).append("\n");
        }
        System.out.print(sb);
    }

    // 에라토스테네스의 체
    static void eraPrime() {
        int m = 1234567;
        notPrime = new boolean[m+1];
        notPrime[0] = notPrime[1] = true;

        for (int i=2; i*i<=m; i++) {
            if (!notPrime[i]) {
                for (int j=i*i; j<=m; j+=i) {
                    notPrime[j] = true;
                }
            }
        }
    }
}