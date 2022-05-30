import java.util.Scanner;

public class Bj_11720 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		String str = sc.next();
		sc.close();
		
		int sum=0;
		for (int i=0; i<a; i++) {
			sum = sum + str.charAt(i)-48;
		}
		System.out.println(sum);
	}
}