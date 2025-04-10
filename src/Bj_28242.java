import java.io.*;

public class Bj_28242 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        for (int a=1; a*a<=n; a++) {
            if (n % a == 0) {
                int c = n/a;
                for (int b=-2000002; b<=2000002; b++) {
                    if (b != 0 && (n+2) % b == 0) {
                        int d = -(n+2)/b;
                        if (a*d + b*c == n+1) {
                            System.out.print(a + " " + b + " " + c + " " + d);
                            return;
                        }
                    }
                }
            }
        }
        System.out.print(-1);
    }
}