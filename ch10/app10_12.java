// app10_12, �Q��equals()�ӧP�O������O�ܼƩҫ��V���O�_���P�@�Ӫ���
class Caaa              // �w�qCaaa���O
{
   private int num;

   public Caaa(int n)
   {
      num=n;
   }
}
public class app10_12
{
   public static void main(String args[])
   {
      Caaa a=new Caaa(5);
      Caaa b=new Caaa(5);
      Caaa c=a;          // �ŧi���O�ܼ�c�A���������V�ܼ�a�ҫ��V������
      boolean br1=a.equals(b);   // ����a�Pb�O�_���V�P�@����
      boolean br2=a.equals(c);   // ����a�Pc�O�_���V�P�@����
      System.out.println("a.equals(b)="+br1);
      System.out.println("a.equals(c)="+br2);
   }
}

/* app10_12 OUTPUT---
a.equals(b)=false
a.equals(c)=true
-------------------*/
