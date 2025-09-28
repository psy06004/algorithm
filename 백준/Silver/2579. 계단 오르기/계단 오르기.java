import java.io.*;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int[] stair = new int[N+1];
		int[] result = new int[N+1];
		
		stair[1] = Integer.parseInt(br.readLine());
		result[1] = stair[1];
		
		if(N > 1) {
			stair[2] = Integer.parseInt(br.readLine());
			result[2] = stair[1] + stair[2];
		}
		
		for (int i = 3; i <= N; i++) {
			stair[i] = Integer.parseInt(br.readLine());
			int case1 = result[i-2] + stair[i];
			int case2 = result[i-3] + stair[i-1] + stair[i];
			result[i] = Math.max(case1, case2);
		}
		
		System.out.println(result[N]);
	}
}
