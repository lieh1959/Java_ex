// app10_9, ��this�өI�s����ܼ�
class Caaa
{
   public int num=10;    // num�O����ܼ�

   public void show()
   {
      int num=5;         // num�O�ϰ��ܼơA�䦳�Ľd��ȭ���bshow()��
      System.out.println("this.num="+this.num); // �L�X����ܼ�
      System.out.println("num="+num);           // �L�X�ϰ��ܼ�
   }
}
public class app10_9
{
   public static void main(String args[])
   {
      Caaa a=new Caaa();
      a.show();
   }
}

/* app10_9 OUTPUT---
this.num=10
num=5
------------------*/

