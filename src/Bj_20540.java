import java.io.*;

public class Bj_20540 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        String s = br.readLine();
        for (int i=0; i<s.length(); i++) {
            char c = s.charAt(i);
            if (c == 'E') {
                sb.append('I');
            } else if (c == 'I') {
                sb.append('E');
            } else if (c == 'S') {
                sb.append('N');
            } else if (c == 'N') {
                sb.append('S');
            } else if (c == 'T') {
                sb.append('F');
            } else if (c == 'F') {
                sb.append('T');
            } else if (c == 'J') {
                sb.append('P');
            } else if (c == 'P') {
                sb.append('J');
            } else {
                sb.append(c);
            }
        }
        System.out.print(sb);
    }
}