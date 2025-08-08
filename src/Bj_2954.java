import java.io.*;

public class Bj_2954 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String s = br.readLine().replaceAll("apa", "a")
                .replaceAll("epe", "e").replaceAll("ipi", "i")
                .replaceAll("opo", "o").replaceAll("upu", "u");
        System.out.print(s);
    }
}