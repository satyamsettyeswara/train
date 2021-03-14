import java.util.*;
public class Main{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		String s = "Pirate";
		print(s);
	}
	static void print(String s){
		for(int i=0;i<s.length();i++){
			System.out.print(s.charAt(i)+" ");
		}
	}	
}

