// app8_9, ������OCCircle
class CCircle           // �w�q���OCCircle
{
   double pi;           // �N��Ʀ����]�w���
   double radius;

   double getRadius()      // getRadius(), �ΨӶǦ^���󪺥b�|
   {
      return radius;
   }
   void setCircle( double p, double r)
   {
      pi=p;
      radius=r;
   }
}
public class app8_9
{
   public static void main(String args[])
   {
      CCircle cir1=new CCircle();      // �ŧi�ëإ߷s������
      cir1.setCircle(3.1416,2.0);
      System.out.println("radius="+cir1.getRadius());
   }
}

/* app8_9 OUTPUT---
radius=2.0
-----------------*/