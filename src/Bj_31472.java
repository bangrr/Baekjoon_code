import java.io.*;

public class Bj_31472 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int p = Integer.parseInt(br.readLine());
        System.out.print((int)Math.sqrt(p*2)*4);
    }
}