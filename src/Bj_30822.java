import java.io.*;

public class Bj_30822 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        String str = br.readLine();
        int u=0, o=0, s=0, p=0, c=0;
        for (int i=0; i<n; i++) {
            char ch = str.charAt(i);
            if (ch == 'u') {
                u++;
            } else if (ch == 'o') {
                o++;
            } else if (ch == 's') {
                s++;
            } else if (ch == 'p') {
                p++;
            } else if (ch == 'c') {
                c++;
            }
        }
        System.out.print(Math.min(u, Math.min(o, Math.min(s, Math.min(p, c)))));
    }
}