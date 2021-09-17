// app11_4, ��������@�d��
interface iShape2D               // �w�q����
{
   final double PI=3.14;
   abstract void area();
}

class CRectangle implements iShape2D // �HCRectangle���O��@iShape2D����
{
   int width,height;
   public CRectangle(int w,int h)
   {
      width=w;
      height=h;
   }
   public void area()      // �w�qarea()���B�z�覡
   {
      System.out.println("area="+width*height);
   }
}

class CCircle implements iShape2D // �HCCircle���O��@iShape2D����
{
   double radius;
   public CCircle(double r)
   {
      radius=r;
   }
   public void area()      // �w�qarea()���B�z�覡
   {
      System.out.println("area="+PI*radius*radius);
   }
}

public class app11_4
{
   public static void main(String args[])
   {
      CRectangle rect=new CRectangle(5,10);
      rect.area();         // �I�sCRectangle���O�̪�area() method

      CCircle cir=new CCircle(2.0);
      cir.area();       // �I�sCCircle���O�̪�area() method
   }
}

/* app11_4 OUTPUT---
area=50
area=12.56
------------------*/