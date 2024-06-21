import java.io.*;

public class Bj_31867 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        String s = br.readLine();
        int c = 0;
        for (int i = 0; i < n; i++) {
            c = c + (s.charAt(i) % 2 == 0 ? 1 : -1);
        }
        System.out.print(c > 0 ? 0 : c < 0 ? 1 : -1);
    }
}