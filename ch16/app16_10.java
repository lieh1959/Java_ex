// app16_10, �HIterator���XTreeSet����
import java.util.*;
public class app16_10
{
   public static void main(String args[])
   {
      TreeSet<String> tset=new TreeSet<String>();
      String str="";
      tset.add("Monkey");     			// �W�[����
      tset.add("Bunny");      			// �W�[����
      tset.add("Puppy");				// �W�[����
      tset.add("Kitty");    			// �W�[����

      Iterator<String> itr=tset.iterator(); // ���oIterator����
      System.out.print("TreeSet���e:");
      while(itr.hasNext())				// ���X����
      {
         str=itr.next();
         System.out.print(str+" ");		// �L�X�������e
      }

      System.out.println("\n�R���̫�Ū��������"+str+"...");
      itr.remove();					// �R���̫�Ū��������
      System.out.println("TreeSet���e:"+tset);
   }
}
