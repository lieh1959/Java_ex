// app15_3, ��@Runnable�����ӫإ߰����
class CTest implements Runnable     // ��CTest���O��@Runnable����
{
   private String id;
   public CTest(String str)         // �غc���A�]�w����id
   {
      id=str;
   }
   public void run()    // �Բөw�qrunnable() �����̪� run() method
   {
      for(int i=0;i<4;i++)
      {
         for(int j=0;j<100000000;j++); // �Űj��A�Ψө�C14����檺�t��
         System.out.println(id+" is running..");
      }
   }
}

public class app15_3
{
   public static void main(String args[])
   {
      CTest dog=new CTest("doggy");
      CTest cat=new CTest("kitty");
      Thread t1=new Thread(dog);    // ����Thread���O������t1
      Thread t2=new Thread(cat);    // ����Thread���O������t2
      t1.start();             // ��t1�Ұʰ����
      t2.start();             // ��t2�Ұʰ����
   }
}

/* app15_3 OUTPUT---------
kitty is running..
doggy is running..
kitty is running..
kitty is running..
doggy is running..
kitty is running..
doggy is running..
doggy is running..
-----------------------*/
