// app9_5, ²�檺�d��:����ܼƻP��Ҩ��
class CCircle              // �w�q���OCCircle
{
   private double pi=3.14;
   private double radius;

   public CCircle(double r)   // CCircle()�غc��
   {
      radius=r;
   }
   public void show()
   {
      System.out.println("area="+pi*radius*radius);
   }
}
public class app9_5
{
   public static void main(String args[])
   {
      CCircle cir1=new CCircle(1.0);
      cir1.show();         // show()�����z�L����өI�s
      CCircle cir2=new CCircle(2.0);
      cir2.show();         // show()�����z�L����өI�s
   }
}

/* app9_5 OUTPUT---
area=3.14
area=12.56
-----------------*/
