import java.util.*;

public class Bj_25191 {
	public static void main(String[] args){
		try (Scanner sc = new Scanner(System.in)) {
			System.out.print(Math.min(sc.nextInt(), sc.nextInt()/2+sc.nextInt()));
		}
	}
}