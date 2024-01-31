import java.io.*;
 
public class Bj_9656 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
 
		int n = Integer.parseInt(br.readLine());
		if ((n-1) % 2 == 1) {
			System.out.print("SK");
		} else {
			System.out.print("CY");
		}
	}
}