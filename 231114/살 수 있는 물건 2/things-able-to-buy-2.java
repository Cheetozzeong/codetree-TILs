import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());


        if(n>=3000){
            System.out.print("book");
        } else if (n>=1000 && n<3000) {
            System.out.print("mask");
        } else if (n>=500 && n<1000) {
            System.out.print("pen");
        } else {
            System.out.print("no");
        }
    }
}