import java.io.*;

public class Bj_31611 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print(Integer.parseInt(br.readLine()) % 7 == 2 ? 1 : 0);
    }
}