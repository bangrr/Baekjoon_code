import java.io.*;

public class Bj_33703 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        System.out.print((long) n * (n + 1) / 2);
    }
}
