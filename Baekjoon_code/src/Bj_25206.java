import java.io.*;
import java.util.*;

public class Bj_25206 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		double creditGrade = 0;
		double creditSum = 0;
		
		for (int i = 0; i < 20; i++) {
			st = new StringTokenizer(br.readLine());
			st.nextToken();
			double credit = Double.parseDouble(st.nextToken());
			String grade = st.nextToken();
			
			if (!"P".equals(grade)) {
				double score = gradeToScore(grade);
				creditGrade += (credit * score);
				creditSum += credit;
			}
		}
		System.out.print(creditGrade/creditSum);
	}
	
	static double gradeToScore(String grade) {
		double score = 0;
		
		switch (grade) {
			case "A+" :
				score = 4.5;
				break;
			case "A0" :
				score = 4.0;
				break;
			case "B+" :
				score = 3.5;
				break;
			case "B0" :
				score = 3.0;
				break;
			case "C+" :
				score = 2.5;
				break;
			case "C0" :
				score = 2.0;
				break;
			case "D+" :
				score = 1.5;
				break;
			case "D0" :
				score = 1.0;
				break;
		}
		return score;
	}
}