// app9_16, �b�غc���̫إߤ������O������
public class app9_16
{
   public app9_16()
   {
      Caaa aa= new Caaa();
      aa.set_num(5);
   }

   public static void main(String args[])
   {
      app9_16 obj=new app9_16(); // �I�s�غc��app9_16()�إߥ~�����O������
   }

   class Caaa
   {
      int num;
      void set_num(int n)
      {
         num=n;
         System.out.println("num= "+ num);
      }
   }
}

/* app9_16 OUTPUT---
num= 5
------------------*/