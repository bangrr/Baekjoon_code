import java.io.*;

public class Bj_17350 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String ans = "뭐야?";
        while (n-- > 0) {
            String s = br.readLine();
            if ("anj".equals(s)) {
                ans = "뭐야;";
            }
        }
        System.out.print(ans);
    }
}