import java.io.*;

public class Bj_17249 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String s = br.readLine();
        String left = s.substring(0, s.indexOf("("));
        String right = s.substring(s.indexOf(")") + 1);
        System.out.print(count(left) + " " + count(right));
    }

    static int count(String str) {
        int cnt = 0;
        for (int i=0; i<str.length(); i++) {
            if (str.charAt(i) == '@') {
                cnt++;
            }
        }
        return cnt;
    }
}