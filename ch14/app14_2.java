// app14_2, �ϥ�FileWriter���O�N��Ƽg�J�ɮפ�
import java.io.*;
public class app14_2
{
   public static void main(String args[]) throws IOException
   {
      FileWriter fw=new FileWriter("c:\\Java\\proverb.txt");
      char data[]={'T','i','m','e',' ','f','l','i','e','s','!','\r','\n'};
      String str="End of file";
      fw.write(data);         // �N�r���}�C�g���ɮ׸�
      fw.write(str);          // �N�r��g���ɮ׸�
      fw.close();
   }
}