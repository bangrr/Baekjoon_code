import java.io.*;

public class Bj_34032 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        String s = br.readLine();
        int cnt = 0;
        for (int i=0; i<n; i++) {
            char c = s.charAt(i);
            if (c == 'O') cnt++;
        }
        System.out.print(cnt >= (n+1)/2 ? "Yes" : "No");
    }
}