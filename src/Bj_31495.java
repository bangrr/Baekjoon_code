import java.io.*;
import java.util.*;

public class Bj_31495 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        String s = br.readLine();
        if (s.length() > 2 && s.charAt(0) == '"' && s.charAt(s.length() - 1) == '"') {
            System.out.print(s.replaceAll("\"", ""));
        } else {
            System.out.print("CE");
        }
    }
}