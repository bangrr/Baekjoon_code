import java.io.*;

public class Bj_34052 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int sum = 0;
        for (int i = 0; i < 4; i++) {
            int t = Integer.parseInt(br.readLine());
            sum += t;
        }
        System.out.print(sum+300 <= 1800 ? "Yes" : "No");
    }
}