// app10_3, �غc�����~���d��
class CCircle              // �w�q���OCCircle
{
   private static double pi=3.14;
   private double radius;

   public CCircle(double r)   // ���޼ƪ��غc��
   {
      radius=r;
   }
   public void setRadius(double r)
   {
      radius=r;
      System.out.println("radius="+radius);
   }
}

class CCoin extends CCircle  // �w�qCCoin���O�A�~�Ӧ�CCircle���O
{
   private int value;

   public CCoin(double r, int v)    // CCoin()����Ӥ޼ƪ��غc��
   {
      setRadius(r);        // �z�LsetRadius() method�ӳ]�wradius����
      value=v;             // �]�wvalue����
   }
}
public class app10_3
{
   public static void main(String args[])
   {
      CCoin coin1=new CCoin(2.5,10); // �إߪ���A�éI�s����Ӥ޼ƪ��غc��
   }
}

/* app10_3 OUTPUT�sĶ���T��---------------------------------------------------
error: constructor CCircle in class CCircle cannot be applied to given types;
   {
   ^
  required: double
  found: no arguments
  reason: actual and formal argument lists differ in length
----------------------------------------------------------------------------*/
