import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Bj_10828 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Stk10828 stk = new Stk10828();
		int n = Integer.parseInt(br.readLine());
		
		for(int i=0; i<n; i++) {
			String str = br.readLine();
			String arr[] = str.split(" ");
			switch (arr[0]) {
			case "push" :
				stk.push(Integer.parseInt(arr[1]));
				break;
			case "pop" :
				stk.pop();
				break;
			case "size" :
				stk.size();
				break;
			case "empty" :
				stk.empty();
				break;
			case "top" :
				stk.top();
				break;
			}
		}
	}
}

class Stk10828 {
	private int[] stk;
	private int top;
	
	public Stk10828() {
		top = -1;
		stk = new int[10000];
	}
	
	public void push(int x) {
		stk[++top] = x;
	}

	public void pop() {
		if (top>-1) {
			System.out.println(stk[top--]);
		} else {
			System.out.println(top);
		}
	}
	
	public void size() {
		System.out.println((top+1));
	}
	
	public void empty() {
		if(top==-1) {
			System.out.println("1");
		} else {
			System.out.println("0");
		}
	}
	
	public void top() {
		if(top>-1) {
			System.out.println(stk[top]);
		} else if (top==-1) {
			System.out.println("-1");
		}
	}
}