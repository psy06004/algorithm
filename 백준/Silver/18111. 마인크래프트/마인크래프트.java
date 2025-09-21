
import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		int B = Integer.parseInt(st.nextToken());
		int[][] map = new int[N][M];
		int max = 0;
		int min = 256;
		int minTime = Integer.MAX_VALUE;
		int maxLand = 0;
		
		for (int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine());
			for (int j = 0; j < M; j++) {
				map[i][j] = Integer.parseInt(st.nextToken());
				max = Math.max(max, map[i][j]);
				min = Math.min(min, map[i][j]);
			}
		}
		
		for (int h = min; h <= max; h++) {
			int block = 0;
			int time = 0;
			for (int i = 0; i < N; i++) {
				for (int j = 0; j < M; j++) {
					if(map[i][j] > h) {
						block += map[i][j] - h;
						time += 2*(map[i][j] - h);
					}else if(map[i][j] < h) {
						block -= h - map[i][j];
						time += h - map[i][j];
					}
				}
			}
			if(B + block >= 0) {
				minTime = Math.min(minTime, time);
				if(minTime == time) {
					maxLand = Math.max(maxLand, h);
				}
			}
		}
		
		System.out.println(minTime + " " + maxLand);
	}
}
