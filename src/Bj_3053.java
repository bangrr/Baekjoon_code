import java.io.*;

public class Bj_3053 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int r = Integer.parseInt(br.readLine());
		
		System.out.println(r*r*Math.PI);
		System.out.println(r*r*2);
	}
}