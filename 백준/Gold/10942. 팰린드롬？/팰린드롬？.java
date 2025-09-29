import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int[] nums = new int[N+1];
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		for (int i = 1; i <= N; i++) {
			nums[i] = Integer.parseInt(st.nextToken());
		}
		
		int M = Integer.parseInt(br.readLine());
		boolean dp[][] = new boolean[N+1][N+1];
		
		for (int i = 1; i <= N; i++) {
			dp[i][i] = true;
		}
		
		for (int i = 1; i <= N-1; i++) {
			if(nums[i] == nums[i+1])
				dp[i][i+1] = true;
		}
		
		for (int i = 3; i <= N; i++) {
			for (int j = 1; j <= N-i+1; j++) {
				int k = i + j - 1;
				if(nums[j] == nums[k] && dp[j+1][k-1])
					dp[j][k] = true;
			}
		}
		
		StringBuilder sb = new StringBuilder();
		
		for (int i = 0; i < M; i++) {
			st = new StringTokenizer(br.readLine());
			int S = Integer.parseInt(st.nextToken());
			int E = Integer.parseInt(st.nextToken());
			
			if(dp[S][E])
				sb.append(1).append("\n");
			else
				sb.append(0).append("\n");
		}
		
		System.out.println(sb);
	}
}
