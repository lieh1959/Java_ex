// app14_4, �N��Ƽg��w�İϤ�
import java.io.*;
public class app14_4
{
   public static void main(String args[]) throws IOException
   {
      FileWriter fw=new FileWriter("c:\\Java\\random.txt");
      BufferedWriter bfw=new BufferedWriter(fw);

      for(int i=1;i<=5;i++)
      {
         bfw.write(Double.toString(Math.random()));  // �g�J�üƨ�w�İ�
         bfw.newLine(); // �g�J����Ÿ�
      }
      bfw.flush();      // �N�w�İϤ�����Ƽg���ɮ׸�
      fw.close();       // �����ɮ�
   }
}