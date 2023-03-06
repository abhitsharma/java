package practice;
import java.util.Arrays;
import java.util.Scanner;
public class sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Scanner s=new Scanner(System.in);
     int n=s.nextInt();
     int arr[]=new int[n];
     for(int i=0;i<n;i++) {
    arr[i]=s.nextInt();
     }
     Arrays.sort(arr);
     for(int i=0;i<n;i++) {
    	 System.out.println(arr[i]); 
    	     }
    	     
	}
   
}

