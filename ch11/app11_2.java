// app11_2, �Ω�H���O���A���ܼƨӫإߪ���
abstract class CShape               // �w�q��H���OCShape
{
   protected String color;       // ��Ʀ���
   public void setColor(String str)    // �@�몺���
   {
      color=str;
   }
   public abstract void show(); // ��H��ơA�u���w�q�W�١A�S���w�q�B�z�覡
}



class CRectangle extends CShape    // �w�q�l���OCRectangle
{
   protected int width,height;
   public CRectangle(int w,int h)
   {
      width=w;
      height=h;
   }
   public void show()      // ���T�w�q�~�Ӧ۩�H���O��show() method
   {
      System.out.print("color="+color+",  ");
      System.out.println("area="+width*height);
   }
}
class CCircle extends CShape     // �w�q�l���OCCircle
{
   protected double radius;
   public CCircle(double r)
   {
      radius=r;
   }
   public void show()     // ���T�w�q�~�Ӧ۩�H���O��show() method
   {
      System.out.print("color="+color+",  ");
      System.out.println("area="+3.14*radius*radius);
   }
}
public class app11_2
{
   public static void main(String args[])
   {
      CShape shape1=new CRectangle(5,10);
      shape1.setColor("Yellow");
      shape1.show();

      CShape shape2=new CCircle(2.0);
      shape2.setColor("Green");
      shape2.show();
   }
}

/* app11_2 OUTPUT---------
color=Yellow,  area=50
color=Green,  area=12.56
------------------------*/