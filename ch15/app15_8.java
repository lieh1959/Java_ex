// app15_8, �S���P�B�B�z�������
class CBank
{
   private static int sum=0;
   public static void add(int n)
   {
      int tmp=sum;
      tmp=tmp+n;            // �֥[�״��`�B
      try
      {
         Thread.sleep((int)(1000*Math.random()));   // �p��0~1����
      }
      catch(InterruptedException e){}
      sum=tmp;
      System.out.println("sum= "+sum);
  }
}
class CCustomer extends Thread // CCustomer���O�A�~�Ӧ�Thread���O
{
   public void run()        // run() method
   {
      for(int i=1;i<=3;i++)
         CBank.add(100);       // �N100�����T���פJ
   }
}
public class app15_8
{
   public static void main(String args[])
   {
      CCustomer c1=new CCustomer();
      CCustomer c2=new CCustomer();
      c1.start();
      c2.start();
   }
}

/* app15_8 OUTPUT----(�S���[synchronized�����浲�G)
sum= 100
sum= 100
sum= 200
sum= 300
sum= 200
sum= 300
--------------------*/
