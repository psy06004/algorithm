import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    static class Point {
        int x, y;

        Point(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }

    static int n, m; // 세로, 가로 크기
    static int[][] paper; // 도화지 정보
    // 상, 하, 좌, 우 4방향 탐색을 위한 배열
    static int[] dx = {0, 0, 1, -1};
    static int[] dy = {1, -1, 0, 0};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        paper = new int[n][m];

        // 도화지 정보 입력받기
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < m; j++) {
                paper[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        int pictureCount = 0; // 그림의 개수
        int maxArea = 0;      // 가장 넓은 그림의 넓이

        // 도화지 전체를 순회 (i: 행, j: 열)
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                // 만약 해당 칸이 색칠되어 있다면(1)
                if (paper[i][j] == 1) {
                    pictureCount++; // 새로운 그림 발견! 개수 증가
                    int currentArea = bfs(i, j); // BFS를 호출해 현재 그림의 넓이를 구함
                    maxArea = Math.max(maxArea, currentArea); // 최대 넓이 갱신
                }
            }
        }

        // 결과 출력
        System.out.println(pictureCount);
        System.out.println(maxArea);
    }

    // BFS 메서드: (x, y)에서 시작해서 연결된 그림의 넓이를 반환
    public static int bfs(int x, int y) {
        Queue<Point> q = new LinkedList<>();
        
        // 시작점을 큐에 넣고 값을 2로 바꿔서 방문 처리
        q.add(new Point(x, y));
        paper[x][y] = 2;
        int area = 1; // 넓이는 1부터 시작 (시작점 포함)

        while (!q.isEmpty()) {
            Point current = q.poll();

            // 현재 위치에서 상하좌우 4방향 탐색
            for (int i = 0; i < 4; i++) {
                int nx = current.x + dx[i];
                int ny = current.y + dy[i];

                // 1. 다음 위치가 도화지 범위를 벗어나는지 확인
                if (nx < 0 || nx >= n || ny < 0 || ny >= m) {
                    continue;
                }
                
                // 2. 다음 위치가 색칠된 부분(1)인지 확인
                if (paper[nx][ny] == 1) {
                    paper[nx][ny] = 2; // 방문 처리
                    q.add(new Point(nx, ny)); // 큐에 추가
                    area++; // 넓이 증가
                }
            }
        }
        return area; // 탐색이 끝난 후, 계산된 넓이 반환
    }
}