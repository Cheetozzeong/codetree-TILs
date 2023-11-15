import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        Man man1 = new Man(Integer.parseInt(st.nextToken()),st.nextToken());
        
        st = new StringTokenizer(br.readLine());

        Man man2 = new Man(Integer.parseInt(st.nextToken()),st.nextToken());

        if((man1.getAge()>=19 && man1.getGender().equals("M")) || (man2.getAge()>=19 && man2.getGender().equals("M"))){
            System.out.println(1);
        } else {
            System.out.println(0);
        }
    }
}

class Man {

	private int age;
	private String gender;

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;

	}

	public Man(int age, String gender) {
		this.age = age;
		this.gender = gender;
	}
	
}