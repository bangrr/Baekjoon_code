import java.io.*;

public class Bj_16495 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String s = br.readLine();
        long n = 1;
        long sum = 0;
        for (int i=s.length() - 1; i >= 0; i--) {
            int c = s.charAt(i)- 'A' + 1;
            sum += (n * c);
            n *= 26;
        }
        System.out.print(sum);
    }
}