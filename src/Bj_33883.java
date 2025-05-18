import java.io.*;

public class Bj_33883 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String s = br.readLine();
        int li = s.length() - 1;
        String last = s.substring(li);
        if ("aeiouns".contains(last)) {
            int cnt = 0;
            for (int i = li; i >= 0; i--) {
                String cur = s.substring(i, i + 1);
                if ("aeiou".contains(cur)) {
                    cnt++;
                    if (cnt == 2) {
                        System.out.print(i + 1);
                        return;
                    }
                }
            }
        } else {
            for (int i = li; i >= 0; i--) {
                String cur = s.substring(i, i + 1);
                if ("aeiou".contains(cur)) {
                    System.out.print(i + 1);
                    return;
                }
            }
        }
        System.out.print(-1);
    }
}