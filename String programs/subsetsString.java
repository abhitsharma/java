package practice;
import java.util.Arrays; 
public class  subsetsString{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String s1="bob";
       int l=s1.length();
       int  temp=0;
       
        String[] st=new String[l*(l+1)/2];
        
		   for(int i=0;i<l;i++) {
			   for(int j=i;j<l;j++) {
				   st[temp]=s1.substring(i,j+1);
			        temp++;		
			   }
		   }
		   
	   
        System.out.println(" substrings of string are ");  
        for(int i = 0; i < st.length; i++) {  
            System.out.println(st[i]);  
            }           		      
	}
}
