import java.io.*;
import java.util.*;

public class Bj_32778 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        String s = br.readLine();
        int le = s.indexOf("(");
        int ri = s.indexOf(")");
        String name, sub;
        if (le > -1) {
            name = s.substring(0, le-1);
            sub = s.substring(le+1, ri);
        } else {
            name = s;
            sub = "-";
        }
        System.out.println(name);
        System.out.print(sub);
    }
}