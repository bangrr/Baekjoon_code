import java.io.*;

public class Bj_23303 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        if (s.contains("D2") || s.contains("d2")) {
            System.out.print("D2");
        } else {
            System.out.print("unrated");
        }
    }
}