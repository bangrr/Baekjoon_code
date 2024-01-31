import java.util.*;

public class Bj_24083 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = (a+b)%12;
		if (c==0) c=12;
		System.out.print(c);
		sc.close();
	}
}