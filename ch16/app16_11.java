// app16_11, �HListIterator���XLinkedList����
import java.util.*;
public class app16_11
{
   public static void main(String args[])
   {
      LinkedList<Integer> llist=new LinkedList<Integer>();
      llist.add(5); 	//�[�J����5
      llist.add(7); 	//�[�J����7
      llist.add(10); 	//�[�J����10
      llist.add(14); 	//�[�J����13
      ListIterator<Integer> litr1=llist.listIterator();

      System.out.print("���V�C�XLinkedList���e:");
      while(litr1.hasNext())    				// ���V���X����
         System.out.print(litr1.next()+" ");    	// �L�X�������e
      System.out.println();

      ListIterator<Integer> litr2=llist.listIterator(llist.size());
      System.out.print("�ϦV�C�XLinkedList���e:");
      while(litr2.hasPrevious())				// �ϦV���X����
         System.out.print(litr2.previous()+" ");	// �L�X�������e
      System.out.println();
   }
}
