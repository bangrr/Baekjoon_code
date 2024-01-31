import java.io.*;
import java.util.*;

public class Bj_31097 {
	// 입출력 메소드
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringBuilder sb = new StringBuilder();
	static StringTokenizer st;
	
	// main 메소드
	public static void main(String[] args) throws IOException {
		String[] s = br.readLine().split("-");
		int month = Integer.parseInt(s[1]);
		int day = Integer.parseInt(s[2]);
		
		if (month <= 1 && day <= 19) {
			System.out.println("Capricorn");
		} else if (month == 1 || month <= 2 && day <= 18) {
			System.out.println("Aquarius");
		}  else if (month == 2 || month <= 3 && day <= 20) {
			System.out.println("Pisces");
		} else if (month == 3 || month <= 4 && day <= 19) {
			System.out.println("Aries");
		} else if (month == 4 || month <= 5 && day <= 20) {
			System.out.println("Taurus");
		} else if (month == 5 || month <= 6 && day <= 20) {
			System.out.println("Gemini");
		} else if (month == 6 || month <= 7 && day <= 22) {
			System.out.println("Cancer");
		} else if (month == 7 || month <= 8 && day <= 22) {
			System.out.println("Leo");
		} else if (month == 8 || month <= 9 && day <= 22) {
			System.out.println("Virgo");
		} else if (month == 9 || month <= 10 && day <= 22) {
			System.out.println("Libra");
		} else if (month == 10 || month <= 11 && day <= 22) {
			System.out.println("Scorpio");
		} else if (month == 11 || month <= 12 && day <= 21) {
			System.out.println("Sagittarius");
		} else {
			System.out.println("Capricorn");
		}
	}
}