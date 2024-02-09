import java.util.*;
class Sumofdigits
{
 public static void main(String args[])
 {
  Scanner sc=new Scanner(System.in);
  int n,i,sum=0,rem;

  System.out.println("enter the value of n");
  n=sc.nextInt();

  
  while(n!=0)
  {
    rem=n%10;
    sum=sum+rem;
    n=n/10;
}
   System.out.println("sum of individual digits of given number is"+sum);
}
}