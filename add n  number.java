import java.util.*;
public class MyClass {
    public static void main(String args[]) {
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int sum=0;
      while(n>0)
      {
          int s=n%10;
          n=n/10;
          sum=sum+s;
      }
      System.out.println(sum);
      
    }
}
