import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int cnt = 0;
        for(int i = 0; i<5; i++) {
            int a = Integer.parseInt(br.readLine());
            if(a%2 ==0) cnt++;
        }
        System.out.println(cnt);
    }
}