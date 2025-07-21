import java.io.*;

public class Bj_17094 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        String s = br.readLine();
        int cnt = 0;
        for (int i = 0; i < n; i++) {
            char c = s.charAt(i);
            if (c == '2') {
                cnt++;
            } else if (c == 'e') {
                cnt--;
            }
        }
        System.out.print(cnt > 0 ? "2" : cnt < 0 ? "e" : "yee");
    }
}