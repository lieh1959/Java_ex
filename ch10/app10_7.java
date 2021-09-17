// app10_7, �z�L�����O�ܼ�cir�I�sshow() method
class CCircle           // �����OCCircle
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
class CCoin extends CCircle   // �l���OCCircle
{
   private int value;

   public CCoin(double r,int v)
   {
      super(r);
      value=v;
   }
   public void show()       // �l���O�̪�show() method
   {
      System.out.println("radius="+radius+", value="+value);
   }
   public void showValue()   // showValue() method,����ƥu�s�b��l���O
   {
      System.out.println("value="+value);
   }
}
public class app10_7
{
   public static void main(String args[])
   {
      CCircle cir=new CCoin(2.0,5); // �ŧi�����O�ܼ�cir�A�ñN�����V����
      cir.show();                   // �Q�Τ����O�ܼ�cir�I�sshow()
      // cir.showValue();
   }
}

/* app10_7 OUTPUT------
radius=2.0, value=5
---------------------*/
