import java.io.*;
import java.util.*;

public class Bj_17598 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int cnt = 0;
        for (int i=0; i<9; i++) {
            String str = br.readLine();
            if ("Lion".equals(str)) {
                cnt++;
            } else {
                cnt--;
            }
        }
        System.out.print(cnt > 0 ? "Lion" : "Tiger");
    }
}