// app16_7, HashMap�d��
import java.util.*;
public class app16_7
{
   public static void main(String args[])
   {
      HashMap<Integer,String> hmap=new HashMap<Integer,String>();

      hmap.put(94001,"Fiona");
      hmap.put(94003,"Ariel");
      hmap.put(94002,"Ryan");

      System.out.println("�����Ӽ�="+hmap.size());
      System.out.println("HashMap������:"+hmap);
      System.out.print("HashMap���O�_�������94002? ");
      System.out.println(hmap.containsKey(94002));
      System.out.print("HashMap���O�_��������Kevin? ");
      System.out.println(hmap.containsValue("Kevin"));
      hmap.remove(94001);
      System.out.print("�M�������94001�����..., ");
      System.out.println("�����Ӽ�="+hmap.size());
      System.out.println("HashMap������:"+hmap);
      System.out.println("�����94003��������="+hmap.get(94003));
   }
}
