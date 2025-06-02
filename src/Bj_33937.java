import java.io.*;

public class Bj_33937 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String s = "aeiou";
        String a = br.readLine();
        String b = br.readLine();
        String na = getString(s, a);
        String nb = getString(s, b);
        System.out.print(na.isBlank() || nb.isBlank() ? "no such exercise" : na+nb);
    }

    private static String getString(String s, String a) {
        StringBuilder sb = new StringBuilder();
        String ns;
        boolean chk = false;
        for (int i = 0; i<a.length(); i++) {
            boolean contains = s.contains(String.valueOf(a.charAt(i)));
            if (chk && !contains) {
                break;
            }
            if (contains) {
                chk = true;
            }
            sb.append(a.charAt(i));
        }
        ns = sb.toString();
        if (a.equals(ns)) ns = "";
        return ns;
    }
}