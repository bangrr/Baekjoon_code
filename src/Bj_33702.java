import java.io.*;

public class Bj_33702 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        System.out.print(n % 2 == 0 ? 0 : 8);
    }
}