import java.util.*;

public class Bj_14581 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		String s = sc.next();
		
		sb.append(":fan::fan::fan:\n");
		sb.append(":fan::").append(s).append("::fan:\n");
		sb.append(":fan::fan::fan:");
		System.out.println(sb);
		sc.close();
	}
}