import java.util.*;
class Charactercount
{
  public static void main(String args[])
  {    
     String s="aaabaacccddaaeefff";
    int a[]=new int[256];//This creates an array a with 256 elements to represent the count of each character. The array index i corresponds to the ASCII value of the character.


    int i;
   for(i=0;i<s.length();i++)
    
     a[(int)s.charAt(i)]++; //converted to ascii value
    
   for(i=0;i<256;i++)
   {
     if(a[i]!=0)
     System.out.println((char)i+"    "+a[i]); //converted to character

 
  }    
  }
}






