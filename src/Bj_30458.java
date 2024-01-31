import java.io.*;
import java.util.*;
 
public class Bj_30458 {
	// 입출력 메소드
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringBuilder sb = new StringBuilder();
	static StringTokenizer st;
 
	// main 메소드
	public static void main(String[] args) throws IOException {
		int n = Integer.parseInt(br.readLine());
		String s = br.readLine();
        int[] arr = new int[27];
        int cen = 26;
		for (int i=0; i<n; i++) {
            if (n%2==1) cen = s.charAt(n/2)-'a';
			arr[s.charAt(i)-'a']++;
		}
        for (int i=0; i<26; i++) {
            if ((i!=cen && arr[i]%2!=0) || (i==cen && arr[i]%2==0)) {
                System.out.print("No");
                return;
            }
        }
		System.out.print("Yes");
	}
}