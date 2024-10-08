import java.io.*;
import java.util.*;

public class Bj_3447 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        String s = "";
        while ((s = br.readLine()) != null) {
            while (s.contains("BUG")) {
                s = s.replace("BUG", "");
            }
            sb.append(s).append("\n");
        }
        System.out.print(sb);
    }
}