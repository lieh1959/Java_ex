// app14_6, Ū�J�P�g�J�G�i���ɮ�
import java.io.*;
public class app14_6
{
   public static void main(String args[]) throws IOException
   {
      FileInputStream fi=new FileInputStream("c:\\Java\\lena.gif");
      FileOutputStream fo=new FileOutputStream("c:\\Java\\my_lena.gif");

      System.out.println("file size="+fi.available()); // �L�X�ɮפj�p
      byte data[]=new byte[fi.available()];  // �إ�byte���A���}�Cdata

      fi.read(data);       // �N����Ū�Jdata�}�C
      fo.write(data);      // �Ndata�}�C�̪���Ƽg�J�s��my_lena.gif
      System.out.println("file copied and renamed");
      fi.close();
      fo.close();
   }
}

/* app14_6 OUTPUT-------
file size=72553
file copied and renamed
----------------------*/