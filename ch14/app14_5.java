// app14_5, �Q��FileInputStreamŪ���ɮ�
import java.io.*;
public class app14_5
{
   public static void main(String args[]) throws IOException
   {
      FileInputStream fi=new FileInputStream("c:\\Java\\train.txt");
      System.out.println("file size="+fi.available());
      byte ba[]=new byte[fi.available()]; // �إ�byte�}�C

      fi.read(ba);  // �NŪ�������e�g��}�Cba��
      System.out.println(new String(ba)); // �L�X�}�Cba�����e
      fi.close();
   }
}

/* app14_5 OUTPUT----
file size=54
�����֭��A�����֭�
�V�L���s�A���L�p��
�������F�X�ʨ�
--------------------*/