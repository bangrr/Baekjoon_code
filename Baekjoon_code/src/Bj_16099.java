import java.io.*;
import java.util.*;

public class Bj_16099 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();
		
		int t = Integer.parseInt(br.readLine());
		
		while (t-- > 0) {
			st = new StringTokenizer(br.readLine());
			long lt = Long.parseLong(st.nextToken());
			long wt = Long.parseLong(st.nextToken());
			long le = Long.parseLong(st.nextToken());
			long we = Long.parseLong(st.nextToken());
			long tel = lt * wt;
			long eur = le * we;
			
			if (tel > eur) {
				sb.append("TelecomParisTech");
			} else if (tel < eur) {
				sb.append("Eurecom");
			} else {
				sb.append("Tie");
			}
			sb.append("\n");
		}
		System.out.print(sb);
	}
}