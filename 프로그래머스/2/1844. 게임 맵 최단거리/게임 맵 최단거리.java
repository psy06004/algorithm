import java.util.*;

class Solution {
    int[] dx = {0, 1, 0, -1};
    int[] dy = {-1, 0, 1, 0};
    
    public int solution(int[][] maps) {
        int n = maps.length;
        int m = maps[0].length;
        
        Queue<int[]> q = new ArrayDeque<>();
        q.offer(new int[]{0, 0, 1});
        maps[0][0] = -1;
        
        while (!q.isEmpty()) {
            int[] curr = q.poll();
            int currX = curr[0];
            int currY = curr[1];
            int currD = curr[2];
            
            if (currX == n-1 && currY == m-1) {
                return currD;
            }
            
            for (int i = 0; i < 4; i++) {
                int nextX = currX + dx[i];
                int nextY = currY + dy[i];
                
                if (nextX < 0 || nextX >= n || nextY < 0 || nextY >= m) continue;
                if (maps[nextX][nextY] != 1) continue;
                q.offer(new int[]{nextX, nextY, currD + 1});
                maps[nextX][nextY] = -1;
            }
        }
        return -1;
    }
}