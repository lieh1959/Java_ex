// app9_9, ���O���A���ܼƪ�����
class CCircle              // �w�q���OCCircle
{
   private static double pi=3.14;
   private double radius;

   public CCircle(double r)   // CCircle�غc��
   {
      radius=r;
   }
   public void setRadius(double r)
   {
      radius=r;               // �]�wradius��������
   }
   public void show()
   {
      System.out.println("area="+pi*radius*radius);
   }
}
public class app9_9
{
   public static void main(String args[])
   {
      CCircle cir1,cir2;
      cir1=new CCircle(1.0);
      cir1.show();

      cir2=cir1; // �Ncir1�]��cir2�A���ɳo����ܼƩҫ��V�����e���۵�
      cir2.setRadius(2.0);  // �Ncir2���󪺥b�|�]��2.0
      cir1.show();
   }
}

/* app9_9 OUTPUT---
area=3.14
area=12.56
-----------------*/