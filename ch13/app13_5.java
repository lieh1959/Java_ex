// app13_5, ���t�Φ۰ʩߥX�ҥ~
public class app13_5
{
   public static void main(String args[])
   {
      int a=4,b=0;

      try
      {
          System.out.println(a+"/"+b+"="+a/b);
      }
      catch(ArithmeticException e)
      {
         System.out.println(e+" throwed ");
      }
   }
}

/* app13_5 OUTPUT------------------------------------------
java.lang.ArithmeticException throwed: / by zero throwed
---------------------------------------------------------*/