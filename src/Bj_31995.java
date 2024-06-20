import java.io.*;

public class Bj_31995 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine())-1;
        int m = Integer.parseInt(br.readLine())-1;
        System.out.print(n*m*2);
    }
}