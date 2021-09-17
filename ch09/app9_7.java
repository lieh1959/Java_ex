// app9_7,�u���O��ơv���ϥ�
class CCircle                 // �w�q���OCCircle
{
   private static int count=0;      // �ŧicount���u���O�ܼơv
   private static double pi=3.14;   // �ŧipi���u���O�ܼơv
   private double radius;

   public CCircle()           // �S���޼ƪ�CCircle()�غc��
   {
      this(1.0);              // �I�s��12�檺�غc���A�öǤJ1.0
   }
   public CCircle(double r)      // ���@�Ӥ޼ƪ�CCircle()�غc��
   {
      radius=r;
      count++;                   // ���غc���Q�I�s�ɡAcount�K�[1
   }
   public void show()
   {
      System.out.println("area="+pi*radius*radius);
   }
   public static void show_count()  // ��ܥثe����إߪ��Ӽ�
   {
      System.out.println(count+" object(s) created");
   }
}
public class app9_7
{
   public static void main(String args[])
   {
      CCircle.show_count();      // ��CCircle���O�I�sshow_count()
      CCircle cir1=new CCircle();      // �I�s��8�檺�غc��
      CCircle.show_count();      // ��CCircle���O�I�sshow_count()
      CCircle cir2=new CCircle(2.0);   // �I�s��12�檺�غc��
      CCircle cir3=new CCircle(4.3);   // �I�s��12�檺�غc��
      cir3.show_count();         // ��cir3����I�sshow_count()
   }
}

/* app9_7 OUTPUT--------
0 object(s) created
1 object(s) created
3 object(s) created
----------------------*/