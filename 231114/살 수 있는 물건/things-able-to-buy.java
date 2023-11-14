import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());

        if(n>=3000){
            System.out.println("book");
        } else if (1000<=n& n<3000) {
            System.out.println("mask");
        } else {
            System.out.println("no");
        }
    }
}