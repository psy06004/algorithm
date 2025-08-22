import java.util.*;
import java.io.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = Integer.parseInt(sc.nextLine());
		
		Deque<Integer> q = new ArrayDeque<>();
		
		for (int i = 0; i < N; i++) {
			String[] cmd = sc.nextLine().split(" ");
			
			switch (cmd[0]) {
			case "push": 
				q.add(Integer.parseInt(cmd[1]));
				break;
				
			case "pop": 
				System.out.println(q.isEmpty() ? -1 : q.poll());
				break;
				
			case "size": 
				System.out.println(q.size());
				break;
				
			case "empty": 
				System.out.println(q.isEmpty() ?  1 : 0);
				break;
				
			case "front": 
				System.out.println(q.isEmpty() ? -1 : q.peekFirst());
				break;
			case "back": 
				System.out.println(q.isEmpty() ? -1 : q.peekLast());
				break;
				
		
			}
		}
	}

}
