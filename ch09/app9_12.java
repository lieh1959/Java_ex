// app9_12, �إߪ���}�C
class CCircle        // �w�q���OCCircle
{
   private static double pi=3.14;
   private double radius;

   public CCircle(double r)       // CCircle�غc��
   {
      radius=r;
   }
   public void show()
   {
      System.out.println("area="+pi*radius*radius);
   }
}
public class app9_12
{
   public static void main(String args[])
   {
      CCircle cir[];
      cir=new CCircle[3];
      cir[0]=new CCircle(1.0);
      cir[1]=new CCircle(4.0);
      cir[2]=new CCircle(2.0);

      cir[0].show();   // �Q�Ϊ���cir[0]�I�sshow() method
      cir[1].show();   // �Q�Ϊ���cir[1]�I�sshow() method
      cir[2].show();   // �Q�Ϊ���cir[2]�I�sshow() method
   }
}

/* app9_12 OUTPUT---
area=3.14
area=50.24
area=12.56
------------------*/