import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();

        String[] split = str.split("-");
        int ans = 0;

        for (int i = 0; i < split.length; i++) {
            int num = 0;
            if (split[i].contains("+")) {
                String[] plus = split[i].split("\\+");
                for (int j = 0; j < plus.length; j++) {
                    num += Integer.parseInt(plus[j]);
                }
            }else {
                num = Integer.parseInt(split[i]);
            }
            if (i == 0) ans = num;
            else ans -= num;
        }

        System.out.println(ans);
    }
}
