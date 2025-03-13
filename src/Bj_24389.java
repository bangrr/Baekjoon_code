import java.io.*;

public class Bj_24389 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String po = Integer.toBinaryString(Integer.parseInt(br.readLine()));
        int len = po.length();
        int cnt = 0;
        for (int i = len-1; i >= 0; i--) {
            if (po.charAt(i) == '1') {
                cnt = len-i;
                break;
            }
        }
        System.out.print(32-cnt);
    }
}