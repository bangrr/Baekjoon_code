import java.util.Scanner;

public class Bj_2908 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		sc.close();
		
		String str1 = Integer.toString(a);
		str1 = str1.charAt(2) + "" + str1.charAt(1) + "" + str1.charAt(0);
		String str2 = Integer.toString(b);
		str2 = str2.charAt(2) + "" + str2.charAt(1) + "" + str2.charAt(0);
		
		if (Integer.valueOf(str1) > Integer.valueOf(str2)) {
			System.out.println(str1);
		} else {
			System.out.println(str2);
		}
	}
}
