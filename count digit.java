import java.util.*;
public class MyClass{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String s=Integer.toString(n);
        int count=0;
        for(int i=0;i<s.length();i++)
        {
            char c=s.charAt(i);
            count++;
        }
        System.out.println(count);
    }
}
