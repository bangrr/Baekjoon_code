import java.io.*;
import java.util.*;

public class Bj_11723 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		Set11723 set = new Set11723();
		
		int n = Integer.parseInt(br.readLine());
		for(int i=0; i<n; i++) {
			String str = br.readLine();
			String arr[] = str.split(" ");
			switch (arr[0]) {
			case "add" :
				set.add(Integer.parseInt(arr[1]));
				break;
			case "remove" :
				set.remove(Integer.parseInt(arr[1]));
				break;
			case "check" :
				sb.append(set.check(Integer.parseInt(arr[1]))).append("\n");
				break;
			case "toggle" :
				set.toggle(Integer.parseInt(arr[1]));
				break;
			case "all" :
				set.all();
				break;
			case "empty" :
				set.empty();
				break;
			}
		}
		System.out.print(sb);
	}
}

class Set11723 {
	private ArrayList<Integer> set;
	
	public Set11723() {
		set = new ArrayList<>();
	}
	
	public void add(int x) {
		if (check(x) == 0) {
			set.add(x);			
		}
	}
	
	public void remove(int x) {
		if (check(x) == 1) {
			set.remove(set.indexOf(x));
		}
	}
	
	public int check(int x) {
		return set.contains(x) ? 1 : 0;
	}
	
	public void toggle(int x) {
		if (check(x) == 0) {
			set.add(x);			
		} else if (check(x) == 1) {
			set.remove(set.indexOf(x));
		}
	}
	
	public void all() {
		for (int i=0; i<20; i++) {
			if (i < set.size()) {
				set.set(i, i+1);
			} else {
				set.add(i+1);
			}
		}
	}
	
	public void empty() {
		set.clear();
	}
}