import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> mans = new ArrayList<>();

        while(true) {
            int man = Integer.parseInt(br.readLine());
            if(man < 30 && man >=20) {
                mans.add(man);        
            } else {
                break;
            }
        }
      
        double sum = 0;
        for(int i =0; i<mans.size(); i++) {
            sum += mans.get(i);
        }
    
        double answer = sum/mans.size();
        System.out.printf("%.2f",answer);
    }
}