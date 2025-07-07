import java.io.*;

public class Bj_33963 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int m = String.valueOf(n).length();
        int c = 0;
        while (true) {
            if (String.valueOf(n * 2).length() != m) {
                System.out.print(c);
                return;
            }
            n *= 2;
            c++;
        }
    }
}