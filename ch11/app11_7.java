// app11_7, ����������
interface iShape              // �w�qiShape����
{
   final double PI=3.14;
   abstract void setColor(String str);
}

interface iShape2D extends iShape  // �w�qiShape2D����, �~�Ӧ�iShape
{
   abstract void area();
}

class CCircle implements iShape2D  // ��@iShape2D����
{
   double radius;
   String color;

   public CCircle(double r)
   {
      radius=r;
   }
   public void setColor(String str)    // �w�qiShape������setColor()
   {
      color=str;
      System.out.println("color="+color);
   }
   public void area()                  // �w�qiShape2D�����̪�area()
   {
      System.out.println("area="+PI*radius*radius);
   }
}
public class app11_7
{
   public static void main(String args[])
   {
      CCircle cir;
      cir=new CCircle(2.0);
      cir.setColor("Blue");         // �I�ssetColor() method
      cir.area();                // �I�sarea() method
   }
}

/* app11_7 OUTPUT---
color=Blue
area=12.56
------------------*/