import java.io.*;

public class Bj_33810 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String org = "SciComLove";
        String str = br.readLine();
        int cnt = 0;
        for (int i=0; i<10; i++) {
            if (org.charAt(i) != str.charAt(i)) {
                cnt++;
            }
        }
        System.out.print(cnt);
    }
}