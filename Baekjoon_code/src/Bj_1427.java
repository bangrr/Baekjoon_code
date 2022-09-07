import java.io.*;
import java.util.*;
 
public class Bj_1427 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
 
        String s = br.readLine();
        int[] a = new int[s.length()];
        for (int i=0; i<s.length(); i++) {
        	a[i] = s.charAt(i) - '0';
        }
        Arrays.sort(a);
        for (int i=s.length()-1; i>=0; i--) {
        	sb.append(a[i]);
        }
        System.out.println(sb);
    }
}