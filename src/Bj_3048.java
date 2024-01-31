import java.io.*;
import java.util.*;
 
public class Bj_3048 {
	static class Ant {
		char ch;
		int grp;
		
		public Ant(char ch, int grp) {
			this.ch = ch;
			this.grp = grp;
		}
	}
	// 입출력 메소드
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringBuilder sb = new StringBuilder();
	static StringTokenizer st;
 
	// main 메소드
	public static void main(String[] args) throws IOException {
		st = new StringTokenizer(br.readLine());
		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		Ant[] arr = new Ant[a+b];
		String stra = br.readLine();
		for (int i=a-1; i>=0; i--) {
			arr[a-1-i] = new Ant(stra.charAt(i), 0);
		}
		String strb = br.readLine();
		for (int i=0; i<b; i++) {
			arr[a+i] = new Ant(strb.charAt(i), 1);
		}
		int t = Integer.parseInt(br.readLine());
		
		for (int k=0; k<Math.min(t,  a+b-1); k++) {
			for (int i=0; i<a+b-1; i++) {
				if (arr[i].grp == 0 && arr[i+1].grp == 1) {
					char tmp = arr[i].ch;
					arr[i].ch = arr[i+1].ch;
					arr[i+1].ch = tmp;
					arr[i].grp++;
					arr[i+1].grp--;
					i++;
				}
			}
			
		}
		for (int j=0; j<a+b; j++) {
			sb.append(arr[j].ch);
		}
		System.out.print(sb);
	}
}