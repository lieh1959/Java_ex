// app9_17, �ΦW�������O
public class app9_17
{
   public static void main(String args[])
   {
      (
         new Caaa()        // �إ߰ΦW�������OCaaa������
         {
            void set_num(int n)
            {
               num=n;
               System.out.println("num= "+ num);
            }
         }
      ).set_num(5);     // ����ΦW�������O�̩ҩw�q��method
   }

   static class Caaa    // �������OCaaa
   {
       int num;
   }
}

/* app9_17 OUTPUT---
num= 5
------------------*/