// app9_2,�غc�����h��
class CCircle           // �w�q���OCCircle
{
   private String color;
   private double pi=3.14;
   private double radius;

   public CCircle()                    // �S���޼ƪ��غc��
   {
      System.out.println("constructor CCircle() called");
      color="Green";
      radius=1.0;
   }
   public CCircle(String str, double r)      // ����Ӥ޼ƪ��غc��
   {
      System.out.println("constructor CCircle(String,double) called");
      color=str;
      radius=r;
   }
   public void show()
   {
      System.out.println("color="+color+", Radius="+radius);
      System.out.println("area="+pi*radius*radius);
   }
}
public class app9_2
{
   public static void main(String args[])
   {
      CCircle cir1=new CCircle();         // �I�s�S���޼ƪ��غc��
      cir1.show();

      CCircle cir2=new CCircle("Blue",4.0);  // �I�s���޼ƪ��غc��
      cir2.show();
   }
}

/* app9_2 OUTPUT-----------------------------
constructor CCircle() called
color=Green, Radius=1.0
area=3.14
constructor CCircle(String,double) called
color=Blue, Radius=4.0
area=50.24
-------------------------------------------*/