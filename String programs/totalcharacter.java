public class Main {
    public static void main(String[] args) {
        String s="hero has fallen";
        int i=0,count=0;
        while(i<=s.length()){
        if(s.charAt(i)!=' ')
        {
          count++;
        }
        i++;
        }
        System.out.println(count);
    }
}

