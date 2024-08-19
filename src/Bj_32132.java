import java.io.*;
import java.util.*;

public class Bj_32132 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());
        String s = br.readLine();
        while (true) {
            if (s.contains("PS4")) {
                int idx = s.indexOf("PS4");
                s = s.substring(0, idx+2)+s.substring(idx+3);
            } else if (s.contains("PS5")) {
                int idx = s.indexOf("PS5");
                s = s.substring(0, idx+2)+s.substring(idx+3);
            } else {
                break;
            }
        }
        System.out.print(s);
    }
}