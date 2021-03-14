import java.util.*;
public class Main{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		String s = "hello";
		print(s);
		reverse(s);			
		caps(s);
	}
	static void print(String s){
		for(int i=0;i<s.length();i++){
			System.out.print(s.charAt(i)+" ");
		}
	}
	static void reverse(String s){
		for(int i=s.length()-1;i>=0;i--){
			System.out.print(s.charAt(i)+" ");
		}
	}
	static void caps(String s){
	System.out.println(s.toUpperCase());
		}
	
}

