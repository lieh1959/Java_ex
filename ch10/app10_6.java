// app10_6, method���u��g�v�d��
class CCircle              // �����OCCircle
{
   protected static double pi=3.14;
   protected double radius;

   public CCircle(double r)
   {
      radius=r;
   }
   public void show()         // �����O�̪�show() method
   {
      System.out.println("radius="+radius);
   }
}

class CCoin extends CCircle   // �l���OCCoin
{
   private int value;

   public CCoin(double r,int v)
   {
      super(r);
      value=v;
   }
   public void show()         // �l���O�̪�show() method
   {
      System.out.println("radius="+radius+", value="+value);
   }
}

public class app10_6
{
   public static void main(String args[])
   {
      CCoin coin=new CCoin(2.0,5);
      coin.show();         // �I�sshow() method
   }
}

/* app10_6 OUTPUT------
radius=2.0, value=5
---------------------*/