// app8_11, ��ƪ��h��(�G)
class CCircle                    // �w�q���OCCircle
{
   String color;
   double pi=3.14;
   double radius;

   void setCircle(String str)          // �]�wcolor����
   {
      color=str;
   }
   void setCircle(double r)         // �]�wradius����
   {
      radius=r;
   }
   void setCircle(String str, double r)   // �P�ɳ]�wcolor�Pradius
   {
      color=str;
      radius=r;
   }
   void show()
   {
      System.out.println("color="+color+", Radius="+radius);
      System.out.println("area="+pi*radius*radius);
   }
}

public class app8_11
{
   public static void main(String args[])
   {
      CCircle cir1=new CCircle();

      cir1.setCircle("Red");     // �I�s��8�檺setCircle()
      cir1.setCircle(2.0);       // �I�s��12�檺setCircle()
      cir1.show();

      cir1.setCircle("Blue",4.0);   // �I�s��16�檺setCircle()
      cir1.show();
   }
}

/* app8_11 OUTPUT------
color=Red, Radius=2.0
area=12.56
color=Blue, Radius=4.0
area=50.24
---------------------*/