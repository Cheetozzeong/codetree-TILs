import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        if(n < 5){
            System.out.println(n*n);
            System.out.print("tiny"); 
            return;
        } else {
            System.out.print(n*n);
        }

    }
}