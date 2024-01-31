import java.io.*;

public class Bj_27930 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String k = "KOREA";
		int ki = 0;
		String y = "YONSEI";
		int yi = 0;
		
		String s = br.readLine();
		
		for (int i=0; i<s.length(); i++) {
			if (s.charAt(i) == 'O' || s.charAt(i) == 'E') {
				if (k.charAt(ki) == s.charAt(i)) {
					ki++;
				}
				if (y.charAt(yi) == s.charAt(i)){
					yi++;
				}
			} else if (k.charAt(ki) == s.charAt(i)) {
				ki++;
				if (ki == k.length()) {
					System.out.print(k);
					break;
				}
			} else if (y.charAt(yi) == s.charAt(i)){
				yi++;
				if (yi == y.length()) {
					System.out.print(y);
					break;
				}
			}
		}
	}
}