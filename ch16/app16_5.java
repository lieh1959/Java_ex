// app16_5, LinkedList�d��
import java.util.*;
public class app16_5
{
   public static void main(String args[])
   {
      LinkedList<Integer> llist=new LinkedList<Integer>();

      for(int i=10;i<=30;i+=10)  		// �W�[����
         llist.add(i);
      llist.addFirst(100);
      llist.addLast(200);
      llist.addFirst(300);

      System.out.println("�����Ӽ�="+llist.size());
      System.out.print("LinkedList������:");
      for(int i=0;i<llist.size();i++)  // ��ܶ��X���󪺤��e
         System.out.print(llist.get(i)+" ");

      System.out.print("\n�R���̫�@�Ӥ��� ");
      System.out.println(llist.removeLast()+"...");

      System.out.println("�Ĥ@�Ӥ���="+llist.getFirst());
      System.out.println("�̫�@�Ӥ���="+llist.getLast());
      System.out.println("�����Ȭ�200�����ޭ�="+llist.indexOf(200));
   }
}
