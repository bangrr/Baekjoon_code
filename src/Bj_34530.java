import java.io.*;
import java.util.*;

public class Bj_34530 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());
        int ans = -1;
        for (int i=1; i<=360; i++) {
            if (n * i % 360 == 0) {
                ans = i;
                break;
            }
        }
        System.out.print(ans);
    }
}