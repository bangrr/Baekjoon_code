import java.io.*;
import java.util.*;

public class Bj_5443 {
	// 입출력 메소드
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringBuilder sb = new StringBuilder();
	static StringTokenizer st;
	
	// 변수선언부
	static int[] arr, num;
	
	// main 메소드
	public static void main(String[] args) throws IOException {
		input();
		System.out.print(sb);
	}
	
	// 입력부
	static void input() throws IOException {
		int n = Integer.parseInt(br.readLine());
		while (n-- > 0) {
			st = new StringTokenizer(br.readLine());
			arr = new int[4];
			arr[0] = Integer.parseInt(st.nextToken());
			arr[1] = Integer.parseInt(st.nextToken());
			arr[2] = Integer.parseInt(st.nextToken());
			arr[3] = arr[2] % 100;
			arr[2] = arr[2] / 100;
			
			if (okSum() && checkAllDigitDiff()) {
				sb.append("yes").append("\n");
			} else {
				sb.append("no").append("\n");
			}
		}
	}
	
	private static boolean okSum() {
		if (arr[0] + arr[1] == arr[2] + arr[3]) {
			return true;
		}
		if (arr[0] + arr[2] == arr[1] + arr[3]) {
			return true;
		}
		if (arr[0] + arr[3] == arr[1] + arr[2]) {
			return true;
		}
		if (arr[0] == arr[1] + arr[2] + arr[3]) {
			return true;
		}
		if (arr[1] == arr[0] + arr[2] + arr[3]) {
			return true;
		}
		if (arr[2] == arr[1] + arr[0] + arr[3]) {
			return true;
		}
		if (arr[3] == arr[1] + arr[2] + arr[0]) {
			return true;
		}
		return false;
	}

	// 문제해결
	static boolean checkAllDigitDiff() {
		num = new int[10];
		for (int i=0; i<4; i++) {
			if (arr[i] > 9) {
				num[arr[i]/10]++;
			}
			if (arr[i] < 10 && i == 3) {
				num[0]++;
			}
			num[arr[i]%10]++;
		}
		
		int tmp = 0;
		for (int i=0; i<num.length; i++) {
			if (num[i] > 0) {
				if (tmp != num[i] && tmp > 0) {
					return false;
				}
				tmp = num[i];
			}
		}
		return true;
	}
}