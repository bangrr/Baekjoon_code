import java.io.*;

public class Bj_20352 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        long s = Long.parseLong(br.readLine());
        double r = Math.sqrt(s / Math.PI);
        System.out.print(2 * Math.PI * r);
    }
}