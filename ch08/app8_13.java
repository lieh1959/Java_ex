// app8_13, �p�������L�k�q���O�~���Ӧs�����d��
class CCircle              // �]�wfield���p������
{
   private double pi=3.14;       // �N��Ʀ����]�w���
   private double radius;

   void show_area()
   {
      System.out.println("area="+pi*radius*radius);
   }
}

public class app8_13
{
   public static void main(String args[])
   {
      CCircle cir1=new CCircle();
      cir1.radius=-2.0;
      cir1.show_area();
   }
}

/* app8_13 OUTPUT---
width=20
height=15
------------------*/