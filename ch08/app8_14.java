// app8_14, ��������(method)���إ�
class CCircle              // �w�q���OCCircle
{
   private double pi=3.14;       // �N��Ʀ����]�w��private
   private double radius;

   private double area()      // �w�q�p�����������area()
   {
       return pi*radius*radius;
   }
   public void show_area()    // �w�q�������������show_area()
   {
       System.out.println("area="+ area());  // �I�s�p������area()
   }
   public void setRadius(double r)  // �w�q�������������setRadius()
   {
       if(r>0)
       {
          radius=r;           // �N�p������radius�]��r
          System.out.println("radius="+radius);
       }
       else
          System.out.println("input error");
   }
}

public class app8_14
{
   public static void main(String args[])
   {
       CCircle cir1=new CCircle();
       cir1.setRadius(-2.0);  // �I�s������setRadius() method
       cir1.show_area();         // �I�s������show_area() method
   }
}

/* app8_14 OUTPUT---
input error
area=0.0
------------------*/