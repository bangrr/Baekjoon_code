import java.io.*;

public class Bj_10866 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		Deque10866 deque = new Deque10866();
		int n = Integer.parseInt(br.readLine());
		
		for (int i=0; i<n; i++) {
			String str = br.readLine();
			String arr[] = str.split(" ");
			switch (arr[0]) {
			case "push_front" :
				deque.push_front(Integer.parseInt(arr[1]));
				break;
			case "push_back" :
				deque.push_back(Integer.parseInt(arr[1]));
				break;
			case "pop_front" :
				sb.append(deque.pop_front()).append("\n");
				break;
			case "pop_back" :
				sb.append(deque.pop_back()).append("\n");
				break;
			case "size" :
				sb.append(deque.size()).append("\n");
				break;
			case "empty" :
				sb.append(deque.isEmpty()).append("\n");
				break;
			case "front" :
				sb.append(deque.front()).append("\n");
				break;
			case "back" :
				sb.append(deque.back()).append("\n");
				break;
			}
		}
		System.out.print(sb);
	}
}

class Deque10866 {
	private int MAX = 10000;
	private int[] deque;
	private int front;
	private int rear;
	
	public Deque10866() {
		front = rear = MAX;
		deque = new int[MAX*2+1];
	}
	
	public void push_front(int value) {
		deque[--front] = value;
	}
	
	public void push_back(int value) {
		deque[rear++] = value;
	}
	
	public int pop_front() {
		if (isEmpty() == 1) {
			return -1; 
		}
		return deque[front++];
	}
	
	public int pop_back() {
		if (isEmpty() == 1) {
			return -1; 
		}
		return deque[--rear];
	}
	
	public int size() {
		return rear - front;
	}
	
	public int isEmpty() {
		if (front == rear) {
			return 1;
		}
		return 0;
	}
	
	public int front() {
		if (isEmpty() == 1) {
			return -1; 
		}
		return deque[front];
	}
	
	public int back() {
		if (isEmpty() == 1) {
			return -1;
		}
		return deque[rear-1];
	}
}