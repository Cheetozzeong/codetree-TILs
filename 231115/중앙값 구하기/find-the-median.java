import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());

        if(a<b && a<c){
            if(b<c){
                System.out.println(b);
            } else {
                System.out.println(c);
            }
        } else if(b<a && b<c){
            if(a<c){
                System.out.println(a);
            } else {
                System.out.println(c);
            }
        } else if(c<a && c<b){
            if(a<b){
                System.out.println(a);
            } else {
                System.out.println(b);
            }
        }
    }
}