import java.io.*;
 
public class Bj_9659 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
 
		long n = Long.parseLong(br.readLine());
		if (n % 2 == 1) {
			System.out.print("SK");
		} else {
			System.out.print("CY");
		}
	}
}