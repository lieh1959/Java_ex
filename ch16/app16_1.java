// app16_1, ²�檺�d��
import java.util.*;
public class app16_1
{
   public static void main(String args[])
   {
      HashSet<String> hset=new HashSet<String>();

      hset.add("Monkey");     // �W�[����
      hset.add("Bunny");      // �W�[����
      hset.add("Monkey");     // �W�[����

      System.out.println("HashSet���e:"+hset); // ��ܶ��X���󪺤��e
   }
}


/* app16_1 OUTPUT------------
HashSet���e:[Bunny, Monkey]
---------------------------*/