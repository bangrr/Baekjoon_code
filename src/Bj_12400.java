import java.io.*;

public class Bj_12400 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		String a = "yeqz ejp mysljylc kd kxveddknmc re jsicpdrysi rbcpc ypc rtcsra dkh wyfrepkym veddknkmkrkcd de kr kd eoya kw aej tysr re ujdr lkgc jv";
		String b = "aozq our language is impossible to understand there are twenty six factorial possibilities so it is okay if you want to just give up";
		char[] mapping = new char[26];
		
		for (int i=0; i<a.length(); i++) {
			if (b.charAt(i) != ' ') {
				mapping[a.charAt(i)-97] = b.charAt(i);
			}
		}
		
		int t = Integer.parseInt(br.readLine());
		for (int x=1; x<=t; x++) {
			String s = br.readLine();
			sb.append("Case #" + x + ": ");
			for (int i=0; i<s.length(); i++) {
				if (s.charAt(i) == ' ') {
					sb.append(" ");
				} else {
					sb.append(mapping[s.charAt(i)-97]);
				}
			}
			sb.append("\n");
		}
		System.out.print(sb);
	}
}