import java.io.*;

public class Bj_28691 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String s = br.readLine();
        if ("M".equals(s)) {
            System.out.print("MatKor");
        } else if ("W".equals(s)) {
            System.out.print("WiCys");
        } else if ("C".equals(s)) {
            System.out.print("CyKor");
        } else if ("A".equals(s)) {
            System.out.print("AlKor");
        } else if ("$".equals(s)) {
            System.out.print("$clear");
        }
    }
}