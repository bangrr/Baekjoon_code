import java.io.*;

public class Bj_25184 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());
        int d = (n+1)/2;
        if (n%2 == 0) {
            for (int i=1; i<=d; i++) {
                sb.append(i+d).append(" ").append(i).append(" ");
            }
        } else {
            for (int i=1; i<d; i++) {
                sb.append(i).append(" ").append(i+d).append(" ");
            }
            sb.append(d);
        }
        System.out.print(sb);
    }
}