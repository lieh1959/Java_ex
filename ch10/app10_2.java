// app10_2, �I�s�����O���S�w���غc��
class CCircle              // �w�q�����OCCircle
{
   private static double pi=3.14;
   private double radius;

   public CCircle()        // �����O�̨S���޼ƪ��غc��
   {
      System.out.println("CCircle() constructor called");
   }
   public CCircle(double r)   // �����O�̦��@�Ӥ޼ƪ��غc��
   {
      System.out.println("CCircle(double r) constructor called");
      radius=r;
   }
   public void show()
   {
      System.out.println("area="+pi*radius*radius);
   }
}
class CCoin extends CCircle  // �w�q�l���OCCoin�A�~�Ӧ�CCircle���O
{
   private int value;
   public CCoin()                // �l���O�̨S���޼ƪ��غc��
   {
      System.out.println("CCoin() constructor called");
   }
   public CCoin(double r, int v) // �l���O�̦���Ӥ޼ƪ��غc��
   {
      super(r);   // �I�s�����O�̡A���޼ƪ��غc���A�Y��11��ҩw�q���غc��
      value=v;
      System.out.println("CCoin(double r, int v) constructor called");
   }
}
public class app10_2
{
   public static void main(String args[])
   {
      CCoin coin1=new CCoin();         // �إߪ���A�éI�s��24�檺�غc��
      CCoin coin2=new CCoin(2.5,10);   // �إߪ���A�éI�s��28�檺�غc��
      coin1.show();
      coin2.show();
   }
}

/* app10_2 OUTPUT--------------------------
CCircle() constructor called
CCoin() constructor called
CCircle(double r) constructor called
CCoin(double r, int v) constructor called
area=0.0
area=19.625
------------------------------------------*/

