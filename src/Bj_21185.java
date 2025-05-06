import java.io.*;

public class Bj_21185 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        String ans;
        switch (n % 4) {
            case 0:
                ans = "Even"; break;
            case 2:
                ans = "Odd"; break;
            default:
                ans = "Either"; break;
        }
        System.out.print(ans);
    }
}