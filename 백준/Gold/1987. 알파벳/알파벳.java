import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	static int R, C, max;
	static int[] dx = {-1, 0, 1, 0};
	static int[] dy = {0, 1, 0, -1};
	static char[][] map;
	static boolean[] visited;
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		R = Integer.parseInt(st.nextToken());
		C = Integer.parseInt(st.nextToken());
		
		map = new char[R][C];
		for (int i = 0; i < R; i++) {
			String row = br.readLine();
			map[i] = row.toCharArray();
		}
		
		max = 0;
		visited = new boolean[26];
		visited[map[0][0] - 'A'] = true;
		dfs(0, 0, 1);
		
		System.out.println(max);
	}
	
	public static void dfs(int x, int y, int dist) {
		max = Math.max(dist, max);
		for (int i = 0; i < 4; i++) {
			int nx = x + dx[i];
			int ny = y + dy[i];
			
			if (nx < 0 || nx >= R || ny < 0 || ny >= C) continue;
			if (!visited[map[nx][ny] - 'A']) {
				visited[map[nx][ny] - 'A'] = true;
				dfs(nx, ny, dist + 1);
				visited[map[nx][ny] - 'A'] = false;
			}
		}
	}
}
