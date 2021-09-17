// app10_1, ²�檺�~�ӽd��
class CCircle        // �����OCCircle
{
   private static double pi=3.14;
   private double radius;

   public CCircle()     // CCircle()�غc��
   {
      System.out.println("CCircle() constructor called ");
   }
   public void setRadius(double r)
   {
      radius=r;
      System.out.println("radius="+radius);
   }
   public void show()
   {
      System.out.println("area="+pi*radius*radius);
   }
}
class CCoin extends CCircle      // �l���OCCoin�A�~�Ӧ�CCircle���O
{
   private int value;            // �l���O����Ʀ���

   public CCoin()          // �l���O���غc��
   {
      System.out.println("CCoin() constructor called ");
   }
   public void setValue(int t)         // �l���O��setValue() method
   {
      value=t;
      System.out.println("value="+value);
   }
}
public class app10_1
{
   public static void main(String args[])
   {
      CCoin coin=new CCoin(); // �إ�coin����
      coin.setRadius(2.0);    // �I�s�Ѥ����O�~�ӦӨӪ�setRadius()
      coin.show();         // �I�s�Ѥ����O�~�ӦӨӪ�show()
      coin.setValue(5);       // �I�s�l���O��setValue()
   }
}

/* app10_1 OUTPUT----------------
CCircle() constructor called
CCoin() constructor called
radius=2.0
area=12.56
value=5
-------------------------------*/
