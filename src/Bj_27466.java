import java.io.*;
import java.util.*;

public class Bj_27466 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		String s = br.readLine();
		String mo = "AEIOU";
		
		// N길이 문자열 S
		// S에서 0개 이상 지운 M길이 문자열 T
		// T는 맨 마지막이 A E I O U 로 끝나면 안됨
		// T는 뒤에서 2번째 3번째는 A 여야 함
		
		// 서브1 A가 없으면 무조건 NO
		// 서브2 N=M 이면 뒤에서 3개만 체크해서 조건확인 ...AAC
		// 'A', 
		
		if (s.charAt(n-2) == 'A' && s.charAt(n-3) == 'A'
			&& !mo.contains(String.valueOf(s.charAt(n-1)))) {
			System.out.println("YES");
			System.out.println(s);
		} else {
			System.out.println("NO");
		}
	}
}