import java.util.*;

public class Bj_17478 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		asd(n);
		sc.close();
	}
	
	static void asd(int n) {
		System.out.println("��� �� ��ǻ�Ͱ��а� �л��� ������ �������� ã�ư� ������.");
		for (int i=0; i<n; i++) {
			System.out.println("____".repeat(i)+"\"����Լ��� ������?\"");
			System.out.println("____".repeat(i)+"\"�� ����. �������� �� �� ����⿡ �̼��� ��� ������ ����� ������ �־���.");
			System.out.println("____".repeat(i)+"���� ������� ��� �� ���ο��� ������ ������ �߰�, ��� �����Ӱ� ����� �־���.");
			System.out.println("____".repeat(i)+"���� ���� ��κ� �ǾҴٰ� �ϳ�. �׷��� ��� ��, �� ���ο��� �� ���� ã�ƿͼ� ������.\"");
		}
		System.out.println("____".repeat(n)+"\"����Լ��� ������?\"");
		System.out.println("____".repeat(n)+"\"����Լ��� �ڱ� �ڽ��� ȣ���ϴ� �Լ����\"");
		System.out.println("____".repeat(n)+"��� �亯�Ͽ���.");
		for (int i=n-1; i>=0; i--) {
			System.out.println("____".repeat(i)+"��� �亯�Ͽ���.");
		}
	}
}