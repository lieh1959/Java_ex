// app13_7, �q���P���O����method�ߥX�ҥ~
class Ctest
{
    public static void aaa(int a,int b) throws ArithmeticException
    {
       int c=a/b;
       System.out.println(a+"/"+b+"="+c);
    }
}

public class app13_7
{
   public static void main(String args[])
   {
      try
      {
         Ctest.aaa(4,0);
      }
      catch(ArithmeticException e)
      {
         System.out.println(e+" throwed");
      }
   }
}

/* app13_7 OUTPUT----------------------------------
java.lang.ArithmeticException: / by zero throwed
-------------------------------------------------*/