// app11_6, ��CCircle���O��@��ӥH�W������
interface iShape2D         // �w�qiShape2D����
{
   final double PI=3.14;
   abstract void area();
}

interface iColor        // �w�qiColor����
{
   abstract void setColor(String str);
}

class CCircle implements iShape2D,iColor   // ��@iShape2D�PiColor����
{
   double radius;
   String color;
   public CCircle(double r)
   {
      radius=r;
   }
   public void setColor(String str)      // �w�qiColor�����̪�setColor()
   {
      color=str;
      System.out.println("color="+color);
   }
   public void area()      // �w�qiShape2D�����̪�area() method
   {
      System.out.println("area="+PI*radius*radius);
   }
}
public class app11_6
{
   public static void main(String args[])
   {
      CCircle cir;
      cir=new CCircle(2.0);
      cir.setColor("Blue");      // �I�ssetColor() method
      cir.area();          // �I�sshow() method
   }
}

/* app11_6 OUTPUT---
color=Blue
area=12.56
------------------*/