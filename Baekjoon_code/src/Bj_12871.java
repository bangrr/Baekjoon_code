import java.io.*;

public class Bj_12871 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String s = br.readLine();
		String t = br.readLine();
		String fs = s.repeat(t.length()+1).substring(0, s.length() * t.length());
		String ft = t.repeat(s.length()+1).substring(0, s.length() * t.length());
		
		if (fs.equals(ft)) {
			System.out.print(1);
		} else {
			System.out.print(0);
		}
	}
}