import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int cnt = 0;

        while(true) {
            n = (n%2 ==0) ? n*3+1 : n*2+2;
            cnt++;
            if(n>=1000) break;
        }

        System.out.print(cnt);
    }
}