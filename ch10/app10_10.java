// app10_10, �]�w�פ��~��
class Caaa
{
   public final void show()   // �����O��show()�w�Q�]���פ��~��
   {
      System.out.println("show() method in class Caaa called");
   }
}
class Cbbb extends Caaa
{
   public void show()         // ���~�A��g�����O��show() method
   {
      System.out.println("show() method in class Cbbb called");
   }
}
public class app10_10
{
   public static void main(String args[])
   {
      Cbbb b=new Cbbb();
      b.show();
   }
}

/* app10_10 OUTPUT�sĶ���T��---------------------------------------
error: show() in Cbbb cannot override show() in Caaa
   public void show()         // ���~�A��g�����O��show() method
               ^
  overridden method is final
-----------------------------------------------------------------*/
