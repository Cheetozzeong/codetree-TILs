import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int b = Integer.parseInt(st.nextToken());
        int a = Integer.parseInt(st.nextToken());

        for(int i = b; i>=a; i--){
            if(i%2 == 1) System.out.print(i+" ");
        }
    }
}