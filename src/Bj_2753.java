import java.util.Scanner;

public class Bj_2753 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int year = sc.nextInt();
		sc.close();
		
		if (year%4 == 0 && year%100 != 0 || year%400 ==0)
			System.out.println("1");	// 윤년이면 1
		else
			System.out.println("0");	// 아니면 0
	}
}