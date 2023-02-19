import java.io.*;
import java.util.*;

public class Bj_16431 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		st = new StringTokenizer(br.readLine());
		int bR = Integer.parseInt(st.nextToken());
		int bC = Integer.parseInt(st.nextToken());
		
		st = new StringTokenizer(br.readLine());
		int dR = Integer.parseInt(st.nextToken());
		int dC = Integer.parseInt(st.nextToken());
		
		st = new StringTokenizer(br.readLine());
		int jR = Integer.parseInt(st.nextToken());
		int jC = Integer.parseInt(st.nextToken());
		
		int bjR = Math.abs(jR - bR);
		int bjC = Math.abs(jC - bC);		
		int djR = Math.abs(jR - dR);
		int djC = Math.abs(jC - dC);
		
		if (Math.max(bjR, bjC) < djR+djC) {
			System.out.print("bessie");
		} else if (Math.max(bjR, bjC) > djR+djC) {
			System.out.print("daisy");
		} else {
			System.out.print("tie");
		}
	}
}