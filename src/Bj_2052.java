import java.io.*;
import java.math.BigDecimal;

public class Bj_2052 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        BigDecimal bd = BigDecimal.ONE;
        bd = bd.divide(new BigDecimal(Math.pow(2,n)));
        System.out.println(bd);
    }
}