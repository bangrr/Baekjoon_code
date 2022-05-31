import java.util.Scanner;

public class Bj_1546 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		double[] score = new double[n];
		
		double max = 0;
		double sum = 0;
		
		for (int i=0; i<n; i++) {
			score[i] = sc.nextInt();
			max = max < score[i] ? score[i] : max;
		}
		
		for (int j=0; j<n; j++) {
			score[j] = score[j]/max*100;
			sum += score[j];
		}
		
		sc.close();
		System.out.println(sum/n);
	}
}
