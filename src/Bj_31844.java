import java.io.*;

public class Bj_31844 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String s = br.readLine();
        int x = 0, y = 0, z = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '@') {
                x = i;
            } else if (c == '#') {
                y = i;
            } else if (c == '!') {
                z = i;
            }
        }
        if (x < y && y < z) {
            System.out.print(z-x-1);
        } else if (x > y && y > z) {
            System.out.print(x-z-1);
        } else {
            System.out.print(-1);
        }
    }
}