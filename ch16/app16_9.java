// app16_9, �Hfor-each loop���XTreeSet����
import java.util.*;
public class app16_9
{
   public static void main(String args[])
   {
      TreeSet<String> tset=new TreeSet<String>();
      tset.add("Monkey");           // �W�[����
      tset.add("Bunny");
      tset.add("Puppy");
      tset.add("Kitty");
      System.out.print("TreeSet���e:");

      for(String i:tset)            // ���X
         System.out.print(i+" ");
   }
}
