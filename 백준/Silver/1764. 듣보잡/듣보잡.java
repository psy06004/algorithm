import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken()); 
		int M = Integer.parseInt(st.nextToken());
		
		Set<String> hear = new HashSet<>();
		List<String> hearSee = new ArrayList<>();
		
		for (int i = 0; i < M; i++) {
			hear.add(br.readLine());
		}
		
		for (int i = 0; i < N; i++) {
			String name = br.readLine();
			if(hear.contains(name)) {
				hearSee.add(name);
			}
		}
		
		Collections.sort(hearSee);
		
		StringBuilder sb = new StringBuilder();
		
		sb.append(hearSee.size()).append("\n");
		for (int i = 0; i < hearSee.size(); i++) {
			sb.append(hearSee.get(i)).append("\n");
		}
		
		System.out.println(sb);
	}
}
