// app10_14, ��gObject���O�̪�toString() method
class Caaa
{
   private int num;

   public Caaa(int n)
   {
      num=n;
   }
   public String toString()    // ��gtoString() method
   {
      String str="toString() called, num="+num;
      return str;
   }
}
public class app10_14
{
   public static void main(String args[])
   {
      Caaa a=new Caaa(2);
      System.out.println(a.toString());   // �L�X����a�����e
   }
}

/* app10_14 OUTPUT---------
toString() called, num=2
-------------------------*/