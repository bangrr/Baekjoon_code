import java.io.*;

public class Bj_18406 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String s = br.readLine();
        int sum = 0;
        for (int i=0; i<s.length()/2; i++) {
            sum += Integer.parseInt(String.valueOf(s.charAt(i)));
        }
        for (int i=s.length()/2; i<s.length(); i++) {
            sum -= Integer.parseInt(String.valueOf(s.charAt(i)));
        }
        System.out.print(sum == 0 ? "LUCKY" : "READY");
    }
}