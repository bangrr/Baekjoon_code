import java.io.*;
import java.util.*;

public class Bj_34824 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        for (int i=0; i<n; i++) {
            String s = br.readLine();
            if ("yonsei".equals(s)) {
                System.out.print("Yonsei Won!");
                break;
            } else if ("korea".equals(s)) {
                System.out.print("Yonsei Lost...");
                break;
            }
        }
    }
}