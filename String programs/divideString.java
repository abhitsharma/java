package practice;
import java.util.Arrays; 
public class divideString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String s1="herohasfallen";
       int l=s1.length();
       int n=3;
        int temp=0,c=l/n; 
        String[] st=new String[n];
        if(l%n!=0)
        {
        	System.out.print("strings cant be divided");
        }
	   else
	   {
		   for(int i=0;i<=l;i=i+c) {
			   String part=s1.substring(i,i+c);
			   st[temp]=part;
			   temp++;			   
		   }
		   
	   }
        System.out.println(n + " equal parts of given string are ");  
        for(int i = 0; i < st.length; i++) {  
            System.out.println(st[i]);  
            }           		      
	}
}
