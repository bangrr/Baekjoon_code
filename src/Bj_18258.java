import java.io.*;

public class Bj_18258 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		Queue18258 queue = new Queue18258();
		int n = Integer.parseInt(br.readLine());
		
		for (int i=0; i<n; i++) {
			String str = br.readLine();
			String arr[] = str.split(" ");
			switch (arr[0]) {
			case "push" :
				queue.push(Integer.parseInt(arr[1]));
				break;
			case "pop" :
				sb.append(queue.pop()).append("\n");
				break;
			case "size" :
				sb.append(queue.size()).append("\n");
				break;
			case "empty" :
				sb.append(queue.isEmpty()).append("\n");
				break;
			case "front" :
				sb.append(queue.front()).append("\n");
				break;
			case "back" :
				sb.append(queue.back()).append("\n");
				break;
			}
		}
		System.out.print(sb);
	}
}

class Queue18258 {
	private int MAX = 2000000;
	private int front;
	private int rear;
	private int[] queue;
	
	public Queue18258() {
		front = rear = 0;
		queue = new int[MAX];
	}
	
	public void push(int value) {
		queue[rear++] = value;
	}
	
	public int pop() {
		if (isEmpty() == 1) {
			return -1;
		}
		return queue[front++];
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
		return queue[front];
	}
	
	public int back() {
		if (isEmpty() == 1) {
			return -1;
		}
		return queue[rear-1];
	}
}