package practice;
public class  permutationString{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String s1="abc";
       int l=s1.length();
       
       System.out.println("All the permutations of the string are: ");    
		genreatepermutation(s1,0,l);             		      
	}

	private static void genreatepermutation(String s1, int start, int end) {
		// TODO Auto-generated method stub
		if(start==end-1)
		{
			System.out.println(s1);
		}	
		for(int i=start;i<end;i++)
		{
			s1=swapstring(s1,start,i);
			genreatepermutation(s1,start+1,end);
			s1=swapstring(s1,start,i);
		}		
	}

	private static String swapstring(String s1, int start, int i) {
		// TODO Auto-generated method stub
		char ch[]=s1.toCharArray();
		char temp;
	   temp=ch[start];
	   ch[start]=ch[i];
	   ch[i]=temp;		
	   return String.valueOf(ch);   
	}

	
	
}
