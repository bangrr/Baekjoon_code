import java.util.*;

public class Bj_4999 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String j = sc.next();
		String d = sc.next();
		String r;
		
		r = j.length() < d.length() ? "no" : "go";
		System.out.println(r);
		sc.close();
	}
}