// app10_5, protected�������ϥ�
class CCircle
{
   protected static double pi=3.14;   // �Npi�ŧi��protected
   protected double radius;   // �Nradius�ŧi��protected

   public void show()
   {
      System.out.println("area="+pi*radius*radius);
   }
}
class CCoin extends CCircle   // �w�qCCoin���O�A�~�Ӧ�CCircle���O
{
   private int value;

   public CCoin(double r, int v)
   {
      radius=r;      // �b�l���O�̥i�������Τ����O�̪�protected����
      value=v;
      System.out.println("radius="+radius+", value="+value);
   }
}
public class app10_5
{
   public static void main(String args[])
   {
      CCoin coin=new CCoin(2.5,10);
      coin.show();
   }
}

/* app10_5 OUTPUT-------
radius=2.5, value=10
area=19.625
----------------------*/
