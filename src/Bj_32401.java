import java.io.*;
import java.util.*;

public class Bj_32401 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());
        String s = br.readLine();
        int ans = 0;
        boolean chkA = false;
        int cntN = 0;
        for (int i = 0; i < n; i++) {
            char c = s.charAt(i);
            if (c == 'A') {
                if (chkA && cntN == 1) {
                    ans++;
                }
                chkA = true;
                cntN = 0;
            } else if (c == 'N') {
                cntN++;
            }
        }
        System.out.print(ans);
    }
}