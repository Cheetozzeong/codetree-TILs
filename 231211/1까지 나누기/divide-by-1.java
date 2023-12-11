import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int n = Integer.parseInt(br.readLine());
        int help = 1;

        while(true) {
            n = n/help;
            if(n<=1) break; // 1이하면 종료
            help++;
        }

        System.out.print(help);
    }
}