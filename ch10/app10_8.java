// app10_8, �z�Lsuper����r�Ӧs�������O���ܼ�
class Caaa
{
   protected int num;            // �����O����Ʀ���num

   public void show()
   {
      System.out.println("Caaa_num="+num);
   }
}
class Cbbb extends Caaa
{
   int num=10;                      // �l���O����Ʀ���num

   public void show()
   {
      super.num=20;                 // �]�w�����O����Ʀ���num��20
      System.out.println("Cbbb_num="+num);
      super.show();              // �I�s�����O��show() method
   }
}

public class app10_8
{
   public static void main(String args[])
   {
      Cbbb b=new Cbbb();
      b.show();
   }
}

/* app10_8 OUTPUT---
Cbbb_num=10
Caaa_num=20
------------------*/