// app9_19, �_�����O
class CBox                 // �~�����O
{
   private int length;     // CBox���O���󪺪�
   private int width;      // CBox���O���󪺼e
   private int height;     // CBox���O���󪺰�
   private CColor cr;      // CColor���O�������ܼ�cr�A�ΨӪ���C��

   public CBox(int l,int w,int h,String col)    // CBox�غc��
   {
      length=l;
      width=w;
      height=h;
      cr=new CColor(col);        // ��new�إ�CColor����
   }
   class CColor               // �������O
   {
      private String color;

      public CColor(String clr)     // CColor�غc��
      {
         color=clr;
      }
      public void show_color()      // ����C��
      {
         System.out.println("color="+color);
      }
   }
   public void show()            // �~�����OCBox���������
   {
      System.out.println("length="+length);
      System.out.println("width="+width);
      System.out.println("height="+height);
      cr.show_color();
   // System.out.println("color="+cr.color);
   }
}

public class app9_19
{
   public static void main(String args[])
   {
      CBox box=new CBox(2,3,4,"Blue");
      box.show();
   }
}

/* app9_19 OUTPUT---
length=2
width=3
height=4
color=Blue
------------------*/
