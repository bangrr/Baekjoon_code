import java.io.*;

public class Bj_1212 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String s = br.readLine();
		String[] b = {"000", "001", "010", "011", "100", "101", "110", "111"};
		
		for (int i=0; i<s.length(); i++) {
			if (i == 0 && s.charAt(i) == '0') {
				bw.write("0");
			} else if (i == 0 && s.charAt(i) == '1') {
				bw.write("1");
			} else if (i == 0 && s.charAt(i) == '2') {
				bw.write("10");
			} else if (i == 0 && s.charAt(i) == '3') {
				bw.write("11");
			} else {
				if (s.charAt(i) == '0') bw.write(b[0]);
				if (s.charAt(i) == '1') bw.write(b[1]);
				if (s.charAt(i) == '2') bw.write(b[2]);
				if (s.charAt(i) == '3') bw.write(b[3]);
				if (s.charAt(i) == '4') bw.write(b[4]);
				if (s.charAt(i) == '5') bw.write(b[5]);
				if (s.charAt(i) == '6') bw.write(b[6]);
				if (s.charAt(i) == '7') bw.write(b[7]);
			}
		}
		bw.flush();
		bw.close();
	}
}