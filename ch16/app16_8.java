// app16_8, TreeMap�d��
import java.util.*;
public class app16_8
{
   public static void main(String args[])
   {
      int k1=94001,k2=94003,key;
      TreeMap<Integer,String> tmap=new TreeMap<Integer,String>();

      tmap.put(94001,"Fiona");
      tmap.put(94003,"Ariel");
      tmap.put(94002,"Ryan");
      tmap.put(94004,"Jack");

      System.out.println("�����Ӽ�="+tmap.size());
      System.out.println("TreeMap������:"+tmap);
      key=tmap.firstKey();
      System.out.println("��0�Ӥ���= "+key+", "+tmap.get(key));
      key=tmap.lastKey();
      System.out.println("�̫�@�Ӥ���= "+key+", "+tmap.get(key));
      System.out.print("����"+k1+"�M"+k2+"������TreeMap=");
      System.out.println(tmap.subMap(k1,k2));
      System.out.print("�j�󵥩�"+k2+"��TreeMap=");
      System.out.println(tmap.tailMap(k2));
   }
}
