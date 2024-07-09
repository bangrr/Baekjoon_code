import java.io.*;

public class Bj_28797 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        double a = Double.parseDouble(br.readLine());
        if (a > 1) {
            System.out.print(100 + 100 * (a-1) / 3);
        } else {
            System.out.print(100 * a);
        }
    }
}