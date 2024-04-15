import java.io.*;
import java.util.*;

public class Bj_12927 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        char[] s = br.readLine().toCharArray();
        int n = s.length;
        int cnt = 0;
        for (int i=0; i<n; i++) {
            if (s[i]=='Y') {
                for (int j=i; j<n; j+=(i+1)) {
                    s[j]= s[j] == 'Y' ? 'N' : 'Y';
                }
                cnt++;
            }
        }
        System.out.print(cnt);
    }
}