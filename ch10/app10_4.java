// app10_4, �ץ�app10_3�����~
class CCircle              // �w�q���OCCircle
{
   private double pi=3.14;
   private double radius;

   public CCircle()              // �S���޼ƪ��غc��
   {
   }
   public CCircle(double r)   // ���@�Ӥ޼ƪ��غc��
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
public class app10_4
{
   public static void main(String args[])
   {
      CCoin coin1=new CCoin(2.5,10); // �إߪ���A�éI�s����Ӥ޼ƪ��غc��
   }
}

/* app10_4 OUTPUT---
radius=2.5
------------------*/