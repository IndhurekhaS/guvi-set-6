import java.util.*;
public class MyClass {
    public static void main(String args[]) {
       Scanner sc=new Scanner(System.in);
       int n=sc.nextInt();
       String s=Integer.toString(n);
       for(int i=0;i<s.length();i++)
       {
           System.out.print(s.charAt(i)+" ");
       }
    }
}
