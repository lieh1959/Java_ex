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

public class app11_5
{
   public static void main(String args[])
   {
      iShape2D var1,var2;  // �ŧi�������A���ܼ�
      var1=new CRectangle(5,10); // �N�������A���ܼ�var1���V�s�ت�����
      var1.area();      // �z�L����var1�I�sshow() method

      var2=new CCircle(2.0);  // �N�������A���ܼ�var2���V�s�ت�����
      var2.area();                  // �z�L����var2�I�sshow() method
   }
}

/* app11_5 OUTPUT---
area=50
area=12.56
------------------*/