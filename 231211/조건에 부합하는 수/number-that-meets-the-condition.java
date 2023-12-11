import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int a = Integer.parseInt(br.readLine());

        for(int i = 1; i<=a; i++) {
            boolean flag = false;
            if((i%2 ==0 && i%4 != 0) || (((i/8)%2) == 0) || ((i%7)<4)) {
                flag = true;
            }

            if(!flag) System.out.print(i+" ");
        }
    }
}