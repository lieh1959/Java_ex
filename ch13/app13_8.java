// app13_8, �w�q�ۤv���ҥ~���O
class CCircleException extends Exception  // �w�q�ۤv���ҥ~���O
{
}

class CCircle        // �w�q���OCCircle
{
   private double radius;
   public void setRadius(double r) throws CCircleException
   {
      if(r<0)
      {
         throw new CCircleException();       // �ߥX�ҥ~
      }
      else
         radius=r;
   }

   public void show()
   {
      System.out.println("area="+3.14*radius*radius);
   }
}

public class app13_8
{
   public static void main(String args[])
   {
      CCircle cir=new CCircle();
      try
      {
         cir.setRadius(-2.0);
      }
      catch(CCircleException e)    // ������setRadius()�ߥX���ҥ~
      {
         System.out.println(e+" throwed");
      }
      cir.show();
   }
}

/* app13_8 OUTPUT-----------
CCircleException throwed
area=0.0
--------------------------*/