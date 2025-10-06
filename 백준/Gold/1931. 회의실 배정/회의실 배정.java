import java.io.*;
import java.util.*;

public class Main {
	static class Meeting implements Comparable<Meeting>{
		int start, end;

		public Meeting(int start, int end) {
			this.start = start;
			this.end = end;
		}

		@Override
		public int compareTo(Meeting o) {
			//끝나는 시간이 다르면 끝나는 시간 기준으로 비교
			if(this.end != o.end)
				return this.end - o.end;
			//끝나는 시간이 같으면 시작 시간으로 비교
			return this.start - o.start;
		}
	}
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		List<Meeting> meeting = new ArrayList<>();
		int cnt = 0;
		int endTime = 0;
		
		for (int i = 0; i < N; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int start = Integer.parseInt(st.nextToken());
			int end = Integer.parseInt(st.nextToken());
			
			meeting.add(new Meeting(start, end));
		}
		
		Collections.sort(meeting);
		
		for (int i = 0; i < N; i++) {
			Meeting curr = meeting.get(i);
			if(curr.start >= endTime) {
				cnt++;
				endTime = curr.end;
			}
		}
		System.out.println(cnt);
	}
}
