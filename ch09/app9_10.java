// app9_10, �ǻ����O���A���ܼ�
class CCircle
{
   private static double pi=3.14;
   private double radius;

   public CCircle(double r)        // CCircle()�غc��
   {
      radius=r;
   }
   public void compare(CCircle cir) // compare() method
   {
      if(this.radius==cir.radius)    // �P�O����radius�����O�_�۵�
         System.out.println("radius are equal");
      else
         System.out.println("radius are not equal");
   }
}
public class app9_10
{
   public static void main(String args[])
   {
      CCircle cir1=new CCircle(1.0);
      CCircle cir2=new CCircle(2.0);
      cir1.compare(cir2);     // ���cir1�Pcir2��radius�O�_�۵�
   }
}

/* app9_10 OUTPUT----
radius are not equal
-------------------*/