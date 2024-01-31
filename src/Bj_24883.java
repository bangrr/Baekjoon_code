import java.io.*;

public class Bj_24883 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		char c = br.readLine().charAt(0);
		
		if (c == 'N' || c == 'n') {
			System.out.print("Naver D2");
		} else {
			System.out.print("Naver Whale");
		}
	}
}