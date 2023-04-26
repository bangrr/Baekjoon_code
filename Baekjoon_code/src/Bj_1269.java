import java.io.*;
import java.util.*;

public class Bj_1269 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		Set<Integer> setA = new HashSet<>();
		Set<Integer> setB = new HashSet<>();
		
		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		
		st = new StringTokenizer(br.readLine());
		for (int i=0; i<a; i++) {
			setA.add(Integer.parseInt(st.nextToken()));
		}
		
		st = new StringTokenizer(br.readLine());
		for (int i=0; i<b; i++) {
			setB.add(Integer.parseInt(st.nextToken()));
		}
		
		Object[] arr;
		int cnt = 0;
		if (a > b) {
			arr = setB.toArray();
			for (int i=0; i<arr.length; i++) {
				if (setA.contains((Integer)arr[i])) {
					cnt++;
				}
			}
		} else {
			arr = setA.toArray();
			for (int i=0; i<arr.length; i++) {
				if (setB.contains((Integer)arr[i])) {
					cnt++;
				}
			}
		}
		System.out.print(a+b-cnt*2);
	}
}