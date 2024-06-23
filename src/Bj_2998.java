import java.io.*;

public class Bj_2998 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String b = br.readLine();

        if (b.length() % 3 == 1) {
            sb.append(b.charAt(0));
        } else if (b.length() % 3 == 2) {
            sb.append((b.charAt(0)-48) * 2 + (b.charAt(1)-48));
        }

        for (int i=b.length() % 3; i<b.length(); i+=3) {
            sb.append((b.charAt(i)-48) * 4 +
                    (b.charAt(i+1)-48) * 2 +
                    (b.charAt(i+2)-48));
        }
        System.out.print(sb);
    }
}