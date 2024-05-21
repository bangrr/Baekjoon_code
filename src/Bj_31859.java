import java.io.*;
import java.util.*;

public class Bj_31859 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        String s = st.nextToken();
        String ns = "";
        String ds = "";
        int cnt = 0;
        for (int i=0; i<s.length(); i++) {
            if (ns.indexOf(s.charAt(i)) == -1) {
                ns += s.charAt(i);
            } else {
                cnt++;
            }
        }
        ns += (cnt+4);
        ns = (n+1906) + ns;
        ds = "";
        for (int i=ns.length()-1; i>=0; i--) {
            ds += ns.charAt(i);
        }
        System.out.print("smupc_"+ds);
    }
}