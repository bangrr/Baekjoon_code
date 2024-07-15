import java.io.*;

public class Bj_32025 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int h = Integer.parseInt(br.readLine());
        int w = Integer.parseInt(br.readLine());
        System.out.print(Math.min(h, w)*100/2);
    }
}