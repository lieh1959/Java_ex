// app14_1, �ϥ�FileReader���OŪ���ɮ�
import java.io.*;                // ���Jjava.io���O�w�̪��Ҧ����O
public class app14_1
{
   public static void main(String args[]) throws IOException
   {
      char data[]=new char[128]; // �إߥi�e��128�Ӧr�����}�C
      FileReader fr=new FileReader("c:\\Java\\train.txt");  // �إߪ���fr

      int num=fr.read(data);     // �N���Ū�J�r���}�Cdata��
      String str=new String(data,0,num);     // �N�r���}�C�ഫ���r��
      System.out.println("Characters read= "+num);
      System.out.println(str);

      fr.close();
   }
}

/* app14_1 OUTPUT------
Characters read= 29
�����֭��A�����֭�
�V�L���s�A���L�p��
�������F�X�ʨ�
---------------------*/