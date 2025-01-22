import java.io.*;
import java.util.*;

public class Bj_6843 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        char[] a = br.readLine().replaceAll(" ", "").toCharArray();
        char[] b = br.readLine().replaceAll(" ", "").toCharArray();
        boolean chk = true;
        if (a.length == b.length) {
            Arrays.sort(a);
            Arrays.sort(b);
            for (int i = 0; i < a.length; i++) {
                if (a[i] != b[i]) {
                    chk = false;
                    break;
                }
            }
        } else {
            chk = false;
        }
        if (chk) {
            System.out.print("Is an anagram.");
        } else {
            System.out.print("Is not an anagram.");
        }
    }
}
