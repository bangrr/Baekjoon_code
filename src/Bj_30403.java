import java.io.*;
import java.util.*;
 
public class Bj_30403 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringBuilder sb = new StringBuilder();
	static StringTokenizer st;
 
	public static void main(String[] args) throws IOException {
		int n = Integer.parseInt(br.readLine());
        String s = br.readLine();
        Set<Character> lower = new HashSet<>();
        Set<Character> upper = new HashSet<>();
        for (int i=0; i<n; i++) {
            char c = s.charAt(i);
            String cs = String.valueOf(c);
            if ("roygbiv".contains(cs)) {
                lower.add(c);
            } else if ("ROYGBIV".contains(cs)) {
                upper.add(c);
            }
        }
 
        if (lower.size()==7 && upper.size()!=7) {
            System.out.print("yes");
        } else if (lower.size()!=7 && upper.size()==7) {
            System.out.print("YES");
        } else if (lower.size()==7 && upper.size()==7) {
            System.out.print("YeS");
        } else {
            System.out.print("NO!");
        }
	}
}