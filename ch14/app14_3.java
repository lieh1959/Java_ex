// app14_3, �q�w�İϸ�Ū�J���
import java.io.*;
public class app14_3
{
   public static void main(String args[]) throws IOException
   {
      String str;
      int count=0;
      FileReader fr=new FileReader("c:\\Java\\number.txt");
      BufferedReader bfr=new BufferedReader(fr);

      while((str=bfr.readLine())!=null)   // �C��Ū���@��A�����ɮ׵���
      {
         count++;                   // �p��Ū�������
         System.out.println(str);
      }
      System.out.println(count+" lines read");

      fr.close();                   // �����ɮ�
   }
}

/* app14_3 OUTPUT---
12
34
63
14
16
56
6 lines read
-------------------*/