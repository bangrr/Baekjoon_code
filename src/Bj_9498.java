import java.util.Scanner;

public class Bj_9498 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int score = sc.nextInt();
		sc.close();
		
		if ( score < 60) {
			System.out.println("F");
		} else if ( score < 70 ) {
			System.out.println("D");
		} else if ( score < 80 ) {
			System.out.println("C");
		} else if ( score < 90 ) {
			System.out.println("B");
		} else if ( score <= 100) {
			System.out.println("A");
		} else {
			System.out.println("input range error");
		}
	}
}

//import java.util.Scanner;
//
//public class Baekjoon_9498 {
//   public static void main(String[] args) {
//      Scanner sc = new Scanner(System.in);
//      int a = sc.nextInt();
//      sc.close();
//      System.out.print("FFFFFFDCBAA".charAt(a / 10));
//   }
//}
