// app8_4, ������OCCircle
class CCircle           // �w�q���OCCircle
{
   double pi=3.14;      // �N��Ʀ����]�w���
   double radius;

   void show_area()     // show_area() method, ��ܥX�ꭱ�n
   {
      System.out.println("area="+pi*radius*radius);
   }
}
public class app8_4
{
   public static void main(String args[])
   {
      CCircle cir1=new CCircle();   // �إ�cirl����
      cir1.radius=2.0;        // �]�wradius����
      cir1.show_area();       // �I�sshow_area() method
   }
}

/* app8_4 OUTPUT---
area=12.56
-----------------*/