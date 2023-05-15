import java.io.*;
import java.util.*;

public class Bj_10420 {
	// 입출력 메소드
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringBuilder sb = new StringBuilder();
	static StringTokenizer st;
	
	// 변수선언부
	static int n;
	static int year = 2014;
	static int month = 4;
	static int day = 1;
	
	// main 메소드
	public static void main(String[] args) throws IOException {
		input();
		solve();
		print();
	}

	// 입력부
	static void input() throws IOException {
		n = Integer.parseInt(br.readLine());
	}
	
	// 문제해결
	static void solve() {
		int[] lastOfMonth = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		
		while (n-- > 0) {
			day++;
			
			if (year % 4 == 0) {
				lastOfMonth[2] = 29;
			} else {
				lastOfMonth[2] = 28;
			}
			
			if (day > lastOfMonth[month]) {
				month++;
				day = 1;
			}
			if (month > 12) {
				year++;
				month = 1;
			}
		}
	}
	
	// 출력부
	private static void print() {
		sb.append(year).append("-");
		if (month < 10) {
			sb.append("0");
		}
		sb.append(month).append("-");
		if (day < 10) {
			sb.append("0");
		}
		sb.append(day);
		System.out.print(sb.toString());
	}
}