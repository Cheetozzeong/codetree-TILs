import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int a = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());

        int b = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());
        int d = Integer.parseInt(st.nextToken());
        int e = Integer.parseInt(st.nextToken());
        
        boolean flag = false;
        if(a>b) System.out.println(1); else System.out.println(0);
        if(a>c) System.out.println(1); else System.out.println(0);
        if(a>d) System.out.println(1); else System.out.println(0);
        if(a>e) System.out.println(1); else System.out.println(0);
    }
}