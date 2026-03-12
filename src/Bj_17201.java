import java.io.*;
import java.util.*;

public class Bj_17201 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        String s = br.readLine();
        if (s.contains("11") || s.contains("22")) {
            System.out.print("No");
        } else {
            System.out.print("Yes");
        }
    }
}