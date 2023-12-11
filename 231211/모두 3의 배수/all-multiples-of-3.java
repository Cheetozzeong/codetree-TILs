import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        for(int i =0; i<5; i++) {
            if((Integer.parseInt(br.readLine())%3)!=0) {
                System.out.print(0);
                break;
            }
        }

        System.out.print(1); 
    }
}