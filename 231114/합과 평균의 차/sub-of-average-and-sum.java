import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());

        int sum = a+b+c;
        int avg = sum/3;

        System.out.println(sum);
        System.out.println(avg);
        System.out.print(sum-avg);
        // 여기에 코드를 작성해주세요.
    }
}