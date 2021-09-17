// app9_11, ��method�Ǧ^���O���A���ܼ�
class CCircle              // �w�q���OCCircle
{
   private static double pi=3.14;
   private double radius;

   public CCircle(double r)   // CCircle�غc��
   {
      radius=r;
   }
   public CCircle compare(CCircle cir) // Compare() method
   {
      if(this.radius>cir.radius)
         return this;         // �Ǧ^�I�scompare() method������
      else
         return cir;          // �Ǧ^�ǤJcompare() method������
   }
}
public class app9_11
{
   public static void main(String args[])
   {
      CCircle cir1=new CCircle(1.0);
      CCircle cir2=new CCircle(2.0);
      CCircle obj;

      obj=cir1.compare(cir2);      // �I�scompare() method
      if(cir1==obj)
         System.out.println("radius of cir1 is larger");
      else
         System.out.println("radius of cir2 is larger");
   }
}

/* app9_11 OUTPUT----------
radius of cir2 is larger
-------------------------*/