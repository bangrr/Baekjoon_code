import java.io.*;
import java.util.*;
 
public class Bj_25756 { 
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
 
        int n = Integer.parseInt(br.readLine());
        double v = 0.0;
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i=0; i<n; i++) {
            v = v + (100-v)*Integer.parseInt(st.nextToken())/100;
            sb.append(v+"\n");
        }
        System.out.print(sb);
    } 
}