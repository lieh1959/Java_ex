// app9_8, �]�ȵ����O���A���ܼ�
class CCircle        // �w�q���OCCircle
{
   private static double pi=3.14;
   private double radius;

   public CCircle(double r)
   {
       radius=r;
   }
   public void show()
   {
       System.out.println("area="+pi*radius*radius);
   }
}
public class app9_8
{
   public static void main(String args[])
   {
      CCircle cir1,cir2;      // �ŧicir1,cir2�����O���A���ܼ�
      cir1=new CCircle(1.0);  // �إ߷s������A�ñNcir1���V��
      cir1.show();

      cir2=cir1;    // �Ncir1�]��cir2�A���ɳo����ܼƩҫ��V�����e���۵�
      cir2.show();

      CCircle cir3=new CCircle(2.0); // �إ߷s������A�ñNcir3���V��
      cir3.show();
   }
}

/* app9_8 OUTPUT---
area=3.14
area=3.14
area=12.56
-----------------*/