// app8_7, �I�smethod�öǻ��޼�
class CCircle        //    ���OCCircle
{
   double pi=3.14;    // �N��Ʀ����]�w���
   double radius;

   void show_area()  // show_area() method, ��ܥX�b�|�ζꭱ�n
   {
      System.out.println("radius="+radius);
      System.out.println("area="+pi*radius*radius);
   }
   void setRadius(double r)   // setRadius() method, �i�Ψӳ]�w�b�|
   {
      radius=r;               // �]�wradius�������Ȭ�r
   }
}
public class app8_7
{
   public static void main(String args[])
   {
      CCircle cir1=new CCircle();      // �ŧi�ëإ߷s������
      cir1.setRadius(4.0);          // �]�wcir1���b�|��4.0
      cir1.show_area();
   }
}

/* app8_7 OUTPUT---
radius=4.0
area=50.24
-----------------*/