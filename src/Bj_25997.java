import java.io.*;

public class Bj_25997 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        long a = Long.parseLong(br.readLine());
        long b = Long.parseLong(br.readLine());
        long c = Long.parseLong(br.readLine());

        if (a + b == c) {
            System.out.print(1);
        } else if (a*a + b*b == c*c) {
            System.out.print(2);
        } else {
            System.out.print(-1);
        }
    }
}