// app15_2, �Ұʰ�������d��
class CTest extends Thread    // �qThread���O�����X�l���OCTest
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
         for(int j=0;j<100000000;j++); // �Űj��A�Ψө�C14����檺�t��
         System.out.println(id+" is running..");
      }
   }
}

public class app15_2
{
   public static void main(String args[])
   {
      CTest dog=new CTest("doggy");
      CTest cat=new CTest("kitty");
      dog.start();            // �`�N�O�I�sstart(),�Ӥ��Orun()
      cat.start();            // �`�N�O�I�sstart(),�Ӥ��Orun()
   }
}

/* app15_2 OUTPUT-------
kitty is running..
doggy is running..
kitty is running..
kitty is running..
doggy is running..
kitty is running..
doggy is running..
doggy is running..
----------------------*/