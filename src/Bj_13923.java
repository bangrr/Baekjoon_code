import java.io.*;
import java.util.*;
 
public class Bj_13923 {
	// 입출력 메소드
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringBuilder sb = new StringBuilder();
	static StringTokenizer st;
 
	// main 메소드
	public static void main(String[] args) throws IOException {
        String t;
        while ((t = br.readLine()) != null) {
		    int n = Integer.parseInt(t);
            int m = (n*n-n)/2;
            int[] ch = new int[26];
            int[] row = new int[26];
            int[] col = new int[26];
            for (int i=0; i<n; i++) {
                String s = br.readLine();
                for (int j=0; j<n; j++) {
                    ch[s.charAt(j)-'A']++;
                    row[s.charAt(j)-'A']+=i;
                    col[s.charAt(j)-'A']+=j;
                }
            }
            for (int i=0; i<26; i++) {
                //System.out.println(ch[i]+" "+row[i]+" "+col[i]);
                if (ch[i]==n-1) {
                    System.out.println((m-row[i]+1)+" "+(m-col[i]+1)+" "+(char)(i+'A'));
                    break;
                }
            }
        }
	}
}