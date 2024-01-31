import java.io.*;
import java.util.*;

public class Bj_27194 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int t = Integer.parseInt(st.nextToken());
		
        double m = Double.parseDouble(br.readLine());	
		
		st = new StringTokenizer(br.readLine());
		int x = Integer.parseInt(st.nextToken());
		int y = Integer.parseInt(st.nextToken());
		
		double end = m/60/x + (n-m)/60/y;
		System.out.print(Math.max(0,(int)Math.ceil(end-t)));
	}
}