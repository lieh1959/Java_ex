// app13_4, ��{�����ߥX�ҥ~
public class app13_4
{
   public static void main(String args[])
   {
      int a=4,b=0;

      try
      {
        if(b==0)
         throw new ArithmeticException();    // �ߥX�ҥ~
        else
         System.out.println(a+"/"+b+"="+a/b);  // �Y�S���ߥX�ҥ~�A�h���榹��
      }
      catch(ArithmeticException e)
      {
         System.out.println(e+" throwed");
      }
   }
}

/* app13_4 OUTPUT-----------------------
java.lang.ArithmeticException throwed
--------------------------------------*/