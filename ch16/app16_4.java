// app16_4, ²�檺TreeSet�d��
import java.util.*;
public class app16_4
{
   public static void main(String args[])
   {
      TreeSet<Integer> tset=new TreeSet<Integer>();

      for(int i=20;i>=2;i-=2)				  // �W�[����
         tset.add(i);

      System.out.println("�����Ӽ�="+tset.size());
      System.out.println("���X���e="+tset);     // ��ܶ��X���󪺤��e

      System.out.println("�Ĥ@�Ӥ���="+tset.first());
      System.out.println("�̫�@�Ӥ���="+tset.last());
      System.out.println("����6�M14���������X="+tset.subSet(6,14));
      System.out.println("�j�󵥩�10�����X="+tset.tailSet(10));
      System.out.println("�p��8�����X="+tset.headSet(8));
   }
}
