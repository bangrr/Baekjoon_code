import java.io.*;

public class Bj_1964 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        long n = Long.parseLong(br.readLine());
        System.out.print((((n + 1) * (3 * n + 2)) / 2) % 45678);
    }
}