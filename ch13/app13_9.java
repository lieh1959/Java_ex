// app13_9, ����InputMismatchException�ҥ~
import java.util.*;
public class app13_9
{
   public static void main(String args[])
   {
      int num;
      Scanner scn=new Scanner(System.in);
      try
      {
         System.out.print("�п�J�@�Ӿ��: ");
         num=scn.nextInt();
      }
      catch(Exception e)
      {
         System.out.println("�ߥX"+e+"�ҥ~");
      }
   }
}

/* app13_9 OUTPUT-------------------------
�п�J�@�Ӿ��: k
�ߥXjava.util.InputMismatchException�ҥ~
----------------------------------------*/