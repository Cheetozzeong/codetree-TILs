import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int a = Integer.parseInt(st.nextToken());

        if(a%3 == 0) System.out.println("YES"); else System.out.println("NO");

        if(a%5 == 0) System.out.println("YES"); else System.out.println("NO");

    }
}