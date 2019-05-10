import java.util.*;
public class MyClass{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        int count=0,count1=0;
        char[] ch=s.toCharArray();
        for(int i=0;i<ch.length;i++)
        {
            if(Character.isDigit(ch[i]))
            {
               count++;
            }
            if(Character.isLetter(ch[i]))
            {
                count1++;
            }
        }
        if(count>0 && count1>0)
        {
            System.out.println("yes");
        }
        else
        {
            System.out.println("no");
        }
    }
}
