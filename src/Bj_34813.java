import java.io.*;
import java.util.*;

public class Bj_34813 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();
        String ans;
        char ch = str.charAt(0);
        if (ch == 'F') {
            ans = "Foundation";
        } else if (ch == 'C') {
            ans = "Claves";
        }  else if (ch == 'V') {
            ans = "Veritas";
        } else if (ch == 'E') {
            ans = "Exploration";
        } else {
            ans = "";
        }
        System.out.print(ans);
    }
}