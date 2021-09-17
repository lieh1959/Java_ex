// app15_5, ������Ƶ{���]�p(�@)
class CTest extends Thread    // �qThread���O�����X�l���O
{
   private String id;
   public CTest(String str)      // �غc���A�]�w����id
   {
      id=str;
   }
   public void run()          // ��gThread���O�̪�run() method
   {
      for(int i=0;i<4;i++)
      {
         try
         {
            sleep((int)(1000*Math.random()));
         }
         catch(InterruptedException e){}
         System.out.println(id+" is running..");
      }
   }
}

public class app15_5
{
   public static void main(String args[])
   {
      CTest dog=new CTest("doggy");
      CTest cat=new CTest("kitty");
      dog.start();            // ��dog����ӱҰʰ����
      cat.start();               // ��cat����ӱҰʰ����
      System.out.println("main() finished");
   }
}

/* app15_5 OUTPUT---------
main() finished
doggy is running..
kitty is running..
doggy is running..
doggy is running..
doggy is running..
kitty is running..
kitty is running..
kitty is running..
------------------------*/
