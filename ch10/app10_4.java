// app10_4, 修正app10_3的錯誤
class CCircle              // 定義類別CCircle
{
   private double pi=3.14;
   private double radius;

   public CCircle()              // 沒有引數的建構元
   {
   }
   public CCircle(double r)   // 有一個引數的建構元
   {
      radius=r;
   }
   public void setRadius(double r)
   {
      radius=r;
      System.out.println("radius="+radius);
   }
}

class CCoin extends CCircle  // 定義CCoin類別，繼承自CCircle類別
{
   private int value;

   public CCoin(double r, int v)    // CCoin()有兩個引數的建構元
   {
      setRadius(r);        // 透過setRadius() method來設定radius成員
      value=v;             // 設定value成員
   }
}
public class app10_4
{
   public static void main(String args[])
   {
      CCoin coin1=new CCoin(2.5,10); // 建立物件，並呼叫有兩個引數的建構元
   }
}

/* app10_4 OUTPUT---
radius=2.5
------------------*/