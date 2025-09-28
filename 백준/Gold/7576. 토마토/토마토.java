import java.io.*;
import java.util.*;

public class Main {
	static int N, M, day, empty;
	static int[][] box, result;
	static int[] dr = {-1,1,0,0};
	static int[] dc = {0,0,-1,1};
	static Queue<Point> q;
	
	static class Point{
		int x, y;

		public Point(int x, int y) {
			this.x = x;
			this.y = y;
		}
	}
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		M = Integer.parseInt(st.nextToken());
		N = Integer.parseInt(st.nextToken());
		box = new int[N][M];
		result = new int[N][M];
		q = new ArrayDeque<>();
		empty = 0;
		day = 0;
		boolean notRipe = false;
		
		for (int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine());
			for (int j = 0; j < M; j++) {
				box[i][j] = Integer.parseInt(st.nextToken());
				if(box[i][j] == 1) {
					q.add(new Point(i, j));
					result[i][j] = 1;
				}
				if(box[i][j] == -1)
					empty++;
			}
		}
		
		if(q.isEmpty())
			System.out.println(-1);
		else if(q.size() == N*M - empty)
			System.out.println(0);
		else {
			bfs();
			
			for (int i = 0; i < N; i++) {
				for (int j = 0; j < M; j++) {
					if(result[i][j] == 0 && box[i][j] == 0)
						notRipe = true;
					day = Math.max(day, result[i][j]);
				}
			}
			
			if(notRipe)
				System.out.println(-1);
			else
				System.out.println(day-1);
		}
	}
	
	static void bfs() {
		while(!q.isEmpty()) {
			Point curr = q.poll();
			for (int i = 0; i < dr.length; i++) {
				int nr = curr.x + dr[i];
				int nc = curr.y + dc[i];
				
				if(nr < 0 || nc < 0 || nr >= N || nc >= M) continue;
				if(box[nr][nc] == -1 || box[nr][nc] == 1) continue;
				if(result[nr][nc] == 0) {
					result[nr][nc] = result[curr.x][curr.y]+1;
					q.add(new Point(nr, nc));
				}
			}
		}
	}
}
