
import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int T = Integer.parseInt(br.readLine());
		
		for (int t = 0; t < T; t++) {
			String str = br.readLine();
			char[] c = str.toCharArray();
			
			int n = Integer.parseInt(br.readLine());
			
			Deque<String> d = new ArrayDeque<>();
			
			str = br.readLine();
			if(n != 0) {
				String str2 = str.substring(1, str.length()-1);
				String[] num = str2.split(",");
				
				for (int i = 0; i < num.length; i++) {
					d.add(num[i]);
				}
				
			}
			
			int count = 0;
			boolean isError = false;
			for (int i = 0; i < c.length; i++) {
				if(c[i] == 'R') {
					count++;
				}else if(c[i] == 'D') {
					if(d.size() == 0) {
						isError = true;
						break;
					}
					if(count%2 == 0) {
						d.removeFirst();
					}else {
						d.removeLast();
					}
				}
			}
			
			if(isError) {
				System.out.println("error");
			}else {
				int size = d.size();
				System.out.print("[");
				if(size == 0)
					System.out.print("]");
				else {
					if(count%2 == 0) {
						for (int i = 0; i < size-1; i++) {
							System.out.print(d.pollFirst() + ",");
						}
						System.out.print(d.poll() + "]");
					}else {
						for (int i = 0; i < size-1; i++) {
							System.out.print(d.pollLast() + ",");
						}
						System.out.print(d.poll() + "]");
					}
				}
				System.out.println();
			}
		}
	}
}
