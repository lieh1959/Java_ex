// app8_3, method���إ�
class CRectangle
{
   int width;
   int height;
   int area()           // �w�q�������area(), �Ψӭp�⭱�n
   {
      return width*height;       // �Ǧ^�x�Ϊ����n
   }

   int perimeter()   // �w�q�������perimeter(), �Ψӭp��P��
   {
      return 2*(width+height);      // �Ǧ^�x�Ϊ��P��
   }
}

public class app8_3
{
   public static void main(String args[])
   {
      CRectangle rect1;
      rect1=new CRectangle();       // �إ߷s������

      rect1.width=20;            // �]�w�x��rect1���e
      rect1.height=15;           // �]�w�x��rect1����

      System.out.println("area="+rect1.area());
      System.out.println("perimeter="+rect1.perimeter());
   }
}

/* app8_3 OUTPUT---
area=300
perimeter=70
-----------------*/