import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int c = 0;

        for(int i=0; i<n; i++) {
            c = Integer.parseInt(br.readLine());
            if(c%2 == 1 && c%3 == 0){
                System.out.println(c);
            
            }
        }
    }
}