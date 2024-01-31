import java.io.*;
import java.util.*;
 
public class Bj_30306 {
	// 입출력 메소드
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringBuilder sb = new StringBuilder();
	static StringTokenizer st;
 
	// main 메소드
	public static void main(String[] args) throws IOException {
		int n = Integer.parseInt(br.readLine());
		int[] aaa = new int[n];
        int[] bbb = new int[n];
        int ans = 0;
        st = new StringTokenizer(br.readLine());
        for (int i=0; i<n; i++) {
            aaa[i] = Integer.parseInt(st.nextToken());
        }
        st = new StringTokenizer(br.readLine());
        for (int i=0; i<n; i++) {
            bbb[i] = Integer.parseInt(st.nextToken());
        }
        for (int i=0; i<n; i++) {
            for (int j=0; j<n; j++) {
                if (aaa[i] > bbb[j]) {
                    ans++;
                } else if (aaa[i] < bbb[j]) {
                    ans--;
                }
            }
        }
		System.out.println(ans>0?"first":ans<0?"second":"tie");
	}
}