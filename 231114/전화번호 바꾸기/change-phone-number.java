import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(),"-");
        String First = st.nextToken();
        String x = st.nextToken();
        String y = st.nextToken();

        System.out.print(First+"-"+y+"-"+x);
        // 여기에 코드를 작성해주세요.
    }
}