// app15_1, ��@��������d��
class CTest
{
   private String id;
   public CTest(String str)            // �غc���A�]�w��Ʀ���id
   {
      id=str;
   }
   public void run()                // run() method
   {
      for(int i=0;i<4;i++)
      {
         for(int j=0;j<100000000;j++);    // �Űj��A�Ψө�C14����檺�t��
         System.out.println(id+" is running..");
      }
   }
}

public class app15_1
{
   public static void main(String args[])
   {
      CTest dog=new CTest("doggy");
      CTest cat=new CTest("kitty");
      dog.run();
      cat.run();
   }
}