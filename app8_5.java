// app8_5, ������OCCircle��field��O���餺���t�m���Y
class CCircle           // �w�q���OCCircle
{
   double pi=3.14;      // �N��Ʀ����]�w���
   double radius;

   void show_area()     // show_area() method, ��ܥX�ꭱ�n
   {
      System.out.print("pi="+pi);
      System.out.println(", area="+pi*radius*radius);
   }
}
public class app8_5
{
   public static void main(String args[])
   {
      CCircle cir1=new CCircle();      // �إ�cir1����
      CCircle cir2=new CCircle();      // �إ�cir2����

      cir1.radius=cir2.radius=2.0;     // �]�w��Ʀ�������
      cir2.pi=3.0;                     // ���cir2��pi��

      cir1.show_area();
      cir2.show_area();
   }
}

/* app8_5 OUTPUT---
pi=3.14, area=12.56
pi=3.0, area=12.0
-----------------*/