// app8_2, �P�ɫإߨ�Ӫ���
class CRectangle
{
   int width;         // �w�q��Ʀ���width
   int height;        // �w�q��Ʀ���height
}

public class app8_2
{
   public static void main(String args[])
   {
      CRectangle rect1,rect2;       // �ŧi���ܼ�rect1,rect2
      rect1=new CRectangle();       // �إߪ���rect1
      rect2=new CRectangle();       // �إߪ���rect2

      rect1.width=20;               // �]�w�x��rect1���e
      rect1.height=15;              // �]�w�x��rect1����

      rect2.width=25;               // �]�w�x��rect2���e
      rect2.height=rect1.height+3;     // �]�w�x��rect2����

      System.out.println("rect1.width="+rect1.width);
      System.out.println("rect1.height="+rect1.height);
      System.out.println("rect2.width="+rect2.width);
      System.out.println("rect2.height="+rect2.height);
   }
}

/* app8_2 OUTPUT---
rect1.width=20
rect1.height=15
rect2.width=25
rect2.height=18
-----------------*/