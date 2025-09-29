import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int[] sensor = new int[N];
		
		int K = Integer.parseInt(br.readLine());
		
		if(K >= N) {
			System.out.println(0);
			return;
		}
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		for (int i = 0; i < N; i++) {
			sensor[i] = Integer.parseInt(st.nextToken());
		}
		
		Arrays.sort(sensor);
		
		int[] minus = new int[N-1];
		
		for (int i = 0; i < N-1; i++) {
			minus[i] = sensor[i+1] - sensor[i];
		}
		
		Arrays.sort(minus);
		int maxGap = 0;
		
		for (int i = 0; i < K-1; i++) {
			maxGap += minus[N-2-i];
		}
		
		int result = (sensor[N-1] - sensor[0]) - maxGap;
		
		System.out.println(result);
	}
}
