// app10_11, �Q��getClass()���o�I�s������ݪ����O
class Caaa                    // �w�qCaaa���O
{
   private int num;

   public Caaa(int n)
   {
      num=n;
   }
}
public class app10_11
{
   public static void main(String args[])
   {
      Caaa a=new Caaa(5);
      Class ca=a.getClass();        // ���ܼ�a�I�sgetClass()
      System.out.println("Class of obj = "+ca);
   }
}

/* app10_11 OUTPUT----------
Class of obj = class Caaa
--------------------------*/

