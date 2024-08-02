import java.io.*;

public class Bj_24751 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        System.out.println(100.0 / n);
        System.out.print(100.0 / (100-n));
    }
}