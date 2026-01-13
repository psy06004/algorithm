import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Main {
    static class Point {
        int x;
        int y;
        Point(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        List<Point> times = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            times.add(new Point(Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken())));
        }

        times.sort((o1, o2) -> {
            if (o1.y == o2.y) {
                return o1.x - o2.x;
            }else {
                return o1.y - o2.y;
            }
        });

        int endTime = times.get(0).y;
        int result = 1;

        for (int i = 1; i < N; i++) {
            if (times.get(i).x >= endTime) {
                endTime = times.get(i).y;
                result++;
            }
        }

        System.out.println(result);
    }
}
