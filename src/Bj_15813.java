import java.io.*;

public class Bj_15813 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        String s = br.readLine();
        int sum = 0;
        for (int i=0; i<n; i++) {
            sum += s.charAt(i)-64;
        }
        System.out.print(sum);
    }
}