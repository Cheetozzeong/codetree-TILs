import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int b = Integer.parseInt(st.nextToken());
        int a = Integer.parseInt(st.nextToken());

        while(true){
            if(a>b) break;
            else {
                if(b%2 == 0) System.out.print(b+" ");
            }
            b--;
        }
    }
}