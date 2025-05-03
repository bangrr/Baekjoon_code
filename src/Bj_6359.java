import java.io.*;

public class Bj_6359 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int t = Integer.parseInt(br.readLine());
        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine());
            boolean[] arr = new boolean[n+1];
            for (int j=1; j<=n; j++) {
                for (int k=j; k<=n; k+=j) {
                    arr[k] = !arr[k];
                }
            }
            int cnt = 0;
            for (int j=1; j<=n; j++) {
                if (arr[j]) {
                    cnt++;
                }
            }
            sb.append(cnt).append("\n");
        }
        System.out.print(sb);
    }
}