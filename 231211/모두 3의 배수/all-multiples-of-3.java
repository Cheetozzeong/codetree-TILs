import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        boolean flag = false;
        for(int i =0; i<5; i++) {
            if((Integer.parseInt(br.readLine())%3)!=0) {
                flag = false;
                break;
            } else flag=true;
        }

        if(flag) System.out.print(1);
        else System.out.print(0); 
    }
}