import java.io.*;

public class Bj_31746 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder("SciComLove");
        if (n % 2 == 0) System.out.print(sb);
        else System.out.print(sb.reverse());
    }
}