import java.io.*;

public class Bj_23027 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String s = br.readLine();
        if (s.contains("A")) {
            s = s.replaceAll("[BCDF]", "A");
        } else if (s.contains("B")) {
            s = s.replaceAll("[CDF]", "B");
        } else if (s.contains("C")) {
            s = s.replaceAll("[DF]", "C");
        } else {
            s = s.replaceAll("[A-Z]", "A");
        }
        System.out.print(s);
    }
}