import java.io.*;

public class Bj_33950 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int t = Integer.parseInt(br.readLine());
        while (t-- > 0) {
            sb.append(br.readLine().replaceAll("PO", "PHO")).append("\n");
        }
        System.out.print(sb);
    }
}