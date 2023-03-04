package practice;
public class  longestRepeatedString{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String s1="acbdfghybdf";
       int l=s1.length();
       
        String rt="";
		   for(int i=0;i<l;i++) {
			   for(int j=i+1;j<l;j++) {
				   
				   String x=lst(s1.substring(i,l),s1.substring(j,l));
				   if( x.length()> rt.length()) {
					   rt=x;
				   }			       	
			   }			   			   
		   }	   
		   System.out.println("Longest repeating sequence: "+rt);              		      
	}

	private static String lst(String sub1, String sub2) {
		// TODO Auto-generated method stub
		int n=Math.min(sub1.length(),sub2.length());
		for(int i=0;i<n;i++)
		{
			if(sub1.charAt(i)!=sub2.charAt(i)) {
				return sub1.substring(0, i);
			}	
			
		}
		return sub1.substring(0, n);
	}
}
