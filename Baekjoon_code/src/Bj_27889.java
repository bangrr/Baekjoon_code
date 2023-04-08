import java.util.*;
 
public class Bj_27889 {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
        String s = sc.next();
        if (s.charAt(0) == 'N') {
            System.out.print("North London Collegiate School");
        } else if (s.charAt(0) == 'B') {
            System.out.print("Branksome Hall Asia");
        } else if (s.charAt(0) == 'K') {
            System.out.print("Korea International School");
        } else if (s.charAt(0) == 'S') {
            System.out.print("St. Johnsbury Academy");
        }
        sc.close();
	}
}