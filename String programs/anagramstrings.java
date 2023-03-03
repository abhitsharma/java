package practice;
import java.util.Arrays; 
public class anagramstrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String s1="boob";
       int n1=s1.length();
       String s2="oobb";
       int n2=s1.length();
      if(s1.length()!=s2.length()) {
    	  System.out.print("strings are not anagram");
      }
         else{
     		char[] st1=s1.toCharArray();
     		char[] st2=s2.toCharArray();
     		Arrays.sort(st1);
     		Arrays.sort(st2);
     		if(Arrays.equals(st1, st2)==true) {
     			System.out.print("strings are anagram");
	   }else
	   {
		   System.out.print("strings are not anagram");
	   }
		   
	   }
     		      
	}
}
