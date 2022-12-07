import java.io.*;

public class Bj_26209 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String s = br.readLine();
		if (s.contains("9")) {
			System.out.print("F");
		} else {
			System.out.print("S");
		}
	}
}