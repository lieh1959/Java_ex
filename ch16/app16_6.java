// app16_6, ArrayList�d��
import java.util.*;
public class app16_6
{
   public static void main(String args[])
   {
      ArrayList<Integer> alist=new ArrayList<Integer>();

      for(int i=10;i<=50;i+=10)  	// �W�[����
         alist.add(i);
      alist.add(3,200);
      alist.add(0,300);
      alist.add(400);				// �N400��balist���̫�@�Ӧ�m

      System.out.println("�����Ӽ�="+alist.size());
      System.out.println("ArrayList������:"+alist);
      System.out.println("�N���ޭ�1�������H200���N...");
      alist.set(1,200);
      System.out.println("ArrayList������:"+alist);
      System.out.print("�Ĥ@�Ӥ����Ȭ�200�����ޭ�=");
      System.out.println(alist.indexOf(200));
      System.out.print("�̫�@�Ӥ����Ȭ�200�����ޭ�=");
      System.out.println(alist.lastIndexOf(200));
   }
}
