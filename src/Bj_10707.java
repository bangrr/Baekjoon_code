import java.io.*;

public class Bj_10707 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int a = Integer.parseInt(br.readLine());
        int b = Integer.parseInt(br.readLine());
        int c = Integer.parseInt(br.readLine());
        int d = Integer.parseInt(br.readLine());
        int p = Integer.parseInt(br.readLine());

        int x = p * a;
        int y = p <= c ? b : b + d * (p - c);

        System.out.print(Math.min(x, y));
    }
}