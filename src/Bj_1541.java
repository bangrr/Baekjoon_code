import java.io.*;

public class Bj_1541 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String s = br.readLine();
		
		String[] sArr = s.split("-");
		int answer = 0;
		
		for (int i=0; i<sArr.length; i++) {
			if (i == 0) {
				answer += tmpSum(sArr[i]);
			} else {
				answer -= tmpSum(sArr[i]);
			}
		}
		
		System.out.print(answer);
	}
	
	static int tmpSum(String tmp) {
		String[] tmpSplit = tmp.split("[+]");
		int tmpRt = 0;
		for (int i=0; i<tmpSplit.length; i++) {
			tmpRt += Integer.valueOf(tmpSplit[i]);
		}
		return tmpRt;
	}
}